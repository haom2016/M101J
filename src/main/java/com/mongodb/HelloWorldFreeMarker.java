package com.mongodb;

import freemarker.template.*;

import java.io.StringWriter;
import java.util.Map;
import java.util.HashMap;

/**
 * Created by haom on 3/18/15.
 */
public class HelloWorldFreeMarker {
    public static void main(String[] args){
        Configuration configuration = new Configuration ();
        configuration.setClassForTemplateLoading(
                HelloWorldFreeMarker.class, "/"
        );
        try {
            Template helloTemplate = configuration.getTemplate("hello.ftl");
            StringWriter writer = new StringWriter();
            Map<String, Object> helloMap = new HashMap<String, Object>();

            helloMap.put("name", "Freemarker");

            helloTemplate.process(helloMap, writer);

            System.out.print(writer);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
