package com.mytests.spring.springmongodbjsonqueries.services;

import com.mytests.spring.springmongodbjsonqueries.data.inheritance.classHierarchy.DocumentWithParents;
import com.mytests.spring.springmongodbjsonqueries.repositories.DocumentWithParentsRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
@Service
public class DocumentWithParentsService {

    private final DocumentWithParentsRepository documentWithParentsRepository;

    public DocumentWithParentsService(DocumentWithParentsRepository documentWithParentsRepository) {
        this.documentWithParentsRepository = documentWithParentsRepository;
    }

    public void setupDB(){
        documentWithParentsRepository.deleteAll();
        List<DocumentWithParents> documents = new ArrayList<>();
        boolean flag = true;
        for (int i = 0; i < 10; i++) {
            documents.add(new DocumentWithParents(flag, "superProp"+i,"baseProp"+i,"firstChildProp"+i));
            flag = !flag;
        }
        documentWithParentsRepository.saveAll(documents);
        System.out.println("document with parents creating results:");
        for (DocumentWithParents childDocument : documentWithParentsRepository.findAll()) {
            System.out.println(childDocument);
        }
    }
    public void displayQueries(){

        System.out.println("******** document that has 2 levels of superclasses:  ********");
        System.out.println("=== use parent class property: ====");

        for (DocumentWithParents document : documentWithParentsRepository.byBaseClassProperty("baseProp8")) {
            System.out.println(document);
        }
        System.out.println("=== use 'grandfather' class properties: ====");

        for (DocumentWithParents document : documentWithParentsRepository.bySuperParentClassProperty(false, "superProp7")) {
            System.out.println(document);
        }

        System.out.println("=== test @Query#fields: ==");
        for (DocumentWithParents document : documentWithParentsRepository.withFilters(true)) {
            System.out.println(document);
        }
        System.out.println("*****************************************************************************************");
    }
}
