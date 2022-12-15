package com.mytests.spring.springmongodbjsonqueries.data.inheritance.classHierarchy;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
@Document("firstChild")
public class DocumentWithParents extends BaseClass {
    @Field
    String firstProp;

    public DocumentWithParents(Boolean superFlag, String superProp, String baseClassField, String firstProp) {
        super(superFlag, superProp, baseClassField);
        this.firstProp = firstProp;
    }

    public String getFirstProp() {
        return firstProp;
    }

    public void setFirstProp(String firstProp) {
        this.firstProp = firstProp;
    }

    @Override
    public String toString() {
        return "DocumentWithParents{" +
                "id=" + id +
                ", firstProp='" + firstProp + '\'' +
                ", baseClassField='" + baseClassField + '\'' +
                ", superFlag=" + superFlag +
                ", superProp=" + superProp +
                '}';
    }
}
