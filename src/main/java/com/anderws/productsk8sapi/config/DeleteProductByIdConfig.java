package com.anderws.productsk8sapi.config;

import com.anderws.productsk8sapi.core.usecase.impl.DeleteProductByIdUsecaseImpl;
import com.anderws.productsk8sapi.dataprovider.ProductGatewayRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteProductByIdConfig {
    @Bean
    public DeleteProductByIdUsecaseImpl deleteProductByIdUsecaseImpl(ProductGatewayRepository productGatewayRepository){
        return new DeleteProductByIdUsecaseImpl(productGatewayRepository);
    }
}
