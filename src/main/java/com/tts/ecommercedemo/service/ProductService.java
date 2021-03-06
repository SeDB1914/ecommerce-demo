package com.tts.ecommercedemo.service;

import com.tts.ecommercedemo.model.Product;
import com.tts.ecommercedemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository productRepository;

    public List<Product> findByBrandAndOrCategory(String brand, String category) {
        if (category == null && brand == null) {
            return productRepository.findAll();
        } else if (category == null) {
            return productRepository.findByBrand(brand);
        } else if (brand == null) {
            return productRepository.findByCategory(category);
        } else return productRepository.findByBrandAndCategory(brand, category);

    }

    public List<String> findDistinctBrands() {
        return productRepository.findDistinctBrands();
    }

    public Product findById(long id) {
        return productRepository.findById(id);
    }

    public List<String> findDistinctCategory() {
        return productRepository.findDistinctCategory();
    }

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public void save(Product product) {
        productRepository.save(product);
    }

    public void deleteById(long id) {
        productRepository.deleteById(id);
    }





}
