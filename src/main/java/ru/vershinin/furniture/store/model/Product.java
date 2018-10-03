package ru.vershinin.furniture.store.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Product {


    @Id
    @GeneratedValue
    int id;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "product")
    ProductType productType;

    String name;
    String description;
}
