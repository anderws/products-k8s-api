package com.anderws.productsk8sapi.core.usecase.impl;

import com.anderws.productsk8sapi.core.dataprovider.ProductRepository;
import com.anderws.productsk8sapi.core.domain.Product;
import com.anderws.productsk8sapi.core.usecase.FindProductByIdUsecase;

public class FindProductByIdUsecaseImpl implements FindProductByIdUsecase {

    private final ProductRepository productRepository;

    public FindProductByIdUsecaseImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Product findById(String id) {
        return productRepository.findById(id);
    }
}
