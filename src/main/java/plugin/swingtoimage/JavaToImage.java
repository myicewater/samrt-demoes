package plugin.swingtoimage;

import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.net.URL;

import javax.imageio.ImageIO;
import javax.swing.JEditorPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class JavaToImage
{

    /**
     * @param args
     */
    public static void main(String[] args)throws Exception 
    {
        // TODO Auto-generated method stub
      //load the webpage into the editor
        //JEditorPane ed = new JEditorPane(new URL("http://www.google.com"));
        JEditorPane ed = new JEditorPane(new URL("http://www.baidu.com"));
        System.out.println("10");
        Thread.sleep(10000);
        ed.setSize(1000,1000);
 
        //create a new image
        BufferedImage image = new BufferedImage(ed.getWidth(), ed.getHeight(),
                                                BufferedImage.TYPE_INT_ARGB);
 
        //paint the editor onto the image
        SwingUtilities.paintComponent(image.createGraphics(), 
                                      ed, 
                                      new JPanel(), 
                                      0, 0, image.getWidth(), image.getHeight());
        //save the image to file
        ImageIO.write((RenderedImage)image, "png", new File("html.png"));
            System.out.println("ok");
    }

}
