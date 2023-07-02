package com.example.kadai9;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NameServiceImpl implements NameService{
    private NameMapper nameMapper;

    public NameServiceImpl(NameMapper nameMapper) {
        this.nameMapper = nameMapper;
    }

    @Override
    public List<Name> findAll(){
        return nameMapper.findAll();
    }

    @Override
    public Name findById(int id)  {
        return nameMapper.findById(id);
    }

    @Override
    public void create(String name) {

    }

    @Override
    public void update(int id, String name) throws Exception {

    }
}
