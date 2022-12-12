package com.anderws.productsk8sapi.entrypoint.controller;

import com.anderws.productsk8sapi.entrypoint.controller.dto.ProductResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
public class ProductController {

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
