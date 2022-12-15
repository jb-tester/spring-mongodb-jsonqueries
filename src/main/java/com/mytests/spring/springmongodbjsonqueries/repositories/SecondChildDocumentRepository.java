package com.mytests.spring.springmongodbjsonqueries.repositories;

import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.FirstChildDocument;
import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.SecondChildDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public interface SecondChildDocumentRepository extends MongoRepository<SecondChildDocument, ObjectId> {
}
