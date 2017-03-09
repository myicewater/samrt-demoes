package org.plasea.spring.util;



import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

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
    public String doPost(String url, Map<String, String> map, String charset, Map<String,String> headerMap)
    {
        HttpClient httpClient = null;
        HttpPost httpPost = null;
        String result = null;
        try
        {
            httpClient = new SSLClient();
            httpPost = new HttpPost(url);
            Set<String> keySet = headerMap.keySet();
            for(String key : keySet){
                httpPost.setHeader(key,headerMap.get(key));
            }
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
        String url = "https://passport.dev.goago.cn/mobile/sendShortMessage.do";  
        //String url = "https://passport.dev.goago.cn/mobile/getShopEntities.do";  
        Map<String,String> createMap = new HashMap<String,String>();  
        createMap.put("mobilePhone","15901256925");  
        createMap.put("channelType", "guide");
        //createMap.put("mobile_token", "1ASGNN4B1OF19E001GKNQO3E98CD4KSQ");
        Map<String,String> headerMap = new HashMap<String,String>();  
        headerMap.put("Referer", "https://qweb.dev.goago.cn/");
        String httpOrgCreateTestRtn = httpClientUtil.doPost(url,createMap,"utf-8",headerMap);  
        System.out.println("result:"+httpOrgCreateTestRtn);
    }
}
