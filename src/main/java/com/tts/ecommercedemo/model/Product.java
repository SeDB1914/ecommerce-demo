package com.tts.ecommercedemo.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name= "product_id")
    private long id;

    private int quantity;
    private int price;
   // private double price; used if price includes decimal values

    private String brand;
    private String category;
    private String name;
    private String image;

}
