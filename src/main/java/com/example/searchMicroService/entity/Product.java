package com.example.searchMicroService.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document(indexName = "productindex",shards = 2)
public class Product {

    @Id
    private int id;
    private String category;
    private String brand;
    private int merchantId;
    private int price;
    private int stock;
    private int rating;
    private int camera;
    private int ram;
    private String processor;
    private String dialShape;
    private String strapMaterial;
    private String headphoneType;
    private String color;
    private String screenType;
    private int screenSize;
    private String image;

}
