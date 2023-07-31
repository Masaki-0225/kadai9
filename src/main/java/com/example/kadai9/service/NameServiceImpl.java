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
    public List<Name> findAll() {
        return nameMapper.findAll();
    }

    @Override
    public Name findById(int id) {
        return nameMapper.findById(id);
//                .orElseThrow(() -> new Exception("name not found for id:" + id));
    }

    @Override
    public Name createName(String name, Integer age) {
        Name newName = new Name(name, age);
        nameMapper.createName(newName);
        return newName;

    }

    @Override
    public Name updateName(Name updateForm) {
        Name newName = nameMapper.findById(updateForm.getId());
        newName.update(updateForm.getName(), updateForm.getAge());
        nameMapper.updateName(newName);
        return newName;
    }
}
