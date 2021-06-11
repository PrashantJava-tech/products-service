package com.products.productsservice.controller;

import com.products.productsservice.entity.Product;
import com.products.productsservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public Product saveAccount(@RequestBody Product product) {
        System.out.println("account name before save="+product.getProductName());
        Product product1 = productService.saveProduct(product);
        System.out.println("account name after save  ="+product.getProductName());
        return product1;
    }

    @GetMapping("/{productId}")
    public Product findAccountById(@PathVariable Long productId) {
        return  productService.findProductById(productId);
    }
}
