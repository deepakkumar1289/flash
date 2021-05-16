package com.coursecube.booksearch;

import org.slf4j.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartMyBookSearchMS implements CommandLineRunner {
static Logger log=LoggerFactory.getLogger(StartMyBookSearchMS.class);
public static void main(String args[]) {
log.info(" BookSearchMS - Begin ");
SpringApplication.run(StartMyBookSearchMS.class, args);
log.info(" BookSearchMS - End ");
}
public void run(String... args) throws Exception {
//Start-UP Tasks
log.info(" BookSearchMS - Launched.... ");
}
} 
