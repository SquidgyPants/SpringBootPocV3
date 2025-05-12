package com.example.springbootpocv3;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SpringBootPocV3Interface extends CrudRepository<TestEntityDTO, UUID>{
    // This interface extends CrudRepository, which provides CRUD operations for the TestEntityDTO entity.
    // You can define custom query methods here if needed.
}
