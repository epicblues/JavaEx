package com.javaex.nosql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.bson.Document;
import org.bson.conversions.Bson;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;
import com.mongodb.client.result.DeleteResult;
import com.mongodb.client.result.UpdateResult;

public class MongodbTest {

	static String MONGODB_IP = "127.0.0.1";
	static int MONGODB_PORT = 27017;
	static String DB_NAME = "javaMongo";
	static String COLL_NAME = "testCollection";
	
	public static void main(String[] args) {
//		testUpdateMany();
//		connect();
//		testInsert();
//		testInsert();
//		testUpdateOne();

//		testInsertMany();
//		testFindFirst();

//		testDelete();
//		testDeleteAll();
//		
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		testFindAll();
//		testFindFilter();
//		testDeleteAll();
	}
	
	//여러 문서 업데이트
	private static void testDeleteAll() {
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		DeleteResult res = collection.deleteMany(new Document());
		System.out.println(res.getDeletedCount() + "개 레코드 삭제");
		
	}
	private static void testUpdateMany() {
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		Bson filter = Filters.eq("species", "인간");
		Bson doc = new Document("$set", new Document("method", "updateMany")
				.append("updateDate", new Date()));
		
		UpdateResult res = collection.updateMany(filter, doc);
		System.out.println("업데이트 된 doc 개수 : " +  res.getModifiedCount());
	}
	
	private static void testFindFilter() {
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		
		// 필터 생성
//		Bson bsonFilter = Filters.eq("species","인간");
		// 복합 조건
		// spicies가 인간이거나, gender가 여성인 것
		Bson bsonFilter = Filters.or(Filters.eq("species","인간"),Filters.eq("gender","여성"));
		
		MongoCursor<Document> cursor = collection.find(bsonFilter).iterator();
		while(cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc.toJson());
		}
		cursor.close();
	}

	private static void testDelete() {
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		collection.deleteOne(new Document("name", "영희"));
	}
	
	
	
	private static void testInsertMany() {
		// 여러 Document Insert
		// InsertMany(배열);
		
		List<Document> list = new ArrayList<Document>();
		// 문서를 생성해서 리스트에 추가해주기
		list.add(new Document("name", "고길동")
				.append("species", "인간")
				.append("gender", "남성"));
		list.add(new Document("name", "도우너")
				.append("species", "외계인")
				.append("gender", "남성"));
		list.add(new Document("name", "또치")
				.append("species", "조류")
				.append("gender", "여성"));
		list.add(new Document("name", "영희")
				.append("species", "인간")
				.append("gender", "여성"));
		
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		collection.insertMany(list);
		
		
	}
	
	
	private static MongoCollection<Document>
		getCollection (String dbName, String collName) {
		// DB 접속
		MongoClient client = connect();
		
		// DB 선택
		MongoDatabase db = client.getDatabase(dbName);
		MongoCollection<Document> collection = db.getCollection(collName);
		System.out.println(collection);
		return collection;
	}
	
	private static void testFindAll() {
		MongoCollection<Document> collection= getCollection(DB_NAME, COLL_NAME);
		// find 메서드는 Cursor를 반환
		MongoCursor<Document> cursor = collection.find().iterator();
		while(cursor.hasNext()) {
			// 커서 뒤로 이동
			Document doc = cursor.next();
			//Document 출력
			System.out.println("DOC : " + doc);
			//필드 확인 get("필드명");
			System.out.printf("%s, %s, %s, %s%n",
					doc.get("name"), doc.get("gender"), doc.get("species"),doc.get("age"));
			// Document -> JSON 출력 : toJSON
			System.out.println("JSON : " + doc.toJson());
		}
		// 루프를 다 돌렸으면 커서 닫기
		cursor.close();
	}
	
	private static void testFindFirst() {
		MongoCollection<Document> collection= getCollection(DB_NAME, COLL_NAME);
		//find() 는 cursor를 반환시킨다.
		//first()는 cursor의 첫 번째 위치 문서
		Document doc = collection.find().first();
		//Document 출력
		System.out.println("DOC : " + doc);
		//필드 확인 get("필드명");
		System.out.printf("%s, %s, %s, %s%n",
				doc.get("name"), doc.get("gender"), doc.get("species"),doc.get("age"));
		// Document -> JSON 출력 : toJSON
		System.out.println("JSON : " + doc.toJson());
	}
	
	private static void testInsert() {
		// JSON(BSON)이 없으므로 mongodblib를 통해 document 객체를 만들어야 한다.
		Document doc = new Document("name", "둘리")
				.append("gender","남성")
				.append("species", "공룡");
		
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		collection.insertOne(doc);
		
	}
	
	
	
	private static void testUpdateOne() {
//		Document condition = new Document("name", "둘리");
//		Document updateFilter = new Document("$set", new Document("age",15));
		
		MongoCollection<Document> collection = getCollection(DB_NAME, COLL_NAME);
		
		// 업데이트 조건
		Bson filter = Filters.eq("species", "인간");
		// 갱신 내역
		Bson doc = new Document("$set", new Document("method", "updateOne"));
		UpdateResult res = collection.updateOne(filter, doc);
		System.out.println(res.getModifiedCount() + "개 업데이트");
		
		
	}
	
	
	private static MongoClient connect() {
//		MongoClient client = MongoClients.create(); // localhost:27017일 경우 default로 접근하는 방법
//		
		MongoClient client = MongoClients.create(
				// 접속 정보가 기본 정보가 아닐 때
				MongoClientSettings.builder()
					.applyToClusterSettings(builder -> 
							builder.hosts(Arrays.asList(new ServerAddress(MONGODB_IP,MONGODB_PORT)))).build()
				);
		System.out.println(client);
		return client;
	}

}
