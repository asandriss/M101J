package com.tengen;

import freemarker.template.Configuration;
import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

/**
 * Created by FedorH on 27.5.14..
 */
public class HelloWorldSparkFreemarkerStyle {
    public static void main(String[] args) {
        Configuration configuration = new Configuration();
        configuration.setClassForTemplateLoading(
                HelloWorldFreemarkerStyle.class, "/");


        Spark.get(new Route("/") {
            @Override
            public Object handle(Request request, Response response) {
                return "Hello world from Spark!";
            }
        });
    }
}
