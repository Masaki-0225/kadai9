package com.example.kadai9.controller;

import com.example.kadai9.entity.Name;
import com.example.kadai9.form.CreateForm;
import com.example.kadai9.form.UpdateForm;
import com.example.kadai9.service.NameService;
import jakarta.validation.Valid;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Map;

@RestController
public class NameController {

    private final NameService nameService;


    public NameController(NameService nameService) {
        this.nameService = nameService;
    }


    @GetMapping("/names")
    public List<Name> names() {
        List<Name> names = nameService.findAll();
//        List<NameResponse> nameResponses = names.stream().map(NameResponse::new).toList();
        return names;
    }

    @GetMapping("/names/{id}")
    public Name findNameById(@PathVariable("id") int id) throws Exception {
        return nameService.findById(id);
    }

    @PostMapping("/names")
    public ResponseEntity<Map<String, String>> create(
            @RequestBody @Valid CreateForm form, UriComponentsBuilder uriBuilder) {
        Name names = nameService.createName(form.getName(), form.getAge());
        URI url = uriBuilder
                .path("/names/" + names.getId())
                .build()
                .toUri();
        return ResponseEntity.created(url).body(Map.of("message", "Name created successfully!!!"));
    }

    @PatchMapping("/names/{id}")
    public ResponseEntity<Map<String, String>>
    update(@PathVariable("id") int id, @RequestBody @Valid UpdateForm form) throws NotFoundException {
        nameService.updateName(id, form.getName(), form.getAge());
        return ResponseEntity.ok(Map.of("message", "Name update successfully"));
    }
}
