package com.webshop.mapping.dto;

import com.webshop.mapping.domain.Category;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProductDto {

    private Long id;

    private String name;

    private double price;

    private Double rating;

    private CategoryDto category;

}
