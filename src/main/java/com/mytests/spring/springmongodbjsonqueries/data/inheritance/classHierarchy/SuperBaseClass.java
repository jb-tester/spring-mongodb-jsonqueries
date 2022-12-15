package com.mytests.spring.springmongodbjsonqueries.data.inheritance.classHierarchy;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 * *
 * <p>Created by irina on 12/14/2022.</p>
 * <p>Project: spring-mongodb-jsonqueries</p>
 * *
 */
public abstract class SuperBaseClass {
    @Field Boolean superFlag;
    @Field String superProp;
    public SuperBaseClass(Boolean superFlag, String superProp) {
        this.superProp = superProp;
        this.superFlag = superFlag;
    }

    public String getSuperProp() {
        return superProp;
    }

    public void setSuperProp(String superProp) {
        this.superProp = superProp;
    }

    public Boolean getSuperFlag() {
        return superFlag;
    }

    public void setSuperFlag(Boolean superFlag) {
        this.superFlag = superFlag;
    }
}
