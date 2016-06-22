package activemq;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.qpid.jms.JmsConnectionFactory;

public class MyPublisher {

	private static final  String uri = "amqp://" + "localhost" + ":" + 5672;
	private static final String user = "admin";
	private static final String pass = "password";
	
	public static JmsConnectionFactory getConnectionFactory(String uri,String user,String pass){
		JmsConnectionFactory factory = new JmsConnectionFactory(user,pass,uri);
		return factory;
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		JmsConnectionFactory factory = getConnectionFactory(uri, user, pass);
		Connection connection = factory.createConnection();
		connection.start();
		
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Destination dest = session.createTopic("girl");
		
		MessageProducer pd = session.createProducer(dest);
		
		for(int i=0;i<5;i++){
			TextMessage message = session.createTextMessage("mari:"+i);
			System.out.println("send:"+message.getText());
			pd.send(message);
			Thread.sleep(2000);
		}
		
		TextMessage message = session.createTextMessage("over");
		pd.send(message);
		Thread.sleep(2000);
		connection.close();
		
	}

}
