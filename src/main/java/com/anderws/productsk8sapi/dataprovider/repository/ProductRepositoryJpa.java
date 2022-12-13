package com.anderws.productsk8sapi.dataprovider.repository;

import com.anderws.productsk8sapi.dataprovider.repository.entity.ProductEntity;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepositoryJpa extends MongoRepository<ProductEntity, String> {
}
