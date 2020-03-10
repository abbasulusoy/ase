package com.example.ase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class Service {

    @Autowired
    private Repository repository;

    @GetMapping("/todos")
    Iterable<Request> findAll() {
        return repository.findAll();
    }

    // Save
    @PostMapping("/todos")
    @ResponseStatus(HttpStatus.CREATED)
    Request newRequest(@RequestBody Request request) {
        return repository.save(request);
    }

    // Find
    @GetMapping("/todos/{id}")
    Request findById(@PathVariable Long id) {
        Optional<Request> request=repository.findById(id);
        if(request == null){
            return null;
            //todo notfoundresponse
        }
        return request.get();
    }
}
