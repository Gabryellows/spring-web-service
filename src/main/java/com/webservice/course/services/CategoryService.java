package com.webservice.course.services;

import com.webservice.course.model.entities.Category;
import com.webservice.course.model.entities.Order;
import com.webservice.course.repositories.CategoryRepository;
import com.webservice.course.repositories.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findCategoryById(Long id) {
        Optional<Category> returningObj = repository.findById(id);
        return returningObj.get();
    }


}
