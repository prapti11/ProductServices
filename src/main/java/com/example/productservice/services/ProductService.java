package com.example.productservice.services;

import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.models.Product;

import java.util.List;

public interface ProductService {
    Product getProductById(Long id) throws ProductNotFoundException, ProductNotFoundException;
    List<Product> getAllProducts();
    Product replaceProduct(Long id, Product product);
}
