package com.mytests.spring.springmongodbjsonqueries.data.embedded;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public class EmbeddedTypeOne {
    @Field
    String propOne;
    @Field
    String propTwo;
    @Field
    NestedEmbeddedType nestedRef;

    public EmbeddedTypeOne(String propOne, String propTwo, NestedEmbeddedType nestedRef) {
        this.propOne = propOne;
        this.propTwo = propTwo;
        this.nestedRef = nestedRef;
    }

    public String getPropOne() {
        return propOne;
    }

    public void setPropOne(String propOne) {
        this.propOne = propOne;
    }

    public String getPropTwo() {
        return propTwo;
    }

    public void setPropTwo(String propTwo) {
        this.propTwo = propTwo;
    }

    public NestedEmbeddedType getNestedRef() {
        return nestedRef;
    }

    public void setNestedRef(NestedEmbeddedType nestedRef) {
        this.nestedRef = nestedRef;
    }

    @Override
    public String toString() {
        return "EmbeddedTypeOne{" +
                "propOne='" + propOne + '\'' +
                ", propTwo='" + propTwo + '\'' +
                ", nestedRef=" + nestedRef +
                '}';
    }
}
