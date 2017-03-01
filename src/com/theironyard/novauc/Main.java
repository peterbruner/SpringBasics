package com.theironyard.novauc;

import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {
    

    static User user;
    static Notes handwritten;

    public static void main(String[] args) {

        Spark.init();

        Spark.get("/", ((request, response) -> {
            HashMap hashBrowns = new HashMap();
            System.out.println("fresh page");
            if(user == null /*user.equals("billyrayvalentine"*/) {
                return new ModelAndView(hashBrowns, "index.html");
            } else {
                hashBrowns.put("nombre", user.getNombre());
                //System.out.println("hopefully that entered the hashmap!");
                return new ModelAndView(hashBrowns, "messages.html");
            }
        }),
                new MustacheTemplateEngine()

        );System.out.println("mr mustachio has arrived?");

        Spark.post("/create-user", ((request, response) -> {
            System.out.println("accessed create user");
            String nomDeGuerre = request.queryParams("createUser");
            user = new User(nomDeGuerre);
            response.redirect("/");
            return "";
            })
        );

        Spark.post("/create-message", (((request, response) -> {
            //System.out.println("accessed create message");
            String loveletter = request.queryParams("createMessage");
            handwritten = new Notes(loveletter);
            System.out.println(handwritten.aVector.g);
            response.redirect("/");
            return "";
        }))
        );
    }
}
