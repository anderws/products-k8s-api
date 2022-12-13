package com.anderws.productsk8sapi.dataprovider.repository.mapper;

import com.anderws.productsk8sapi.core.domain.Product;
import com.anderws.productsk8sapi.dataprovider.repository.entity.ProductEntity;
import com.anderws.productsk8sapi.entrypoint.controller.dto.ProductRequest;
import com.anderws.productsk8sapi.entrypoint.controller.dto.ProductResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface ProductMapper {
    ProductEntity toProductEntity(Product product);
    @Mapping(target = "id", ignore = true)
    Product toProduct(ProductRequest productRequest);
    ProductResponse toProductResponse(Product product);
    Product toProduct(ProductEntity productEntity);
}
