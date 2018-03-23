package com.example.demo.controller;

import com.example.demo.model.Cat;
import com.example.demo.repository.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/cats")
public class Controller {

    @Autowired
    CatRepository catRepository;

    @PostMapping()
    public Cat createCats(@RequestBody Cat cat){

        catRepository.save(cat);

        return cat;

    }

    @GetMapping
    public List<Cat> getAllCats(){
        return catRepository.findAll();
    }


}
