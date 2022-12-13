package com.anderws.productsk8sapi.config;

import com.anderws.productsk8sapi.core.usecase.impl.InsertProductUsecaseImpl;
import com.anderws.productsk8sapi.dataprovider.ProductGatewayRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertProductConfig {
    @Bean
    public InsertProductUsecaseImpl insertProductUsecase(ProductGatewayRepository productGatewayRepository){
        return new InsertProductUsecaseImpl(productGatewayRepository);
    }
}
