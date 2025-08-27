package se.systementor.unittester.services;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import se.systementor.unittester.UnittesterApplication;

@SpringBootApplication
public class UnitTesterApplication {

    public static void main(String[] args) {
        SpringApplication.run(UnittesterApplication.class, args);
    }

}
