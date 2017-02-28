package com.theironyard.novauc;

import spark.ModelAndView;
import spark.Spark;
import spark.template.mustache.MustacheTemplateEngine;

import java.util.HashMap;

public class Main {

    static User user;

    public static void main(String[] args) {

        Spark.init();

        Spark.get("/", ((request, response) -> {
            HashMap hashBrowns = new HashMap();
            if(user == null) {
                return new ModelAndView(hashBrowns, "index.html");
            } else {
                hashBrowns.put("name", user.getName());
                return new ModelAndView(hashBrowns, "messages.html");
            }

        }),
                new MustacheTemplateEngine()
        );

        Spark.post("/login", ((request, response) -> {
            String name = request.queryParams("loginName");

            user = new User(name);
            response.redirect("/");
            return "";
            })

        );

        //Spark.post("/create-user");
    }
}
