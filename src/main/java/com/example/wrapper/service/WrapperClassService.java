package com.example.wrapper.service;

import java.io.IOException;
import java.util.List;

import com.example.wrappermodel.Product;
import com.example.wrappermodel.ProductDto;

public interface WrapperClassService {

	public List<ProductDto> displayallProductDtoData() throws IOException;
    public List<Product> displayallProductData();
}
