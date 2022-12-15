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
public class SecondChildDocument extends ParentDocument {


   @Field String child2Foo;
   @Field String child2Bar;

    public SecondChildDocument(String parentFoo, String parentBar, String child2Foo, String child2Bar) {
        super(parentFoo, parentBar);
        this.child2Foo = child2Foo;
        this.child2Bar = child2Bar;
    }

    public String getChild2Foo() {
        return child2Foo;
    }

    public void setChild2Foo(String child2Foo) {
        this.child2Foo = child2Foo;
    }

    public String getChild2Bar() {
        return child2Bar;
    }

    public void setChild2Bar(String child2Bar) {
        this.child2Bar = child2Bar;
    }

    @Override
    public String toString() {
        return "SecondChildDocument{" +
                "parentId=" + parentId +
                ", parentFoo='" + parentFoo + '\'' +
                ", parentBar='" + parentBar + '\'' +
                ", child2Foo='" + child2Foo + '\'' +
                ", child2Bar='" + child2Bar + '\'' +
                '}';
    }
}
