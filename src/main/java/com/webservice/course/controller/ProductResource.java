package com.webservice.course.controller;

import com.webservice.course.model.entities.Category;
import com.webservice.course.model.entities.Product;
import com.webservice.course.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {

    @Autowired
    private ProductService service;

    @GetMapping
    public ResponseEntity<List<Product>> findAll() {
        List<Product> listProduct = service.findAll();

        return ResponseEntity.ok().body(listProduct);
    }

    @GetMapping(value = "/{id}")
    public ResponseEntity<Product> findByProductId(@PathVariable Long id) {
        Product product = service.findProductById(id);

        return ResponseEntity.ok().body(product);
    }
}
