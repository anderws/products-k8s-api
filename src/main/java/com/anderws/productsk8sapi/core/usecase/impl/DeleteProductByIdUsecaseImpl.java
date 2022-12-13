package com.anderws.productsk8sapi.core.usecase.impl;

import com.anderws.productsk8sapi.core.dataprovider.ProductRepository;
import com.anderws.productsk8sapi.core.domain.Product;
import com.anderws.productsk8sapi.core.usecase.DeleteProductByIdUsecase;
import com.anderws.productsk8sapi.core.usecase.FindProductByIdUsecase;

public class DeleteProductByIdUsecaseImpl implements DeleteProductByIdUsecase {

    private final ProductRepository productRepository;

    public DeleteProductByIdUsecaseImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void delete(String id) {
        productRepository.delete(id);
    }
}
