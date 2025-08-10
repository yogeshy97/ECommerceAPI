package dev.patika.ecommerce.core.config.modelMapper;

import dev.patika.ecommerce.dto.request.product.ProductSaveRequest;
import dev.patika.ecommerce.entities.Product;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ModelMapperService implements IModelMapperService {

    private final ModelMapper modelMapper;

    @Autowired
    public ModelMapperService(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }
    public ModelMapper forRequest() {
        this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.STRICT);
        return new ModelMapper();
    }
    public ModelMapper forResponse() {
        this.modelMapper.getConfiguration().setAmbiguityIgnored(true).setMatchingStrategy(MatchingStrategies.LOOSE);
        return new ModelMapper();
    }
}
