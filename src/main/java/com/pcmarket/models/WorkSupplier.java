package com.pcmarket.models;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity(name = "work_supplier")
public class WorkSupplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToMany
    @ToString.Exclude
    private List<Account> accounts;

    @NotNull
    @Size(min = 4, message = "Enter your job name. Min size characters - 4.")
    private String topic;

    @NotNull
    @Size(min = 30, message = "Enter skills at this your job etc.")
    private String message;

}
