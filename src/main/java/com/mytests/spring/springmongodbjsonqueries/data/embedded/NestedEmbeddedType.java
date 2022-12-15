package com.mytests.spring.springmongodbjsonqueries.data.embedded;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public class NestedEmbeddedType {
    @Field
    String firstProp;
    @Field
    String secondProp;

    public NestedEmbeddedType(String firstProp, String secondProp) {
        this.firstProp = firstProp;
        this.secondProp = secondProp;
    }

    public String getFirstProp() {
        return firstProp;
    }

    public void setFirstProp(String firstProp) {
        this.firstProp = firstProp;
    }

    public String getSecondProp() {
        return secondProp;
    }

    public void setSecondProp(String secondProp) {
        this.secondProp = secondProp;
    }

    @Override
    public String toString() {
        return "NestedEmbeddedType{" +
                "firstProp='" + firstProp + '\'' +
                ", secondProp='" + secondProp + '\'' +
                '}';
    }
}
