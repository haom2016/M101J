package com.mongodb;

import spark.Request;
import spark.Response;
import spark.Route;
import spark.Spark;

import java.util.Objects;

/**
 * Created by haom on 3/17/15.
 */
public class HelloWorldSparkStyle {
    public static void main(String[] args) {
        Spark.get("/", new Route() {
            @Override
            public Object handle(Request request, Response response) throws Exception {
                return "Hello World!";
            }
        });
    }
}
