package com.mytests.spring.springmongodbjsonqueries.data.embedded;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.List;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
@Document
public class WithEmbedded {

    @Id
    ObjectId id;
    @Field
    String strField;
    @Field
    EmbeddedTypeOne oneToOneRef;
    @Field
    List<EmbeddedTypeTwo> oneToManyRef;

    public WithEmbedded(String strField, EmbeddedTypeOne oneToOneRef, List<EmbeddedTypeTwo> oneToManyRef) {
        this.strField = strField;
        this.oneToOneRef = oneToOneRef;
        this.oneToManyRef = oneToManyRef;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getStrField() {
        return strField;
    }

    public void setStrField(String strField) {
        this.strField = strField;
    }

    public EmbeddedTypeOne getOneToOneRef() {
        return oneToOneRef;
    }

    public void setOneToOneRef(EmbeddedTypeOne oneToOneRef) {
        this.oneToOneRef = oneToOneRef;
    }

    public List<EmbeddedTypeTwo> getOneToManyRef() {
        return oneToManyRef;
    }

    public void setOneToManyRef(List<EmbeddedTypeTwo> oneToManyRef) {
        this.oneToManyRef = oneToManyRef;
    }

    @Override
    public String toString() {
        return "WithEmbedded{" +
                "id=" + id +
                ", strField='" + strField + '\'' +
                ", oneToOneRef=" + oneToOneRef +
                ", oneToManyRef=" + oneToManyRef +
                '}';
    }
}
