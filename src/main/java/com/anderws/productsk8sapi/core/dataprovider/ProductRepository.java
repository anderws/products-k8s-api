package com.anderws.productsk8sapi.core.dataprovider;

import com.anderws.productsk8sapi.core.domain.Product;

public interface ProductRepository {
    String insert(Product product);
    Product findById(String id);
    void delete(String id);
}
