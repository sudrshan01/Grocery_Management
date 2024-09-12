package com.nt.Repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nt.entity.Product;

public interface ProductRepository extends CrudRepository<Product, Integer> {
	List<Product> findByName(String name);

	List<Product> findByNameIsNull();

	List<Product> findByNameStartingWith(String name);

	List<Product> findByNameEndingWith(String name);

	List<Product> findByNameContains(String name);

	List<Product> findByNameOrderByNameAsc(String name);

	List<Product> findByNameOrderByNameDesc(String name);

	List<Product> findByStockGreaterThan(int stock);

	List<Product> findByStockGreaterThanEqual(int stock);

	List<Product> findByStockLessThan(int stock);

	List<Product> findByStockLessThanEqual(int stock);

	List<Product> findByPriceBetween(int price, int id);

	List<Product> findByPriceGreaterThanEqual(int price);

	List<Product> findByNameOrStock(String name, int stock);

	List<Product> findByNameAndStock(String name, int stock);

	List<Product> findByNameOrStockAndPrice(String name, int stock, int price);

	List<Product> findByNameAndStockAndPrice(String name, int stock, int price);

	List<Product> findByNameLike(String name);

	List<Product> findByNameOrStockOrPrice(String name, int stock, int price);

	List<Product> findTop3ByOrderByStockAsc();

	List<Product> findTop3ByOrderByStockDesc();

	@Query(value = "SELECT * FROM product", nativeQuery = true)
	List<Product> findAllProducts();

	@Query(value = "Select * From product where id=?", nativeQuery = true)
	List<Product> findAllProductsid(int id);

	@Query(value = "SELECT price FROM product", nativeQuery = true)
	List<Integer> findPricesById();

	@Query(value = "SELECT p.price FROM Product p", nativeQuery = true)
	List<Integer> findPricesByIda();

	@Query(value = "SELECT pro.name FROM Product pro", nativeQuery = true)
	List<String> findNamepro();

}
