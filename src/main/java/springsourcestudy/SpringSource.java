package springsourcestudy;

import java.util.ArrayList;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringSource {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BeanFactory f;
		
		ApplicationContext a;
		
		XmlBeanFactory x;
		
		FileSystemXmlApplicationContext ff;
		System.out.println(Object.class.isAssignableFrom(ArrayList.class));
	}
	
	<T> T getDed(){
		Object o = new Object();
		return (T)( o);
	}

}
