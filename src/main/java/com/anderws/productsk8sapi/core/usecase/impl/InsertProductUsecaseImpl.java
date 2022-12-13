package com.anderws.productsk8sapi.core.usecase.impl;

import com.anderws.productsk8sapi.core.dataprovider.ProductRepository;
import com.anderws.productsk8sapi.core.domain.Product;
import com.anderws.productsk8sapi.core.usecase.InsertProductUsecase;

public class InsertProductUsecaseImpl implements InsertProductUsecase {

    private final ProductRepository productRepository;

    public InsertProductUsecaseImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public String insert(Product product) {
        return productRepository.insert(product);
    }
}
