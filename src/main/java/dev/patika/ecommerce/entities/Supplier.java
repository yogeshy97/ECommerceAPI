package dev.patika.ecommerce.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "suppliers")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id")
    private int id;
    @Column(name = "supplier_company")
    private String companyName;
    @Column(name = "supplier_contact")
    private String contactName;
    @Column(name = "supplier_addres")
    private String address;
    @Column(name = "supplier_mail")
    private String contactMail;
    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
