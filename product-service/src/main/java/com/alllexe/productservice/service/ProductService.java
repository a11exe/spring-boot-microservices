package com.alllexe.productservice.service;

import com.alllexe.productservice.dto.ProductRequest;
import com.alllexe.productservice.dto.ProductResponse;

import java.util.List;

public interface ProductService {

    void createProduct(ProductRequest productRequest);

    List<ProductResponse> getAllProducts();
}
