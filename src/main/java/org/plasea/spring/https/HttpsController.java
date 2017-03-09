package org.plasea.spring.https;

import httpclient.HttpClientUtil;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HttpsController
{

    @RequestMapping("/test")
    @ResponseBody
    public Map sentMsgCodeTest(HttpServletRequest request,HttpServletResponse response){
        String mobile = request.getParameter("mobile");
        HttpClientUtil hc = new HttpClientUtil();
        Map<String,String> createMap = new HashMap<String,String>();  
        createMap.put("mobilePhone",mobile);  
        createMap.put("channelType", "table_manage");
        
        String httpOrgCreateTestRtn =hc.doPost("https://passporti.dev.goago.cn/mobile/sendShortMessage.do", createMap, "UTF-8");
        Map result = new HashMap();
        result.put("result", httpOrgCreateTestRtn);
        System.out.println("result:"+httpOrgCreateTestRtn);
        return result;
    }
}
