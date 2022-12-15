package com.mytests.spring.springmongodbjsonqueries.services;

import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.FirstChildDocument;
import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.ParentDocument;
import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.SecondChildDocument;
import com.mytests.spring.springmongodbjsonqueries.repositories.FirstChildDocumentRepository;
import com.mytests.spring.springmongodbjsonqueries.repositories.ParentDocumentRepository;
import com.mytests.spring.springmongodbjsonqueries.repositories.SecondChildDocumentRepository;
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
public class ParentChildDocumentsService {

    private final ParentDocumentRepository parentDocumentRepository;
    private final FirstChildDocumentRepository firstChildDocumentRepository;
    private final SecondChildDocumentRepository secondChildDocumentRepository;

    public ParentChildDocumentsService(ParentDocumentRepository parentDocumentRepository, FirstChildDocumentRepository firstChildDocumentRepository, SecondChildDocumentRepository secondChildDocumentRepository) {
        this.parentDocumentRepository = parentDocumentRepository;
        this.firstChildDocumentRepository = firstChildDocumentRepository;
        this.secondChildDocumentRepository = secondChildDocumentRepository;
    }

    public void displayQueries(){
        System.out.println("***** documents hierarchy: child document extending parent document *****");
        System.out.println("=== use parent document property from parent document repository: ====");
        for (ParentDocument doc : parentDocumentRepository.findByParentFields("pfoo8")) {
            System.out.println(doc);
        }
        System.out.println("=== use child document property from parent document repository - first child====");
        for (FirstChildDocument doc : parentDocumentRepository.findByFirstChildFields("pfoo8", "c1foo8")) {
            System.out.println(doc);
        }
        System.out.println("=== use child document property from parent document repository - second child====");
        for (SecondChildDocument doc : parentDocumentRepository.findBySecondChildFields("pbar9", "c2bar9")) {
            System.out.println(doc);
        }
        System.out.println("=== not-annotated query method:");
        for (SecondChildDocument document : parentDocumentRepository.findByChild2Bar("c2bar1")) {
            System.out.println(document);
        }
        System.out.println("*****************************************************************************************");
    }
    public void setupDB(){

        parentDocumentRepository.deleteAll();
        firstChildDocumentRepository.deleteAll();
        secondChildDocumentRepository.deleteAll();
        List<ParentDocument> parentDocumentList = new ArrayList<>();
        List<FirstChildDocument> firstChildDocumentList = new ArrayList<>();
        List<SecondChildDocument> secondChildDocumentList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            parentDocumentList.add(new ParentDocument("pfoo"+i,"pbar"+i));
            firstChildDocumentList.add(new FirstChildDocument("pfoo"+i,"pbar"+i, "c1foo"+i, "c1bar"+i));
            secondChildDocumentList.add(new SecondChildDocument("pfoo"+i,"pbar"+i, "c2foo"+i, "c2bar"+i));
        }
        parentDocumentRepository.saveAll(parentDocumentList);
        firstChildDocumentRepository.saveAll(firstChildDocumentList);
        secondChildDocumentRepository.saveAll(secondChildDocumentList);
        System.out.println("== parent document results:");
        for (ParentDocument document : parentDocumentRepository.findAll()) {
            System.out.println(document);
        }
        System.out.println("== first child document results:");
        for (FirstChildDocument document : firstChildDocumentRepository.findAll()) {
            System.out.println(document);
        }
        System.out.println("== second child document results:");
        for (SecondChildDocument document : secondChildDocumentRepository.findAll()) {
            System.out.println(document);
        }
    }
}
