package com.webservice.course.services;

import com.webservice.course.model.entities.Category;
import com.webservice.course.model.entities.Product;
import com.webservice.course.repositories.CategoryRepository;
import com.webservice.course.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public List<Product> findAll() {
        return repository.findAll();
    }

    public Product findProductById(Long id) {
        Optional<Product> returningObj = repository.findById(id);
        return returningObj.get();
    }


}
