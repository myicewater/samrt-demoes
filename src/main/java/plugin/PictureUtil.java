package plugin;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.imageio.ImageIO;

import com.sun.image.codec.jpeg.JPEGCodec;
import com.sun.image.codec.jpeg.JPEGImageEncoder;

public class PictureUtil {

    private static void createImage(String fileLocation, BufferedImage image) {
        try {
            FileOutputStream fos = new FileOutputStream(fileLocation);
            BufferedOutputStream bos = new BufferedOutputStream(fos);
            JPEGImageEncoder encoder = JPEGCodec.createJPEGEncoder(bos);
            encoder.encode(image);
            bos.close();
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    
    public static void main(String[] args) throws IOException{
        List<Map> list = new ArrayList<Map>();
        
        Map<String, String> mapTitle1 = new HashMap<String, String>();
        mapTitle1.put("title", "使用人信息");
        list.add(mapTitle1);
        
        Map<String, String> map1 = new HashMap<String, String>();
        map1.put("客户姓名", "张三");
        map1.put("手机号", "123123");
        map1.put("身份证号", "230302198811241234");
        list.add(map1);
        
        Map<String, String> map2 = new HashMap<String, String>();
        map2.put("送货地址", "北京市海淀区知春路113号银网中心B座1009室");
        list.add(map2);
        
        Map<String, String> map3 = new HashMap<String, String>();
        map3.put("微信号码", "123123");
        map3.put("qq号码", "123123");
        map3.put("电子邮箱", "gaop@haierubic.com");
        list.add(map3);

        Map<String, String> mapTitle2 = new HashMap<String, String>();
        mapTitle2.put("title", "购买人信息");
        list.add(mapTitle2);
        
        Map<String, String> map4 = new HashMap<String, String>();
        map4.put("姓名", "张三朋友");
        map4.put("手机号", "15612341122");
        map4.put("身份证号", "230302198811241234");
        list.add(map4);

        Map<String, String> mapTitle3 = new HashMap<String, String>();
        mapTitle3.put("title", "产品信息");
        list.add(mapTitle3);

        Map<String, String> map5 = new HashMap<String, String>();
        map5.put("产品型号", "ALI88");
        map5.put("凭证类型", "发票");
        map5.put("购买日期", "2014-12-02");
        list.add(map5);

        Map<String, String> map6 = new HashMap<String, String>();
        map6.put("购买商城", "ALI88");
        map6.put("凭证编号", "发票");
        list.add(map6);

        int imageWidth = 1200;// 图片的宽度

        int imageHeight = 1000;// 图片的高度

        BufferedImage image = new BufferedImage(imageWidth, imageHeight,
                BufferedImage.TYPE_INT_RGB);
        Graphics graphics = image.getGraphics();
        graphics.setColor(Color.white);
        graphics.fillRect(0, 0, imageWidth, imageHeight);
        graphics.setColor(Color.black);

        int high = 100;
        int wigth = 0;
        graphics.setFont(new Font("宋体", Font.BOLD, 50));
        graphics.drawString("注册保单", 500, high);
        graphics.setFont(new Font("宋体", Font.BOLD, 20));
        
        
        high += 10;
        graphics.drawLine(50, high, 1150, high);
        
        high += 20;
        
        URL uri = new URL("http://diy.qqjay.com/u2/2012/0913/55a80cdb4fca56c77c12a38c079bf6ab.jpg");
        BufferedImage bi = ImageIO.read(uri);
        graphics.drawImage(bi , wigth, high, null);
        
        //透明图片
        URL uri2 = new URL("https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1490965002144&di=e51629f8a4417653a04186232e65a1f1&imgtype=0&src=http%3A%2F%2Fb.hiphotos.baidu.com%2Fzhidao%2Fwh%253D600%252C800%2Fsign%3Dd0123d16838ba61edfbbc0297104bb32%2Fac345982b2b7d0a26dd33f41caef76094a369ad7.jpg");
        File input = new File("D:\\ppp.png");
        BufferedImage bi2 = ImageIO.read(input );
        graphics.drawImage(bi2 , wigth, high, 300, 300, null);
        //graphics.drawImage(bi2 , wigth, high, null);
        high += 200;
        
        
        
        for(Map<String, String> rowMap : list){
            high += 50;
            wigth = 50;
            for(Map.Entry<String, String> entry : rowMap.entrySet()){
                String name = entry.getKey() + "：" + entry.getValue();
                if("title".equals(entry.getKey())){
                    high += 50;
                    graphics.setFont(new Font("黑体", Font.BOLD, 30));
                    graphics.drawString(entry.getValue(), wigth, high);
                    graphics.setFont(new Font("宋体", Font.BOLD, 20));
                } else {
                    graphics.drawString(name, wigth, high);
                    wigth += 400;
                }
                
            }
        }
        
        createImage("D://test1.jpg", image);
    
    }

}