package com.example.wrapper.service;

import java.util.List;

import com.example.wrappermodel.Product;
import com.example.wrappermodel.ProductDto;

public interface WrapperClassService {

	public List<ProductDto> displayallProductDtoData();
    public List<Product> displayallProductData();
}
