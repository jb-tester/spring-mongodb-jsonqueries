package com.mytests.spring.springmongodbjsonqueries.repositories;

import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.FirstChildDocument;
import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.ParentDocument;
import com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy.SecondChildDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public interface ParentDocumentRepository extends MongoRepository<ParentDocument, ObjectId> {

    @Query("{parentFoo: ?0}")
    List<ParentDocument> findByParentFields(String arg);

    // child document properties are not resolved - https://youtrack.jetbrains.com/issue/IDEA-308728
    @Query("{parentFoo: ?0, child1Foo: ?1}")
    List<FirstChildDocument> findByFirstChildFields(String arg1, String arg2);

    // child document properties are not resolved - https://youtrack.jetbrains.com/issue/IDEA-308728
    @Query("{parentBar: ?0, child2Bar: ?1}")
    List<SecondChildDocument> findBySecondChildFields(String arg1, String arg2);

    // errors are shown for return type and method name - https://youtrack.jetbrains.com/issue/IDEA-308728
    List<SecondChildDocument> findByChild2Bar(String bar);
}
