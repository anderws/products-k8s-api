package com.anderws.productsk8sapi.dataprovider;

import com.anderws.productsk8sapi.core.dataprovider.ProductRepository;
import com.anderws.productsk8sapi.core.domain.Product;
import com.anderws.productsk8sapi.dataprovider.exception.ResourceNotFoundException;
import com.anderws.productsk8sapi.dataprovider.repository.ProductRepositoryJpa;
import com.anderws.productsk8sapi.dataprovider.repository.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductGatewayRepository implements ProductRepository {
    @Autowired
    private ProductRepositoryJpa productRepositoryJpa;
    @Autowired
    private ProductMapper productMapper;
    @Override
    public String insert(Product product) {
        var productEntity = productMapper.toProductEntity(product);
        var productSave = productRepositoryJpa.insert(productEntity);
        return productSave.getId();
    }

    @Override
    public Product findById(String id) {
        var productEntity = productRepositoryJpa.findById(id);
        if(productEntity.isEmpty()) throw new ResourceNotFoundException("Product not found");
        var product = productMapper.toProduct(productEntity.get());
        return product;
    }

    @Override
    public void delete(String id) {
        productRepositoryJpa.deleteById(id);
    }

}
