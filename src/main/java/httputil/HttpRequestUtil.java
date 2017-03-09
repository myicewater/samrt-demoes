package httputil;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.alibaba.fastjson.JSONObject;

public class HttpRequestUtil {




    /**
     * 向指定URL发送GET方法的请求
     * 
     * @param url
     *            发送请求的URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return URL 所代表远程资源的响应结果
     */
    public static String sendGet(String url, String param) {
        String result = "";
        BufferedReader in = null;
        try {
            String urlNameString = url + "?" + param;
            URL realUrl = new URL(urlNameString);
            // 打开和URL之间的连接
            URLConnection connection = realUrl.openConnection();
            // 设置通用的请求属性
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            connection.setRequestProperty("Referer", "https://passport.dev.goago.cn");
            // 建立实际的连接
            connection.connect();
            // 获取所有响应头字段
            Map<String, List<String>> map = connection.getHeaderFields();
            // 遍历所有的响应头字段
            for (String key : map.keySet()) {
                System.out.println(key + "--->" + map.get(key));
            }
            // 定义 BufferedReader输入流来读取URL的响应
            in = new BufferedReader(new InputStreamReader(
                    connection.getInputStream(),"UTF-8"));
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送GET请求出现异常！" + e);
            e.printStackTrace();
        }
        // 使用finally块来关闭输入流
        finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
        return result;
    }

    /**
     * 向指定 URL 发送POST方法的请求
     * 
     * @param url
     *            发送请求的 URL
     * @param param
     *            请求参数，请求参数应该是 name1=value1&name2=value2 的形式。
     * @return 所代表远程资源的响应结果
     */
    public static String sendPost(String url, String param) {
        PrintWriter out = null;
        BufferedReader in = null;
        String result = "";
        try {
            URL realUrl = new URL(url);
            // 打开和URL之间的连接
            URLConnection conn = realUrl.openConnection();
            // 设置通用的请求属性
            conn.setRequestProperty("accept", "*/*");
            conn.setRequestProperty("connection", "Keep-Alive");
            conn.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            conn.setDoOutput(true);
            conn.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            out = new PrintWriter(conn.getOutputStream());
            // 发送请求参数
            out.print(param);
            // flush输出流的缓冲
            out.flush();
            // 定义BufferedReader输入流来读取URL的响应
            in = new BufferedReader(
                    new InputStreamReader(conn.getInputStream(),"UTF-8")); //防止接收到中文乱码
            String line;
            while ((line = in.readLine()) != null) {
                result += line;
            }
        } catch (Exception e) {
            System.out.println("发送 POST 请求出现异常！"+e);
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(out!=null){
                    out.close();
                }
                if(in!=null){
                    in.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return result;
    }  
    
    
    public static void main(String[] args) {
       
        
        //发送 POST 请求
        
        //String sr=HttpRequestUtil.sendPost("http://192.168.5.139:8100/qweb/newRouter/getAouthUrl.do", "type=001&buuid=X342otkIhGqKJIksklsjltkgshsghilil&org_id=04");
        //String sr=HttpRequestUtil.sendPost("http://192.168.9.10:9003/qweb/newBillZgl/addDiscountBuyOrderRelation.do", "tradeId=889&discountBuyId=3:2");
        //String sr=HttpRequestUtil.sendPost("http://cd.dev.goago.cn/newBill/getBillBaseInfo.do", "tradeId=1AQBLQ9T7NR4CM001GKQESI585QVN9HQ&buuid=Z342GGGGGGGGGGGGklsjltsisqsthhjsj");
        //String sr=HttpRequestUtil.sendPost("http://cd.dev.goago.cn/newRouter/getAouthUrl.do", "type=001&buuid=3342otkIhGqKJIksklsjltkgshlhqilll&org_id=04");
        
        //String sr1=HttpRequestUtil.sendPost("http://code.test.goago.cn/barcode", "msg=6923450657438");
        //String sr1=HttpRequestUtil.sendPost("https://passport.gag.chinaums.com/mobile/sendShortMessage.do", "mobilePhone=18311494736&channelType=guide");
        //String sr=HttpRequestUtil.sendPost("http://cd.dev.goago.cn/newBillZgl/addDiscountBuyOrderRelation.do", "tradeId=888&discountBuyId=3:1");
        //String sr1= HttpRequestUtil.sendGet("https://api.douban.com/v2/book/search?q=%E5%93%88%E5%88%A9%E6%B3%A2%E7%89%B9&count=20","");
        //String sr1=HttpRequestUtil.sendGet("https://open.weixin.qq.com/connect/oauth2/authorize?appid=wx5b245e517ead1427&redirect_uri=http%3a%2f%2ff.dev.goago.cn%2f%23%2ftarget%2fget-wx-code%2fid%2fnull&response_type=code&scope=snsapi_base&state=wx5b245e517ead1427#wechat_redirect", null);
        //System.out.println("结果："+sr1);
        
        MoniData data = new MoniData();
        data.setCurrentUrl("www.baidu.com");
        data.setTrackId("tttttttttttttrrrrrr");
        
        List<ResourcePerformanceTiming> performanceResource  = new ArrayList<ResourcePerformanceTiming>();
        
        ResourcePerformanceTiming rp = new ResourcePerformanceTiming();
        rp.setConnectEnd(704.225);
        rp.setConnectStart(704.225);
        rp.setDecodedBodySize(7586);
        rp.setEntryType("resource");
        performanceResource.add(rp);
        
        PagePerformanceTiming performanceTiming = new PagePerformanceTiming();
        performanceTiming.setConnectEnd(BigInteger.valueOf(1478002093916L));
        performanceTiming.setConnectStart(BigInteger.valueOf(1478002093916L));
        performanceTiming.setUnloadEventEnd(BigInteger.valueOf(1478002094461L));
        performanceTiming.setUnloadEventStart(BigInteger.valueOf(1478002094452L));
        
        String currentUrl = "www.baidu.com";
        String trackId = "tttttttttttttrrrrrr";
        
        String url = "http://localhost:9003/qweb/performance/recordPerformanceData.do";
        
        String pr = JSONObject.toJSONString(performanceResource);
        String pt = JSONObject.toJSONString(performanceTiming);
        System.out.println("pr:"+pr);
        System.out.println("pt:"+pt);
        
        HttpRequestUtil.sendPost(url, "currentUrl="+currentUrl+"&trackId="+trackId+"&performanceResource="+pr+"&performanceTiming="+pt);
        
    }

}
