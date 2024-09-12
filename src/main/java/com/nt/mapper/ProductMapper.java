package com.nt.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.nt.dto.ProductDto;
import com.nt.entity.Product;
@Component
public class ProductMapper {
	public ProductDto toDto( Product e ) {
		ProductDto dto = new ProductDto();
		dto.setId( e.getId() );
		dto.setName( e.getName() );
		dto.setStock(e.getStock());
		
		return dto;
	}
	public List<ProductDto> toDtoList( List<Product> list ) {
		List<ProductDto> dtos = new ArrayList<ProductDto>();
		for ( Product e : list ) {
			ProductDto dto = toDto( e );
			dtos.add( dto );
		}
		return dtos;
	}}
