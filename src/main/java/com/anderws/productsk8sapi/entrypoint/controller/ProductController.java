package com.anderws.productsk8sapi.entrypoint.controller;

import com.anderws.productsk8sapi.core.usecase.DeleteProductByIdUsecase;
import com.anderws.productsk8sapi.core.usecase.FindProductByIdUsecase;
import com.anderws.productsk8sapi.core.usecase.InsertProductUsecase;
import com.anderws.productsk8sapi.dataprovider.repository.mapper.ProductMapper;
import com.anderws.productsk8sapi.entrypoint.controller.dto.ProductRequest;
import com.anderws.productsk8sapi.entrypoint.controller.dto.ProductResponse;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

    @Autowired
    private ProductMapper productMapper;
    @Autowired
    private InsertProductUsecase insertProductUsecase;
    @Autowired
    private FindProductByIdUsecase findProductByIdUsecase;
    @Autowired
    private DeleteProductByIdUsecase deleteProductByIdUsecase;

    @PostMapping
    public ResponseEntity<String> insert(@Valid @RequestBody ProductRequest productRequest){
        var product = productMapper.toProduct(productRequest);
        String id = insertProductUsecase.insert(product);
        return ResponseEntity.ok().body(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductResponse> findById(@PathVariable final String id){
        var product = findProductByIdUsecase.findById(id);
        var productResponse = productMapper.toProductResponse(product);
        return ResponseEntity.ok().body(productResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable final String id){
        findProductByIdUsecase.findById(id);
        deleteProductByIdUsecase.delete(id);
        return ResponseEntity.noContent().build();
    }

    @GetMapping
    public ResponseEntity<List<ProductResponse>> findAll(){
        List<ProductResponse> responses = new ArrayList<ProductResponse>();

        responses.add(ProductResponse
                .builder()
                        .name("TV")
                        .price(1999)
                        .category("Eletronics")
                .build());
        return ResponseEntity.ok().body(responses);
    }
}
