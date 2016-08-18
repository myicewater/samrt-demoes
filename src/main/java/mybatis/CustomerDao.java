package mybatis;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;




import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
public class CustomerDao {
	public CustomerDao() {
	}


	@Test
	public void findCustomer() {


		//SqlSessionFactory ssf = null;
		SqlSession sqlSession = null;
		try {
			//ssf = SessionFactoryUtil.getSqlSessionFactoryIntance();
			sqlSession = SessionFactoryUtil.getSqlSessionIntance();
			System.out.println(sqlSession); //每次都是新建一个SqlSession实例org.apache.ibatis.session.defaults.DefaultSqlSession@dc57db
			
			//sqlSession = SessionFactoryUtil.getSqlSessionIntance();
			//System.out.println(sqlSession); //每次都是新建一个SqlSession实例org.apache.ibatis.session.defaults.DefaultSqlSession@c24c0
			
			//resultType="hashmap"  返回类型为 Map<id,Map<列名，值>>
			Map<Object, Object> customerMap = (Map<Object, Object>) sqlSession.selectMap("selectCustomerAll2", "id");
			System.out.println("customerMap : " + customerMap);
			for(Map.Entry<Object, Object> customerSingle : customerMap.entrySet()) {
				System.out.println("customerMap : " + customerSingle);
				System.out.println("customerMap_Key : " + customerSingle.getKey());
				System.out.println("customerMap_Value : " + customerSingle.getValue());
				@SuppressWarnings("unchecked")
				Map<Object, Object> map = (Map<Object, Object>) customerSingle.getValue();
				System.out.println("Name : " + map.get("name"));
			}
			
			//resultType="Customer" 自动封装成 list
			//如果没有查到数据，返回长度为0的list
			//List<Customer> customerList = sqlSession.selectList("selectCustomerAll");
			
			//测试 bind 用于  like 查询
			Customer customerBind = new Customer("Man",110,"service");
			List<Customer> customerList = sqlSession.selectList("selectCustomerByBind", customerBind);

			System.out.println("customerList : " + customerList);
			System.out.println("customerList : " + customerList.size());
			
			List<Customer> customerList1 = new ArrayList<Customer>();
			System.out.println("customerList1 : " + customerList1);
			System.out.println("customerList1 : " + customerList1.size());
			
			for (Customer customer : customerList) {
				System.out.println(customer);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(sqlSession != null) {
				sqlSession.close();
			}
		}


	}


	@Test
	public void saveCustomer() {
		
		SqlSession sqlSession = null;
		try {
			sqlSession = SessionFactoryUtil.getSqlSessionIntance();
			
			Customer customer = new Customer("herry",110,"service");
			int id = sqlSession.insert("saveCustomer", customer); //返回影响的行数
			System.out.println(id);
			System.out.println(customer.getId()); //id 已经被set为 自增长的 key
			
			sqlSession.commit();
		} catch (Exception e) {
			e.printStackTrace();
			sqlSession.rollback();
		}finally {
			sqlSession.close();
		}
	}
}


