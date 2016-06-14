package mongo.demo;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.bson.Document;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;


public class DocumentTest {
	
	private static final MongoDatabase dataBase = MongoUtil.getDefaultDatabase();
	
	public static void addDocuments(){
		MongoCollection<Document> collection = dataBase.getCollection("person");
		
		List<Document> documents =  new ArrayList<Document>();
		
		Document document ;
		Random random = new Random();
		long startTime = System.currentTimeMillis();
		System.out.println("startTime:"+startTime);
		for(int i=0;i<20000;i++){
			document = new Document();
			document.append("name", "name"+i);
			
			document.append("age", 28);
			document.append("phone", "18311494736");
			document.append("address", "长安大街新华路165号");
			document.append("sex", "0");
			document.append("createTime", new Date());
			
			documents.add(document);
			//collection.insertOne(document);
		}
		collection.insertMany(documents);
		long endTime = System.currentTimeMillis();
		System.out.println("endTime:"+endTime);
		System.out.println("插入数据耗时:"+(endTime - startTime)/1000 + " 秒");
		
	}
	
	public static void  getDocumet(){
		MongoCollection<Document> collection = dataBase.getCollection("person");
		
		System.out.println("数据量:"+collection.count());
		
		long startTime = System.currentTimeMillis();
		 FindIterable<Document> findIterator = collection.find();
		 MongoCursor<Document> iterator =findIterator.iterator();
		 long endTime = System.currentTimeMillis();
			System.out.println("查询数据耗时:"+(endTime - startTime)/1000 + " 秒");
//		 while(iterator.hasNext()){
//			 System.out.println(iterator.next());
//		 }
		
	}

	public static void main(String[] args) {
		addDocuments();
		
		//getDocumet();

	}

}
