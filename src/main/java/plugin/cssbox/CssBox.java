package plugin.cssbox;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.fit.cssbox.demo.ImageRenderer;
import org.xml.sax.SAXException;

public class CssBox
{

    /**
     * @param args
     * @throws SAXException 
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException, SAXException
    {
        // TODO Auto-generated method stub
        ImageRenderer render = new ImageRenderer();
        System.out.println("kaishi");
        String url = "http://localhost/zd/a4.html";
        FileOutputStream out = new FileOutputStream(new File("d:\\html2.png"));
        render.renderURL(url, out, ImageRenderer.Type.PNG);
        System.out.println("OK");
    }

}
