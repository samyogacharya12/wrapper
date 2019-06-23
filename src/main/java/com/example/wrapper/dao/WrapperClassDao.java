package com.example.wrapper.dao;

import java.util.List;

import com.example.wrappermodel.Product;
import com.example.wrappermodel.ProductDto;

public interface WrapperClassDao {

		public List<ProductDto> displayallProductDtoData();
	    public List<Product> displayallProductData();
}
