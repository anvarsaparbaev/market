package com.pcmarket.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "product")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @NotNull
    private String productName;

    @NotNull
    private String about;

    @NotNull
    private BigDecimal price;

    @ManyToOne
    @NotNull
    private Category category;

    @ManyToMany
    @NotNull
    @ToString.Exclude
    private List<Attachment> pictures;

    @ManyToOne
    private Brand brand;

    @NotNull
    @Column(unique = true)
    private String codeForOneProduct;

}