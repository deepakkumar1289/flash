package com.coursecube.bookstoreweb;

import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMyBookStoreWeb implements CommandLineRunner {
static Logger log=LoggerFactory.getLogger(StartMyBookStoreWeb.class);
public static void main(String args[]) {
log.info(" BookStoreWeb - Begin ");
SpringApplication.run(StartMyBookStoreWeb.class, args);
log.info(" BookStoreWeb - End ");
}
public void run(String... args) throws Exception {
//Start-UP Tasks
log.info(" BookStoreWeb - Launched.... ");
}
} 
