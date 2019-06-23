package com.example.wrapper.dao;

import java.io.IOException;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.example.wrappermodel.Product;
import com.example.wrappermodel.ProductDto;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@Repository
public class WrapperClassDaoImpl extends JdbcDaoSupport implements WrapperClassDao {

	
	 @Autowired	
		DataSource datasource;
	    
	    @PostConstruct
	    public void initialize()
	    {
	    	setDataSource(datasource);
	    }

	@Override
	public List<ProductDto> displayallProductDtoData() {
		// TODO Auto-generated method stub
		List<Product> data=displayallProductData();
		Gson gson=new Gson();
		String json=gson.toJson(data);
		System.out.println(json);
		ObjectMapper mapper=new ObjectMapper();
		//TypeReference<List<?>> typeReference1=new TypeReference<List<?>>() {};
		try {
			TypeReference<List<ProductDto>> typeReference=new TypeReference<List<ProductDto>>() {};
			List<ProductDto> value=mapper.readValue(json, typeReference);
			System.out.println(value);
			for(ProductDto values:value)
			{
				System.out.println(values);
			}
			return value;
		} catch (JsonParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JsonMappingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> displayallProductData() {
		// TODO Auto-generated method stub
		String sql="SELECT * FROM product";
		RowMapper<Product> value=new BeanPropertyRowMapper<Product>(Product.class);
		return this.getJdbcTemplate().query(sql, value);
	}

}
