package com.webservice.course.controller;

import com.webservice.course.model.entities.Category;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categories")
public class CategoryResource {
    @GetMapping
    public ResponseEntity<Category> findAll() {
        Category category = new Category(1L, "Electronics");

        return ResponseEntity.ok().body(category);
    }
}
