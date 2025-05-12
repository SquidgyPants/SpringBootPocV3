package com.example.springbootpocv3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

import java.util.UUID;

@RestController
@RequestMapping("/testing")
public class SpringBootPocV3Controller {
    private final SpringBootPocV3Interface springBootPocV2Interface;

    @Autowired
    public SpringBootPocV3Controller(SpringBootPocV3Interface springBootPocV2Interface) {
        this.springBootPocV2Interface = springBootPocV2Interface;
    }

    @GetMapping
    public ResponseEntity<String> testing(@RequestParam UUID id) {
        TestEntityDTO testEntityDTO = springBootPocV2Interface.findById(id).orElse(null);
        if (testEntityDTO != null)
        {
            return ResponseEntity.ok("Found: " + testEntityDTO.getName());
        }
        return ResponseEntity.ok("No entity found");
    }

    @PostMapping
    public ResponseEntity<TestEntityDTO> testingPost(@RequestParam String name) {
        TestEntityDTO testEntityDTO = new TestEntityDTO();
        testEntityDTO.setName(name);
        TestEntityDTO savedTestEntityDTO = springBootPocV2Interface.save(testEntityDTO);
        return ResponseEntity.ok(savedTestEntityDTO);
    }

    @PutMapping
    public ResponseEntity<String> testingPut(@RequestParam String name, @RequestParam UUID id) {
        TestEntityDTO testEntityDTO = new TestEntityDTO();
        testEntityDTO.setId(id);
        testEntityDTO.setName(name);
        TestEntityDTO savedTestEntityDTO = springBootPocV2Interface.save(testEntityDTO);
        return ResponseEntity.ok("Put: " + savedTestEntityDTO.getName());
    }

    @DeleteMapping
    public ResponseEntity<String> testingDelete(@RequestParam UUID id) {
        TestEntityDTO testEntityDTO = new TestEntityDTO();
        testEntityDTO.setId(id);
        springBootPocV2Interface.delete(testEntityDTO);
        return ResponseEntity.ok("Deleted: " + id);
    }
}

