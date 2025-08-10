package dev.patika.ecommerce.core.config.modelMapper;

import dev.patika.ecommerce.dto.request.product.ProductSaveRequest;
import dev.patika.ecommerce.entities.Product;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ModelMapperConfig {

    @Bean
    public ModelMapper getModelMapper() {
        return new ModelMapper();
    }

}
