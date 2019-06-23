package com.example.wrapper.wrappercontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.wrapper.service.WrapperClassService;
import com.example.wrappermodel.ProductDto;

@RestController
public class WrapperClassController {
	
	@Autowired
	private WrapperClassService wrapperClassService;
	
	@GetMapping(value="/list_product")
	public List<ProductDto> listProduct()
	{
		return wrapperClassService.displayallProductDtoData();
	}
	
	

}
