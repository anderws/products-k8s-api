package com.anderws.productsk8sapi.entrypoint.controller.dto;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponse {
    private String name;
    private int price;
    private String category;
}
