package dev.patika.ecommerce.dto.request.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductSaveRequest {

    private String name;
    private double price;
    private int stock;
    private int supplier_id;
    private int category_id;

}
