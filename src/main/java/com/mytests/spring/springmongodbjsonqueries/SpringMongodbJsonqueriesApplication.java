package com.mytests.spring.springmongodbjsonqueries;

import com.mytests.spring.springmongodbjsonqueries.services.ParentChildDocumentsService;
import com.mytests.spring.springmongodbjsonqueries.services.DocumentWithParentsService;
import com.mytests.spring.springmongodbjsonqueries.services.SingleDocumentService;
import com.mytests.spring.springmongodbjsonqueries.services.WithEmbeddedService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringMongodbJsonqueriesApplication implements CommandLineRunner {

    private final SingleDocumentService singleDocumentService;
    private final WithEmbeddedService withEmbeddedService;
    private final DocumentWithParentsService documentWithParentsService;
    private final ParentChildDocumentsService parentChildDocumentsService;

    public SpringMongodbJsonqueriesApplication(SingleDocumentService singleDocumentService, WithEmbeddedService withEmbeddedService, DocumentWithParentsService documentWithParentsService, ParentChildDocumentsService parentChildDocumentsService) {
        this.singleDocumentService = singleDocumentService;
        this.withEmbeddedService = withEmbeddedService;
        this.documentWithParentsService = documentWithParentsService;
        this.parentChildDocumentsService = parentChildDocumentsService;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringMongodbJsonqueriesApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        //singleDocumentService.setupDB();
        singleDocumentService.displayQueries();
        //withEmbeddedService.setupDB();
        withEmbeddedService.displayQueries();
        //documentWithParentsService.setupDB();
        documentWithParentsService.displayQueries();
        //parentChildDocumentsService.setupDB();
        parentChildDocumentsService.displayQueries();
    }
}
