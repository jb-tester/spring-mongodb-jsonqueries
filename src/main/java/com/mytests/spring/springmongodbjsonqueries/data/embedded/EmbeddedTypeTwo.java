package com.mytests.spring.springmongodbjsonqueries.data.embedded;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public class EmbeddedTypeTwo {
    @Field
    String fooProp;
    @Field
    String barProp;

    public EmbeddedTypeTwo(String fooProp, String barProp) {
        this.fooProp = fooProp;
        this.barProp = barProp;
    }

    public String getFooProp() {
        return fooProp;
    }

    public void setFooProp(String fooProp) {
        this.fooProp = fooProp;
    }

    public String getBarProp() {
        return barProp;
    }

    public void setBarProp(String barProp) {
        this.barProp = barProp;
    }

    @Override
    public String toString() {
        return "EmbeddedTypeTwo{" +
                "fooProp='" + fooProp + '\'' +
                ", barProp='" + barProp + '\'' +
                '}';
    }
}
