package com.example.kadai9;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class NameController {

    private final NameService nameService;


    public NameController(NameService nameService) {
        this.nameService = nameService;
    }


    @GetMapping("/names")
    public List<NameResponse> names(){
        List<Name> names = nameService.findAll();
        List<NameResponse> nameResponses = names.stream().map(NameResponse::new).toList();
        return nameResponses;
    }

    @GetMapping("/names/{id}")
    public Name findNameById(@PathVariable("id") int id) throws Exception {
        return nameService.findById(id);
    }
}
