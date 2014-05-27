package com.tengen;

import com.mongodb.*;

import java.net.UnknownHostException;

/**
 * Created by FedorH on 27.5.14..
 */
public class HelloWorldMongoDbStyle {
    public static void main(String[] args) throws UnknownHostException {
        // can be called without ServerAddress instance with default parameters.
        MongoClient client = new MongoClient(new ServerAddress("localhost", 27017));

        DB database = client.getDB("test");
        DBCollection collection = database.getCollection("hello");
        DBObject document = collection.findOne();
        System.out.println(document);
    }
}
