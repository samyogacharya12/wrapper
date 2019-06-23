package com.example.wrapper.service;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.wrapper.dao.WrapperClassDao;
import com.example.wrappermodel.Product;
import com.example.wrappermodel.ProductDto;

@Service
public class WrapperClassServiceImpl implements WrapperClassService {

	@Autowired
	private WrapperClassDao wrapperClassDao;
	
	@Override
	public List<ProductDto> displayallProductDtoData() throws IOException {
		// TODO Auto-generated method stub
		return wrapperClassDao.displayallProductDtoData();
	}

	@Override
	public List<Product> displayallProductData() {
		// TODO Auto-generated method stub
		return wrapperClassDao.displayallProductData();
	}

}
