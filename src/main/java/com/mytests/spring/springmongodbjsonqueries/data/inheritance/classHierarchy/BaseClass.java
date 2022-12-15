package com.mytests.spring.springmongodbjsonqueries.data.inheritance.classHierarchy;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public abstract class BaseClass extends SuperBaseClass {

    @Id
    ObjectId id;
    @Field("baseClassField")
    String baseClassField;

    public BaseClass(Boolean superFlag, String superProp, String baseClassField) {
        super(superFlag, superProp);
        this.baseClassField = baseClassField;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getBaseClassField() {
        return baseClassField;
    }

    public void setBaseClassField(String baseClassField) {
        this.baseClassField = baseClassField;
    }
}
