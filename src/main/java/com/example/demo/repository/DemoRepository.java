package com.example.demo.repository;

import com.example.demo.model.MongoDoc;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DemoRepository extends MongoRepository<MongoDoc, String> {
}
