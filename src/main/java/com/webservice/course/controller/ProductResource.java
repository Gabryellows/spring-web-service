package com.webservice.course.controller;

import com.webservice.course.model.entities.Category;
import com.webservice.course.model.entities.Product;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    public ResponseEntity<Product> findAll() {
        Product product = new Product(1L, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "", new Category(2L, "Books"));

        return ResponseEntity.ok().body(product);
    }
}
