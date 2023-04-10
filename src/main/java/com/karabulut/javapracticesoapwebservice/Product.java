package com.karabulut.javapracticesoapwebservice;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class Product {
    private Long productId;
    private String productName;
    private Double salesPrice;
}
