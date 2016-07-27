package com.karolina;

import spark.Spark;

public class HelloMaven {

    public static void main(String[] args) {
        System.out.println("Hello Maven");

    	Spark.get("/hello", (req, res) -> {return "aaaa"; });
    }
}