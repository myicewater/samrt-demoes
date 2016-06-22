package activemq;

import javax.jms.Connection;
import javax.jms.Destination;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.qpid.jms.JmsConnectionFactory;

public class MyConsumer {

	private static final  String uri = "amqp://" + "localhost" + ":" + 5672;
	private static final String user = "admin";
	private static final String pass = "password";
	
	public static JmsConnectionFactory getConnectionFactory(String uri,String user,String pass){
		JmsConnectionFactory factory = new JmsConnectionFactory(user,pass,uri);
		return factory;
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		JmsConnectionFactory factory = getConnectionFactory(uri, user, pass);
		Connection connection = factory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination dest = session.createTopic("girl");
		MessageConsumer consumer = session.createConsumer(dest);
		System.out.println("I am listening");
		while(true){
			TextMessage message = (TextMessage)consumer.receive();
			System.out.println("receive:"+message.getText());
			if(message.getText().equals("over")){
				break;
			}
		}
		
		connection.close();
	}

}
