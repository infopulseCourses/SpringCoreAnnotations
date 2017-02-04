package com.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @author Stepan
 */
@Component
@Scope(value = "prototype")
public class Staff {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
