package com.example.kadai9.service;

import com.example.kadai9.entity.Name;

import java.util.List;

public interface NameService {
    List<Name> findAll();

    Name findById(int id) throws Exception;

    public Name  createName(String name, int age);

    void update(int id,String name ) throws Exception;
}
