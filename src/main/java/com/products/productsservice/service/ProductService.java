package com.products.productsservice.service;

import com.products.productsservice.entity.Product;
import com.products.productsservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    public Product findProductById(Long productId) {
        return productRepository.findByProductId(productId);
    }
}
