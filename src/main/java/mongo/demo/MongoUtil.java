package mongo.demo;
import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;


public class MongoUtil {
	
	public static MongoDatabase getDatabase(String host,int port,String baseName){
		MongoClient mongoClient = getClient(host,port);
		MongoDatabase dataBase = mongoClient.getDatabase(baseName);
		return dataBase;
	}
	
	public static MongoDatabase getDefaultDatabase(){
		return getDatabase("localhost",27017,"mongoTest");
	}
	
	public static MongoClient getClient(String host,int port){
		MongoClient mongoClient = new MongoClient(host,port);
		return mongoClient;
	}

	public static void main( String args[] ){
	      try{   
	       // 连接到 mongodb 服务
	         MongoClient mongoClient = new MongoClient( "localhost" , 27017 );
	       
	         // 连接到数据库
	         MongoDatabase mongoDatabase = mongoClient.getDatabase("mycol");  
	         
	         MongoCollection<Document> collection = mongoDatabase.getCollection("peron");
	       System.out.println("Connect to database successfully");
	        
	      }catch(Exception e){
	        System.err.println( e.getClass().getName() + ": " + e.getMessage() );
	     }
	   }	
}
