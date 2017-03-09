package httpclient;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class IOUtils
{

    public static String toString(InputStream content, String string) throws Exception
    {
        // TODO Auto-generated method stub
        
        BufferedReader reader = new BufferedReader(new InputStreamReader(content, string));
        String line;
        String result = "";
        while ((line = reader.readLine()) != null) {
            result += line;
        }
        
        
        return null;
    }

    
}
