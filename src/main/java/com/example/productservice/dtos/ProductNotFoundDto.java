package com.example.productservice.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductNotFoundDto {
    Long statusCode;
    String message;
}
