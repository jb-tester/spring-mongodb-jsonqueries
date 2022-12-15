package com.mytests.spring.springmongodbjsonqueries.repositories;

import com.mytests.spring.springmongodbjsonqueries.data.embedded.WithEmbedded;
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
public interface WithEmbeddedRepository extends MongoRepository<WithEmbedded, ObjectId> {

    // incorrect query - quotes are required here; uncomment to demonstrate completion and navigation:
    // the properties are resolved
    //@Query("{oneToOneRef.propOne: ?0}")
    @Query("{'oneToOneRef.propOne': ?0}") // correct query: navigation doesn't work - https://youtrack.jetbrains.com/issue/IDEA-308625
    List<WithEmbedded> one2oneTest(String arg);

    // incorrect query - quotes are required here; uncomment to demonstrate completion and navigation:
    // the properties are resolved
    //@Query("{oneToOneRef.nestedRef.firstProp: ?0}")
    @Query("{'oneToOneRef.nestedRef.firstProp': ?0}") // correct query: navigation doesn't work - https://youtrack.jetbrains.com/issue/IDEA-308625
    List<WithEmbedded> one2oneNestedTest(String arg);

    // incorrect query - quotes are required here; uncomment to demonstrate completion and navigation:
    // property of collection element type is not resolved - https://youtrack.jetbrains.com/issue/IDEA-308628
    //@Query("{oneToManyRef.fooProp: ?0}")   // just for demonstration - without quotes this query will cause exceptions in runtime
    @Query("{'oneToManyRef.fooProp': ?0}")  // correct query: navigation doesn't work - https://youtrack.jetbrains.com/issue/IDEA-308625
    List<WithEmbedded> one2manyTest1(String arg);

    // no navigation/completion for the nested collection element fields - https://youtrack.jetbrains.com/issue/IDEA-308628
    @Query("{oneToManyRef: {fooProp: ?0, barProp: ?1}}")  // correct query: navigation doesn't work - https://youtrack.jetbrains.com/issue/IDEA-308625
    List<WithEmbedded> one2manyTest2(String arg1, String arg2);

    // test completion here:
    // https://youtrack.jetbrains.com/issue/IDEA-308655,
    // https://youtrack.jetbrains.com/issue/IDEA-308630,
    // https://youtrack.jetbrains.com/issue/IDEA-308475
    //@Query("{}")
    //List<WithEmbedded> foo(String aaa);

}


























