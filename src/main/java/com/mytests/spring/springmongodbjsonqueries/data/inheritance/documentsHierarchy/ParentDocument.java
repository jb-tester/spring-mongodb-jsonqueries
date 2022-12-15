package com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
@Document
public class ParentDocument {

    @Id
    ObjectId parentId;

    @Field
    String parentFoo;
    @Field
    String parentBar;

    public ParentDocument(String parentFoo, String parentBar) {
        this.parentFoo = parentFoo;
        this.parentBar = parentBar;
    }

    public ObjectId getParentId() {
        return parentId;
    }

    public void setParentId(ObjectId parentId) {
        this.parentId = parentId;
    }

    public String getParentFoo() {
        return parentFoo;
    }

    public void setParentFoo(String parentFoo) {
        this.parentFoo = parentFoo;
    }

    public String getParentBar() {
        return parentBar;
    }

    public void setParentBar(String parentBar) {
        this.parentBar = parentBar;
    }

    @Override
    public String toString() {
        return "ParentDocument{" +
                "parentId=" + parentId +
                ", parentFoo='" + parentFoo + '\'' +
                ", parentBar='" + parentBar + '\'' +
                '}';
    }
}
