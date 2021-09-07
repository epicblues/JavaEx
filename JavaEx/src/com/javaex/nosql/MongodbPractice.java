package com.javaex.nosql;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.regex.Pattern;


import org.bson.Document;

import com.mongodb.MongoClientSettings;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.model.Filters;



public class MongodbPractice {
	
	static String MONGODB_IP = "127.0.0.1";
	static int MONGODB_PORT = 27017;
	static String DB_NAME = "playground";
	static String DB_COLL = "playlist";
	
	
	
	public static void main(String[] args) {
//		insertMany();
//		findSome();
//		updateSome();
		findAll();
		
	}
	
	private static void updateSome() {
		MongoCollection<Document> collection = getCollection();
		collection.updateMany(Filters.and(new Document("name","kms"),new Document("age", new Document("$lt",60))),
				new Document("$set", new Document("age", 80)
						.append("power", "ulimate")
						.append("hoose", 24)));
	}
	
	private static void findSome() {
		MongoCollection<Document> collection = getCollection();
		MongoCursor<Document> cursor = collection.find(new Document("location", Pattern.compile("^\\w+\\d+\\w+$"))).iterator();
		while(cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
		}
	}
	
	private static void findAll() {
		MongoCollection<Document> collection = getCollection();
		MongoCursor<Document> cursor = collection.find().projection(
				new Document("_id",0)
				.append("name", 1)
				.append("location", 1)).iterator();
		while(cursor.hasNext()) {
			Document doc = cursor.next();
			System.out.println(doc);
		}
		cursor.close();
	}
	
	private static void insertMany() {
		MongoCollection<Document> collection = getCollection();
		List<Document> list = new ArrayList<Document>();
		list.add(new Document("name", "kms")
				.append("age", Math.floor(70 * Math.random()))
				.append("location", "SE02L")
				.append("uploadDate", new Date()));
		list.add(new Document("name", "park")
				.append("age", Math.floor(70 * Math.random()))
				.append("location", "DaeJeon")
				.append("uploadDate", new Date()));
		list.add(new Document("name", "susu")
				.append("age", Math.floor(70 * Math.random()))
				.append("location", "Japan")
				.append("uploadDate", new Date()));
		
		collection.insertMany(list);
	}
	
	
	private static MongoCollection<Document> getCollection() {
		
		MongoClient client = MongoClients.create(MongoClientSettings.builder()
				.applyToClusterSettings(
						build -> build.hosts(Arrays.asList(new ServerAddress(MONGODB_IP,MONGODB_PORT))))
				.build());
		MongoCollection<Document> collection = client.getDatabase(DB_NAME).getCollection(DB_COLL);
		return collection;
	}
	
	
}
