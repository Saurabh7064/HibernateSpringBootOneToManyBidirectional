package com.bookstore;

import com.bookstore.service.BookstoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MainApplication {

    @Autowired
    private BookstoreService bookstoreService;

    public static void main(String[] args) {
        SpringApplication.run(MainApplication.class, args);
    }

    @Bean
    public ApplicationRunner init() {
        return args -> {
     //       System.out.println("\n\n Fetch authors as Spring projection (DTO):");
      //      System.out.println("-----------------------------------------------------------------------------");
        //    bookstoreService.fetchAuthorAsDtoClass();

            System.out.println("\n\n Fetch authors as Spring projection (DTO) by specifying columns:");
            System.out.println("-----------------------------------------------------------------------------");
            bookstoreService.fetchAgeNameGenre();
            bookstoreService.fetchNameEmail();
/*
            System.out.println("\n\n Fetch authors as Spring projection (DTO) and native query:");
            System.out.println("-----------------------------------------------------------------------------");
            bookstoreService.fetchAuthorAsDtoClassNative();

            System.out.println("\n\n Fetch authors as Spring projection (DTO) via query builder mechanism:");
            System.out.println("-----------------------------------------------------------------------------");
            bookstoreService.fetchAuthorByGenreAsDtoClassQueryBuilderMechanism();
*/
        };
    }
}