package com.example.kadai9;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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
    public Name findById(int id) throws Exception {
        Optional<Name> name =nameMapper.findById(id);
        if (name.isPresent()){
            return name.get();
        }else{
            throw new Exception("name not found for id:" + id);
        }
    }


    @Override
    public void create(String name) {

    }

    @Override
    public void update(int id, String name) throws Exception {

    }
}
