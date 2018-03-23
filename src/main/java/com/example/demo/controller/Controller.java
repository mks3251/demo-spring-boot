package com.example.demo.controller;

import com.example.demo.model.MongoDoc;
import com.example.demo.repository.DemoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/echo")
public class Controller {

    @Autowired
    DemoRepository demoRepository;

    @PostMapping()
    public MongoDoc postMongoDoc(@RequestBody MongoDoc mongoDoc){

        demoRepository.save(mongoDoc);

        return mongoDoc;

    }

    @GetMapping
    public List<MongoDoc> getAllMongoDocs(){
        return demoRepository.findAll();
    }


}
