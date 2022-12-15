package com.mytests.spring.springmongodbjsonqueries.data.inheritance.documentsHierarchy;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
@Document
public class FirstChildDocument extends ParentDocument {


   @Field String child1Foo;
   @Field String child1Bar;

    public FirstChildDocument(String parentFoo, String parentBar, String child1Foo, String child1Bar) {
        super(parentFoo, parentBar);
        this.child1Foo = child1Foo;
        this.child1Bar = child1Bar;
    }



    public String getChild1Foo() {
        return child1Foo;
    }

    public void setChild1Foo(String child1Foo) {
        this.child1Foo = child1Foo;
    }

    public String getChild1Bar() {
        return child1Bar;
    }

    public void setChild1Bar(String child1Bar) {
        this.child1Bar = child1Bar;
    }

    @Override
    public String toString() {
        return "FirstChildDocument{" +
                "parentId=" + parentId +
                ", parentFoo='" + parentFoo + '\'' +
                ", parentBar='" + parentBar + '\'' +
                ", child1Foo='" + child1Foo + '\'' +
                ", child1Bar='" + child1Bar + '\'' +
                '}';
    }
}
