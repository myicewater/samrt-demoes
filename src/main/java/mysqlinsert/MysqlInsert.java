package mysqlinsert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;
import java.util.logging.SimpleFormatter;

import com.mysql.jdbc.PreparedStatement;

public class MysqlInsert
{
    
    public static int getRandomNum(int range){
        Random r = new Random();
        return r.nextInt(range);
        
    }
    
    public static String getUuid(){
        return UUID.randomUUID().toString().replace("-", "").toUpperCase();
    }
    
    public static long getTimestamp(){
        return System.currentTimeMillis();
    }
    
    public static String getRandomTypeChar(){
        String[] type = {"A","B","C","D","E","F","G","H","I","J"};
        int r = new Random().nextInt(10);
        return type[r];
    }
    
    public static float getRandomDouble(){
        Random r = new Random();
        return r.nextFloat()*100;
        
    }
    
    public static String getRandomZhName(){
        String[] type = {"中","华","人","民","共","和","国","毛","泽","东"};
        int r = new Random().nextInt(10);
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<4;i++)
            sb.append(type[getRandomNum(10)]);
        return new String(sb);
    }
    
    public static Connection getConnection(){
        final String url = "jdbc:mysql://read.mysql.goo.com:3306/gag_quick";
        final String name = "com.mysql.jdbc.Driver";
        final String user = "root";
        final String password = "system@123";
        Connection conn = null;
        try
        {
            Class.forName(name);
            conn = DriverManager.getConnection(url, user, password);
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
            System.out.println("类没找到");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        System.out.println("获取链接成功");
        return  conn;
        
    }
    
    public static void insertData(int times,int sizePerTime){
        Connection connection = getConnection();
        String prefix = "INSERT INTO `test`.`zhu_mysql_perfomance_test` ( `uuid`, `random_num`, `random_name`, `random_str`, `random_char`, `random_double`, `time_stamp`, `create_time`) VALUES ";
        
        try{
            
            connection.setAutoCommit(false);
            PreparedStatement ps = (PreparedStatement)connection.prepareStatement("");
            long startTime = System.currentTimeMillis();
            for(int i=0;i<times;i++){
                StringBuffer  data = new StringBuffer();
                for(int j=0;j<sizePerTime;j++){
                    data.append("('");
                    data.append(getUuid());
                    data.append("',");
                    data.append(getRandomNum(50));
                    data.append(",'");
                    data.append(getRandomZhName());
                    data.append("','");
                    data.append(getUuid());
                    data.append("','");
                    data.append(getRandomTypeChar());
                    data.append("',");
                    data.append(getRandomDouble());
                    data.append(",");
                    data.append(getTimestamp());
                    data.append(",'");
                    data.append(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()) );
                    data.append("'),");
                }
                //System.out.println("sql:"+data);
                String sql = prefix + data.substring(0, data.length() - 1); 
                //
                ps.addBatch(sql);
                ps.executeBatch();
                connection.commit();
                
            }
            long endTime = System.currentTimeMillis();
            System.out.println("Time cousume:"+(endTime - startTime));
            ps.close();
            connection.close();
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    /**
     * @param args
     * @throws SQLException 
     */
    public static void main(String[] args) throws SQLException
    {
        insertData(8,100000);
    }

}
