package com.nt.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.Repo.ProductRepository;
import com.nt.dto.ProductDto;
import com.nt.entity.Product;
import com.nt.mapper.ProductMapper;

@Service
public class Product_Service {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ProductMapper map;

	public List<ProductDto> findByName(String name) {

		List<Product> opt = productRepository.findByName(name);
		List<ProductDto> dtos = map.toDtoList( opt );
		return dtos;
 

	}

	public List<ProductDto> findByNameIsNull() {
		List<Product> opt = productRepository.findByNameIsNull();
		List<ProductDto> dtos = map.toDtoList( opt );
		return dtos;
	}

	public List<Product> findByNameStartingWith(String name) {
		List<Product> opt = productRepository.findByNameStartingWith(name);

		return opt;
	}

	public List<Product> findByNameEndingWith(String name) {
		List<Product> opt = productRepository.findByNameEndingWith(name);

		return opt;
	}

	public List<Product> findByNameContains(String name) {
		List<Product> opt = productRepository.findByNameContains(name);

		return opt;
	}

	public List<Product> findByNameOrderByNameAsc(String name) {
		List<Product> opt = productRepository.findByNameOrderByNameAsc(name);

		return opt;
	}

	public List<Product> findByNameOrderByNameDesc(String name) {
		List<Product> opt = productRepository.findByNameOrderByNameDesc(name);

		return opt;
	}

	public List<Product> findByStockGreaterThan(int stock) {
		List<Product> opt = productRepository.findByStockGreaterThan(stock);

		return opt;
	}

	public List<Product> findByStockGreaterThanEqual(int stock) {
		List<Product> opt = productRepository.findByStockGreaterThanEqual(stock);

		return opt;
	}

	public List<Product> findByStockLessThan(int stock) {
		List<Product> opt = productRepository.findByStockLessThan(stock);

		return opt;

	}

	public List<Product> findByStockLessThanEqual(int stock) {
		List<Product> opt = productRepository.findByStockLessThanEqual(stock);

		return opt;

	}

	public List<Product> findByPriceBetween(int price, int id) {
		List<Product> opt = productRepository.findByPriceBetween(price, id);

		return opt;
	}

	public List<Product> findByPriceGreaterThanEqual(int price) {
		List<Product> opt = productRepository.findByPriceGreaterThanEqual(price);

		return opt;

	}

	public List<Product> findByNameOrStock(String name, int stock) {
		List<Product> opt = productRepository.findByNameOrStock(name, stock);

		return opt;
	}

	public List<Product> findByNameAndStock(String name, int stock) {
		List<Product> opt = productRepository.findByNameAndStock(name, stock);

		return opt;
	}

	public List<Product> findByNameOrStockAndPrice(String name, int stock, int price) {
		List<Product> opt = productRepository.findByNameOrStockAndPrice(name, stock, price);

		return opt;
	}

	public List<Product> findByNameAndStockAndPrice(String name, int stock, int price) {
		List<Product> opt = productRepository.findByNameAndStockAndPrice(name, stock, price);

		return opt;
	}

	public List<Product> findByNameLike(String string) {
		List<Product> opt = productRepository.findByNameLike(string + "%");

		return opt;

	}

	public List<Product> findByNameOrStockOrPrice(String name, int stock, int price) {
		List<Product> opt = productRepository.findByNameOrStockOrPrice(name, stock, price);

		return opt;

	}

	public List<Product> findTop3ByOrderByStockAsc() {
		List<Product> opt = productRepository.findTop3ByOrderByStockAsc();

		return opt;

	}

	public List<Product> findTop3ByOrderByStockDesc() {
		List<Product> opt = productRepository.findTop3ByOrderByStockDesc();

		return opt;
	}

	public List<Product> findAllProducts() {
		List<Product> opt = productRepository.findAllProducts();

		return opt;
	}

	public List<Product> findAllProductsid(int id) {
		List<Product> opt = productRepository.findAllProductsid(id);

		return opt;
	}

	public List<Integer> findPricesById() {
		List<Integer> prices = productRepository.findPricesById();
		return prices;
	}

	public List<Integer> findPricesByIda() {
		List<Integer> prices = productRepository.findPricesByIda();
		return prices;
	}

	public List<String> findNamepro() {
		List<String> prices = productRepository.findNamepro();
		return prices;
	}

	public List<ProductDto> findAll() {
		List<Product> pl = (List<Product>) productRepository.findAll();
		List<ProductDto> dtos = map.toDtoList( pl );
		return dtos;
	}

	public ProductDto findById(int id) {
		Optional<Product> p = productRepository.findById(id);
		if (p.isPresent()) {
			Product e = p.get();
			ProductDto dto = map.toDto(e);
			return dto;
		}
		return null;
	}
}
