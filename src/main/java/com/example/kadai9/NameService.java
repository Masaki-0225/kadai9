package com.example.kadai9;

import java.util.List;

public interface NameService {
    List<Name> findAll();

    Name findById(int id) ;

    void create(String name);

    void update(int id,String name ) throws Exception;
}
