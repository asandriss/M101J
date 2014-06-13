package com.tengen;


import com.mongodb.BasicDBObject;

import java.util.Arrays;

/**
 * Created by FedorH on 14.6.14..
 */
public class DocumentRepresentationTest {
    public static void main(String[] args) {
        BasicDBObject doc = new BasicDBObject();
        doc.put("userName", "fedor");
        doc.put("birthDate", 234832423);
        doc.put("programmer", true);
        doc.put("age", 6);
        doc.put("languages", Arrays.asList("Java", "C#"));
        doc.put("address", new BasicDBObject("street", "20 Main")
            .append("town", "Novi Sad")
            .append("zip", "21000"));
    }
}
