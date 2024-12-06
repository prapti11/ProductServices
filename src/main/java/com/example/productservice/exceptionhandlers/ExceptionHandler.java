package com.example.productservice.exceptionhandlers;

import com.example.productservice.dtos.ProductNotFoundDto;
import com.example.productservice.exceptions.ProductNotFoundException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

@ControllerAdvice
public class ExceptionHandler {
    @org.springframework.web.bind.annotation.ExceptionHandler({ProductNotFoundException.class})
    public ResponseEntity<ProductNotFoundDto> handleProductNotFoundException(ProductNotFoundException exception){
        ProductNotFoundDto productNotFoundDto = new ProductNotFoundDto();
        productNotFoundDto.setMessage(exception.getMessage());
        productNotFoundDto.setStatusCode(exception.getId());
        return new ResponseEntity<>(productNotFoundDto, HttpStatus.NOT_FOUND);

    }
}

