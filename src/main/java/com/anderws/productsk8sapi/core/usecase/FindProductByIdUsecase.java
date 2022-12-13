package com.anderws.productsk8sapi.core.usecase;

import com.anderws.productsk8sapi.core.domain.Product;

public interface FindProductByIdUsecase {
    Product findById(String id);
}
