package com.mytests.spring.springmongodbjsonqueries.repositories;

import com.mytests.spring.springmongodbjsonqueries.data.single.SingleDocument;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;
import java.util.Optional;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public interface SingleDocumentRepository extends MongoRepository<SingleDocument, ObjectId> {

    // ! false error
    // @Id; no @Field annotation, column_name( '_id') != field_name: reference by column name is not resolved
    @Query("{_id: ObjectId(?0)}")
    Optional<SingleDocument> by_Id(String id);

    // @Id; no @Field annotation, column_name( '_id') != field_name: reference by field name is resolved
    @Query("{id: ObjectId(?0)}")
    Optional<SingleDocument> byId(String id);

    // ! false error
    // no @Field annotation, field_name == column_name: reference is not resolved
    @Query("{one: ?0}")
    List<SingleDocument> byOne(String arg);

    // valueless @Field annotation, field_name == column_name
    // if quotes are used, no navigation is available
    @Query("{'two': ?0}")
    List<SingleDocument> byTwo(String arg);

    // @Field annotation with explicit value, annotation_value  == column_name == field_name, put on getter
    @Query("{three: ?0}")
    List<SingleDocument> byThree(String arg);

    // @Field annotation with explicit value, annotation_value == column_name != field_name: reference by @Field#value is resolved
    @Query("{four: ?0}")
    List<SingleDocument> byFour(String arg);

    // ! false error
    // @Field annotation with explicit value, annotation_value == column_name != field_name: reference by field name is not resolved
    @Query("{strFour: ?0}")
    List<SingleDocument> byStrFour(String arg);

    @Query("{with_underscore_one: ?0}")
    List<SingleDocument> byWithUnderScore1(String arg);

    @Query("{with_underscore_two: ?0}")
    List<SingleDocument> byWithUnderScore2(String arg);
}
