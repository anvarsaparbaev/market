package com.pcmarket.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "card")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String cardName;

    @NotNull
    @Column(unique = true)
    @Size(min = 16, max = 16, message = "Enter 16 digits.")
    private String cardNumber;

    @NotNull
    @Size(min = 3, max = 4, message = "Enter 4 digits.")
    private String expireDate;

}
