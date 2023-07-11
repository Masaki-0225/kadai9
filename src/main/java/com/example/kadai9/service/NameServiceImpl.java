package com.example.kadai9.service;

import com.example.kadai9.entity.Name;
import com.example.kadai9.mapper.NameMapper;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class NameServiceImpl implements NameService {
    private final NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll(){
        return nameMapper.findAll();
    }

    @Override
    public Name findById(int id) throws Exception {
        return nameMapper.findById(id).orElseThrow(() -> new Exception("name not found for id:" + id));
    }

    @Override
    public Name createName(String name, int age){
        Name names = new Name(name ,age);
     nameMapper.createName(names);
     return names;

    }

    @Override
    public void update(int id, String name) throws Exception {

    }


}
