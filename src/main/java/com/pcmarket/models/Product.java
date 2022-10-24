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
    private Long id;

    @NotNull
    private String productName;

    @NotNull
    private String about;

    @NotNull
    private BigDecimal price;

    @OneToOne
    @NotNull
    private Category category;

    @ManyToMany
    @NotNull
    @ToString.Exclude
    private List<Picture> pictures;

    @ManyToOne
    private Brand brand;

    @NotNull
    @Column(unique = true)
    private String codeForOneProduct;

}