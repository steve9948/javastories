package com.example.creatorstore;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CreatorStoreApplication {
    static {
        //configure dotenv
        Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
        dotenv.entries().forEach((entry) -> System.setProperty(
                entry.getKey(), entry.getValue()));
    }

    public static void main(String[] args) {
        SpringApplication.run(CreatorStoreApplication.class, args);
    }

}
