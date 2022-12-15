package com.mytests.spring.springmongodbjsonqueries.services;

import com.mytests.spring.springmongodbjsonqueries.data.single.SingleDocument;
import com.mytests.spring.springmongodbjsonqueries.repositories.SingleDocumentRepository;
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
public class SingleDocumentService {

    private final SingleDocumentRepository singleDocumentRepository;

    public SingleDocumentService(SingleDocumentRepository singleDocumentRepository) {
        this.singleDocumentRepository = singleDocumentRepository;
    }

    public void displayQueries(){
        System.out.println("***** Single document: reference fields by annotation value or field name: *****");
        System.out.println("=== one:");
        for (SingleDocument document : singleDocumentRepository.byOne("one1")) {
            System.out.println(document);
        }
        System.out.println("=== two:");
        for (SingleDocument document : singleDocumentRepository.byTwo("two1")) {
            System.out.println(document);
        }
        System.out.println("=== three:");
        for (SingleDocument document : singleDocumentRepository.byThree("three1")) {
            System.out.println(document);
        }
        System.out.println("=== four:");
        for (SingleDocument document : singleDocumentRepository.byFour("four1")) {
            System.out.println(document);
        }
        System.out.println("=== StrFour:");
        for (SingleDocument document : singleDocumentRepository.byStrFour("four1")) {
            System.out.println(document);
        }
        System.out.println("=== with_underscore_one:");
        for (SingleDocument document : singleDocumentRepository.byWithUnderScore1("five_1")) {
            System.out.println(document);
        }
        System.out.println("=== with_underscore_two:");
        for (SingleDocument document : singleDocumentRepository.byWithUnderScore2("six_1")) {
            System.out.println(document);
        }
        System.out.println("*****************************************************************************************");
    }
    public void setupDB(){
        singleDocumentRepository.deleteAll();
        List<SingleDocument> documents = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            documents.add(new SingleDocument("one"+i,"two"+i,"three"+i,"four"+i, "five_"+i, "six_"+i));
        }
        singleDocumentRepository.saveAll(documents);
        System.out.println("singleDoucment creating results:");
        for (SingleDocument singleDocument : singleDocumentRepository.findAll()) {
            System.out.println(singleDocument);
        }
    }
}
