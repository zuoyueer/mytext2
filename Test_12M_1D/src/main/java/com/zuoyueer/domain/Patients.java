package com.zuoyueer.domain;

import java.io.Serializable;

/**
 * @author Zuoyueer
 * Date: 2019/12/1
 * Time: 14:51
 * @projectName Framework
 * @description: TODO
 */
public class Patients implements Serializable {
    private Integer id;
    private String name;
    private Integer gender;
    private Integer did;
    private String advice;

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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getDid() {
        return did;
    }

    public void setDid(Integer did) {
        this.did = did;
    }

    public String getAdvice() {
        return advice;
    }

    public void setAdvice(String advice) {
        this.advice = advice;
    }

    @Override
    public String toString() {
        return "Patients{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", did=" + did +
                ", advice='" + advice + '\'' +
                '}';
    }
}
