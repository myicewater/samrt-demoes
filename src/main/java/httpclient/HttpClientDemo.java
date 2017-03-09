package httpclient;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
public class HttpClientDemo
{

    /**
     * @param args
     * @throws IOException 
     * @throws ClientProtocolException 
     */
    public static void main(String[] args) throws ClientProtocolException, IOException
    {
        DefaultHttpClient httpClient = new DefaultHttpClient();
        HttpGet httpGet = new HttpGet("https://passporti.dev.goago.cn/mobile/sendShortMessage.do?mobilePhone=18311494736&channelType=guide");
        //httpGet.setHeader("", "");        
        HttpResponse response = httpClient.execute(httpGet);
        HttpEntity entity = response.getEntity();
        System.out.println(EntityUtils.toString(entity, "UTF-8"));
    }

}
