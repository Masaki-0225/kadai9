package com.example.kadai9;

public class NameResponse {

    private String name;

    public NameResponse(Name name) {
        this.name = name.getName();
    }

    public String getName() {
        return name;
    }
}
