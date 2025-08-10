package dev.patika.ecommerce.api.v1;

import dev.patika.ecommerce.business.abstracts.IProductService;
import dev.patika.ecommerce.core.config.modelMapper.IModelMapperService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
    private final IProductService productService;
    private final IModelMapperService modelMapper;
    public ProductController(IProductService productService, IModelMapperService modelMapper) {
        this.productService = productService;
        this.modelMapper = modelMapper;
    }

}
