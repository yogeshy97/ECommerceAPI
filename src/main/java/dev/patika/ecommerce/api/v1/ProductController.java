package dev.patika.ecommerce.api.v1;

import dev.patika.ecommerce.business.abstracts.ICategoryService;
import dev.patika.ecommerce.business.abstracts.IProductService;
import dev.patika.ecommerce.business.abstracts.ISupplierService;
import dev.patika.ecommerce.core.config.modelMapper.IModelMapperService;

import dev.patika.ecommerce.core.result.ResultData;
import dev.patika.ecommerce.core.utilities.ResultHelper;
import dev.patika.ecommerce.dto.request.category.CategorySaveRequest;
import dev.patika.ecommerce.dto.request.product.ProductSaveRequest;
import dev.patika.ecommerce.dto.response.category.CategoryResponse;
import dev.patika.ecommerce.dto.response.product.ProductResponse;
import dev.patika.ecommerce.dto.response.supplier.SupplierResponse;
import dev.patika.ecommerce.entities.Category;
import dev.patika.ecommerce.entities.Product;
import dev.patika.ecommerce.entities.Supplier;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/products")
public class ProductController {
    private final IProductService productService;
    private final IModelMapperService modelMapperService;
    private final ICategoryService categoryService;
    private final ISupplierService supplierService;

    public ProductController(IProductService productService,
                             IModelMapperService modelMapper,
                             ICategoryService categoryService,
                             ISupplierService supplierService
    ) {
        this.productService = productService;
        this.modelMapperService = modelMapper;
        this.categoryService = categoryService;
        this.supplierService = supplierService;
    }

    @PostMapping("")
    @ResponseStatus(HttpStatus.CREATED)
    public ResultData<ProductResponse> save(@Valid @RequestBody ProductSaveRequest productSaveRequest) {
        Product product = this.modelMapperService.forRequest().map(productSaveRequest, Product.class);
        Category category = this.categoryService.get(productSaveRequest.getCategory_id());
        Supplier supplier = this.supplierService.get(productSaveRequest.getSupplier_id());
        product.setCategory(category);
        product.setSupplier(supplier);
        this.productService.save(product);
        return ResultHelper.created(this.modelMapperService.forResponse().map(product, ProductResponse.class));
    }
    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<ProductResponse> get(@PathVariable int id) {
        Product product = this.productService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(product, ProductResponse.class));
    }
    @GetMapping("/{id}/supplier")
    @ResponseStatus(HttpStatus.OK)
    public ResultData<SupplierResponse> getSupplier(@PathVariable int id) {
        Product product = this.productService.get(id);
        return ResultHelper.success(this.modelMapperService.forResponse().map(product.getSupplier(), SupplierResponse.class));
    }
}
