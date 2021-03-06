package com.stalowy.ocrplapp;

import org.apache.log4j.BasicConfigurator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OcrSpringApplication {

    public static void main(String[] args) {
        System.setProperty("jna.library.path", "src/main/resources/lib/tess4j/win32-x86-64");
        System.setProperty("java.library.path", "src/main/resources/lib/tess4j/win32-x86-64");
        SpringApplication.run(OcrSpringApplication.class, args);
        BasicConfigurator.configure();
  }


}
