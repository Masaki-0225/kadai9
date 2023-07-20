package com.example.kadai9.service;

import com.example.kadai9.entity.Name;

import java.util.List;

public interface NameService {
    List<Name> findAll();

    Name findById(int id) throws Exception;

    public Name createName(String name, int age);

    Name updateName(int id, String name, int age);

}
