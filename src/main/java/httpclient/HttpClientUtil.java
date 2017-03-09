package httpclient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class HttpClientUtil
{
    public String doPost(String url, Map<String, String> map, String charset)
    {
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try
        {
            httpClient = new SSLClient();
            httpPost = new HttpPost(url);
            httpPost.setHeader("Referer", "https://passport.dev.goago.cn/list.html");
            //设置参数  
            List<NameValuePair> list = new ArrayList<NameValuePair>();
            Iterator iterator = map.entrySet().iterator();
            while (iterator.hasNext())
            {
                Entry<String, String> elem = (Entry<String, String>) iterator.next();
                list.add(new BasicNameValuePair(elem.getKey(), elem.getValue()));
            }
            if (list.size() > 0)
            {
                UrlEncodedFormEntity entity = new UrlEncodedFormEntity(list, charset);
                httpPost.setEntity(entity);
            }
            HttpResponse response = httpClient.execute(httpPost);
            if (response != null)
            {
                HttpEntity resEntity = response.getEntity();
                if (resEntity != null)
                {
                    result = EntityUtils.toString(resEntity, charset);
                }
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        return result;
    }
    
    public static void main(String[] args)
    {
        HttpClientUtil httpClientUtil = new HttpClientUtil();
        String url = "https://passporti.dev.goago.cn/mobile/sendShortMessage.do";  
        Map<String,String> createMap = new HashMap<String,String>();  
        createMap.put("mobilePhone","18311494736");  
        createMap.put("channelType", "guide");
         
        String httpOrgCreateTestRtn = httpClientUtil.doPost(url,createMap,"utf-8");  
        System.out.println("result:"+httpOrgCreateTestRtn);
    }
}
