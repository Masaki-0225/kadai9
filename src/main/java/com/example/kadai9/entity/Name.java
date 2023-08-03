package com.example.kadai9.entity;

import io.micrometer.common.util.StringUtils;

import java.util.Objects;

public class Name {
    private int id;

    private String name;

    private Integer age;


    public Name(int id, String name, Integer age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public Name(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void update(String name, Integer age) {
        if (StringUtils.isNotBlank(name)) {
            this.name = name;
        }
        if (Objects.nonNull(age)) {
            this.age = age;
        }
    }
}
