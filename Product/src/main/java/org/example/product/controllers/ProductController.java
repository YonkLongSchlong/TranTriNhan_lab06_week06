package org.example.product.controllers;

import org.example.product.entity.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @GetMapping("/")
    public List<Product> getAllProduct() {
        List<Product> products = new ArrayList<>();
        return null;
    }
}
