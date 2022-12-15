package com.mytests.spring.springmongodbjsonqueries.repositories;

import com.mytests.spring.springmongodbjsonqueries.data.inheritance.classHierarchy.DocumentWithParents;
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
public interface DocumentWithParentsRepository extends MongoRepository<DocumentWithParents, ObjectId> {

    @Query("{baseClassField: ?0}")
    List<DocumentWithParents> byBaseClassProperty(String arg);

    @Query("{superFlag: ?0, superProp: ?1}")
    List<DocumentWithParents> bySuperParentClassProperty(Boolean arg1, String arg2 );

    // no completion/navigation for properties in #fields
    @Query(value = "{superFlag: ?0}", fields = "{firstProp: 1}")
    List<DocumentWithParents> withFilters(boolean arg);
}
