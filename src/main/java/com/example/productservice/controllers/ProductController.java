package com.example.productservice.controllers;

import com.example.productservice.exceptions.ProductNotFoundException;
import com.example.productservice.models.Product;
import com.example.productservice.services.ProductService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/products")
public class ProductController {
    ProductService productService;

    public ProductController(ProductService productService){
        this.productService=productService;
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable("id") Long id) throws ProductNotFoundException {

        return productService.getProductById(id);
    }

    @GetMapping()
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }

    @PutMapping("/{id}")
    public Product replaceProduct(@PathVariable("id") Long id, @RequestBody Product product){
        return productService.replaceProduct(id, product);
    }

//    @ExceptionHandler
//    public ResponseEntity<ProductNotFoundDto> handleProductNotFoundException(ProductNotFoundException exception){
//        ProductNotFoundDto productNotFoundDto = new ProductNotFoundDto();
//        productNotFoundDto.setMessage(exception.getMessage());
//        productNotFoundDto.setStatusCode(exception.getId());
//        return new ResponseEntity<>(productNotFoundDto, HttpStatus.NOT_FOUND);
//
//    }
}
