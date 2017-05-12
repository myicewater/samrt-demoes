package plugin.html2image;

import gui.ava.html.image.generator.HtmlImageGenerator;

public class Html2Image
{

    /**
     * @param args
     */
    public static void main(String[] args)
    {
        HtmlImageGenerator imageGenerator = new HtmlImageGenerator();  
        String html= "<!DOCTYPE html PUBLIC '-//W3C//DTD XHTML 1.0 Transitional//EN' 'http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd'>"
                    +" <html xmlns='http://www.w3.org/1999/xhtml'>"
                    +"<style>.p1 {font-size:36px;font-weight:200;color:#0000FF;}</style>"
                    +"<style>.p2 { font-size:24px;font-weight:300;color: #FF0000;}</style>"
                    +"<head><meta http-equiv='Content-Type' content='text/html; charset=utf-8' /><title>CSS外联样式表</title></head>"
                    +"<body><p class='p1'>CSS外联样式表</p><p class='p2'>CSS外联样式表</p><p class='p3'>CSS外联样式表</p><p class='p4'>CSS外联样式表 </p></body></html>";
        //imageGenerator.loadHtml(html);  
        imageGenerator.loadUrl("http://localhost/zd/a4.html");   
        //imageGenerator.loadUrl("http://www.icbc.com.cn/ICBC/%E7%BD%91%E4%B8%8A%E5%9F%BA%E9%87%91/%E5%9F%BA%E9%87%91%E5%B9%B3%E5%8F%B0/%E5%9F%BA%E9%87%91%E4%BA%A7%E5%93%81%E5%88%97%E8%A1%A8.htm");   
        imageGenerator.saveAsImage("d:/hello-world.png");  
        imageGenerator.saveAsImage("d:/hello-world.jpg");  
        // imageGenerator.saveAsHtml("d:/test/hello.html", html);  

    }

}
