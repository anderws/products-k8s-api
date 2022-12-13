package com.anderws.productsk8sapi.entrypoint.controller.dto;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private int price;
    private String category;
}
