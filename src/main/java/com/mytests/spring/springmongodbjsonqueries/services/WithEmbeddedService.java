package com.mytests.spring.springmongodbjsonqueries.services;

import com.mytests.spring.springmongodbjsonqueries.data.embedded.EmbeddedTypeOne;
import com.mytests.spring.springmongodbjsonqueries.data.embedded.EmbeddedTypeTwo;
import com.mytests.spring.springmongodbjsonqueries.data.embedded.NestedEmbeddedType;
import com.mytests.spring.springmongodbjsonqueries.data.embedded.WithEmbedded;
import com.mytests.spring.springmongodbjsonqueries.repositories.WithEmbeddedRepository;
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
public class WithEmbeddedService {

    private final WithEmbeddedRepository repository;

    public WithEmbeddedService(WithEmbeddedRepository repository) {
        this.repository = repository;
    }

    public void displayQueries(){
        System.out.println("***** Test embedded documents: one-to-one and one-to-many references *****");
        System.out.println("=== one-to-one test:");
        for (WithEmbedded withEmbedded : repository.one2oneTest("p1_7")) {
            System.out.println(withEmbedded);
        }
        System.out.println("=== one-to-one-to-one test:");
        for (WithEmbedded withEmbedded : repository.one2oneNestedTest("fp7")) {
            System.out.println(withEmbedded);
        }
        System.out.println("=== one-to-many test1:");
        for (WithEmbedded withEmbedded : repository.one2manyTest1("foo72")) {
            System.out.println(withEmbedded);
        }
        System.out.println("=== one-to-many test2:");
        for (WithEmbedded withEmbedded : repository.one2manyTest2("foo72","bar72")) {
            System.out.println(withEmbedded);
        }
        System.out.println("*****************************************************************************************");
    }
    public void setupDB(){
        repository.deleteAll();
        List<WithEmbedded> docs = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            EmbeddedTypeOne embeddedTypeOne = new EmbeddedTypeOne("p1_"+i,"p2_"+i, new NestedEmbeddedType("fp"+i,"sp"+i));
            List<EmbeddedTypeTwo> embList = new ArrayList<>();
            embList.add(new EmbeddedTypeTwo("foo"+i+"1","bar"+i+"1"));
            embList.add(new EmbeddedTypeTwo("foo"+i+"2","bar"+i+"2"));
            embList.add(new EmbeddedTypeTwo("foo"+i+"3","bar"+i+"3"));
            docs.add(new WithEmbedded("str"+i,embeddedTypeOne,embList));
        }
        repository.saveAll(docs);
        System.out.println("withEmbedded creating results:");
        for (WithEmbedded withEmbedded : repository.findAll()) {
            System.out.println(withEmbedded);
        }
    }
}
