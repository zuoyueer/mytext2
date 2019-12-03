package com.zuoyueer.domain;

import java.io.Serializable;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 14:49
 * @projectName Framework
 * @description: TODO
 */
public class Departments implements Serializable {
    private Integer id;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Departments{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
