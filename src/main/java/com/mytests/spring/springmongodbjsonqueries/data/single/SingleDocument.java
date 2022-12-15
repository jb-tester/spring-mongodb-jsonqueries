package com.mytests.spring.springmongodbjsonqueries.data.single;

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
public class SingleDocument {
    @Id
    ObjectId id;
    String one;
    @Field
    String two;
    @Field("three")
    String three;
    @Field("four")
    String strFour;
    @Field("with_underscore_one")
    String withUnderscoreOne;
    //@Field
    String with_underscore_two;

    public SingleDocument(String one, String two, String three, String strFour, String withUnderscoreOne, String with_underscore_two) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.strFour = strFour;
        this.withUnderscoreOne = withUnderscoreOne;
        this.with_underscore_two = with_underscore_two;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getOne() {
        return one;
    }

    public void setOne(String one) {
        this.one = one;
    }

    public String getTwo() {
        return two;
    }

    public void setTwo(String two) {
        this.two = two;
    }

    public String getThree() {
        return three;
    }

    public void setThree(String three) {
        this.three = three;
    }

    public String getStrFour() {
        return strFour;
    }

    public void setStrFour(String strFour) {
        this.strFour = strFour;
    }

    public String getWithUnderscoreOne() {
        return withUnderscoreOne;
    }

    public void setWithUnderscoreOne(String withUnderscoreOne) {
        this.withUnderscoreOne = withUnderscoreOne;
    }

    public String getWith_underscore_two() {
        return with_underscore_two;
    }

    public void setWith_underscore_two(String with_underscore_two) {
        this.with_underscore_two = with_underscore_two;
    }

    @Override
    public String toString() {
        return "SingleDocument{" +
                "id=" + id +
                ", one='" + one + '\'' +
                ", two='" + two + '\'' +
                ", three='" + three + '\'' +
                ", strFour='" + strFour + '\'' +
                ", withUnderscoreOne='" + withUnderscoreOne + '\'' +
                ", withUnderscoreTwo='" + with_underscore_two + '\'' +
                '}';
    }
}
