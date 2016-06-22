package queue;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.ExceptionListener;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;

import org.apache.activemq.ActiveMQConnectionFactory;
import org.apache.qpid.jms.JmsConnectionFactory;

public class Consumer implements MessageListener,ExceptionListener{
	
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

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ConnectionFactory factory =  new ActiveMQConnectionFactory(uri);
		Connection connection = factory.createConnection();
		connection.start();
		Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
		Destination dest = session.createQueue("greating");
		MessageConsumer consumer = session.createConsumer(dest);
		System.out.println("listening..");
		consumer.setMessageListener(new MessageListener() {
			
			@Override
			public void onMessage(Message message) {
				// TODO Auto-generated method stub
				TextMessage msg =(TextMessage)message;
				try {
					System.out.println("receive msg:"+msg.getText());
				} catch (JMSException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});
	}

	@Override
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		TextMessage msg =(TextMessage)message;
		try {
			System.out.println("receive msg:"+msg.getText());
		} catch (JMSException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void onException(JMSException exception) {
		// TODO Auto-generated method stub
		System.out.println("exception occur");
	}

}
