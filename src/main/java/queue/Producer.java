package queue;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.qpid.jms.JmsConnectionFactory;

public class Producer {
	
	//private static final  String uri = "amqp://" + "localhost" + ":" + 5672;
	private static final  String uri = "tcp://localhost:61616";
	private static final String user = "admin";
	private static final String pass = "password";
	
	
	public static JmsConnectionFactory getConnectionFactory(String uri,String user,String pass){
		JmsConnectionFactory factory = new JmsConnectionFactory(user,pass,uri);
		return factory;
	}
	
	public static JmsConnectionFactory getConnectionFactory(String uri){
		JmsConnectionFactory factory = new JmsConnectionFactory(uri);
		return factory;
	}
	

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		ConnectionFactory factory = new ActiveMQConnectionFactory(user,pass, uri);
		Connection connection = factory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		
		Destination dest = session.createQueue("greating");
		MessageProducer producer = session.createProducer(dest);
		
		TextMessage msg = session.createTextMessage("love u!");
		
		producer.send(msg);
		
		connection.close();
		
	}

}
