package dev.patika.ecommerce.dto.response.product;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

public class ProductResponse {
        private int id;
        private String name;
        private double price;
        private int stock;
        private int supplier_id;
        private int category_id;
    }
