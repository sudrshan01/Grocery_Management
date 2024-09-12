package com.nt.cntrl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.nt.Repo.ProductRepository;
import com.nt.dto.ProductDto;
import com.nt.entity.Product;
import com.nt.service.Product_Service;

@RestController
public class ProductController {
	@Autowired
	private Product_Service prodService;
	// start using dto

	// http://localhost:8080/selectall
	@GetMapping("/selectall")
	public List<ProductDto> selectallProduct() {
		List<ProductDto> opt = prodService.findAll();
		return opt;

	}

	// http://localhost:8080/select/id/1
	@GetMapping("/select/id/{id}")
		public ProductDto selectid(@PathVariable int id) {
		ProductDto opt = prodService.findById(id);
						return opt;
		}
	
	
	
	
	
	

	// http://localhost:8080/select/namess/siya
	@GetMapping("/select/namess/{name}")
	public List<ProductDto> selectName(@PathVariable String name) {
		List<ProductDto> opt = prodService.findByName(name);

		return opt;
	}

	// http://localhost:8080/nameNull
	@GetMapping("/nameNull")
	public List<ProductDto> selectNameNull() {
		List<ProductDto> opt = prodService.findByNameIsNull();

		return opt;
	}

	// http://localhost:8080/start/namelike/s
	@GetMapping("/start/namelike/{name}")
	public List<Product> selectNamelike(@PathVariable String name) {
		List<Product> opt = prodService.findByNameStartingWith(name);

		return opt;
	}

	// http://localhost:8080/end/namelike/s
	@GetMapping("/end/namelike/{name}")
	public List<Product> selectNameEndlike(@PathVariable String name) {
		List<Product> opt = prodService.findByNameEndingWith(name);

		return opt;
	}

	// http://localhost:8080/cont/namelike/s
	@GetMapping("/cont/namelike/{name}")
	public List<Product> selectNameContains(@PathVariable String name) {
		List<Product> opt = prodService.findByNameContains(name);

		return opt;
	}

	// http://localhost:8080/order/name/siya
	@GetMapping("/order/name/{name}")
	public List<Product> selectNameorder(@PathVariable String name) {
		List<Product> opt = prodService.findByNameOrderByNameAsc(name);

		return opt;
	}

	// http://localhost:8080/order/name/siya
	@GetMapping("/orderdd/name/{name}")
	public List<Product> selectNameorderdesc(@PathVariable String name) {
		List<Product> opt = prodService.findByNameOrderByNameDesc(name);

		return opt;
	}

	// http://localhost:8080/stock/50
	@GetMapping("/stock/{stock}")
	public List<Product> selectStock(@PathVariable int stock) {
		List<Product> opt = prodService.findByStockGreaterThan(stock);

		return opt;
	}

	// http://localhost:8080/stockEqual/50
	@GetMapping("/stockEqual/{stock}")
	public List<Product> selectStockEqual(@PathVariable int stock) {
		List<Product> opt = prodService.findByStockGreaterThanEqual(stock);

		return opt;
	}

	// http://localhost:8080/stockless/50
	@GetMapping("/stockless/{stock}")
	public List<Product> selectStocless(@PathVariable int stock) {
		List<Product> opt = prodService.findByStockLessThan(stock);

		return opt;
	}

	// http://localhost:8080/stockless/equal/50
	@GetMapping("/stockless/equal/{stock}")
	public List<Product> selectStoclessEqual(@PathVariable int stock) {
		List<Product> opt = prodService.findByStockLessThanEqual(stock);

		return opt;
	}

	// http://localhost:8080/pricebet/500/1000
	@GetMapping("/pricebet/{price}/{id}")
	public List<Product> selectPrice(@PathVariable int price, @PathVariable int id) {
		List<Product> opt = prodService.findByPriceBetween(price, id);

		return opt;
	}

	// http://localhost:8080/pricegre/500
	@GetMapping("/pricegre/{price}")
	public List<Product> selectPriceGreter(@PathVariable int price) {
		List<Product> opt = prodService.findByPriceGreaterThanEqual(price);

		return opt;
	}

	// http://localhost:8080/name/siya/stock/40
	@GetMapping("/name/{name}/stock/{stock}")
	public List<Product> selectnameorstock(@PathVariable String name, @PathVariable int stock) {
		List<Product> opt = prodService.findByNameOrStock(name, stock);

		return opt;
	}

	// http://localhost:8080/and/name/siya/stock/40
	@GetMapping("/and/name/{name}/stock/{stock}")
	public List<Product> selectNameandStock(@PathVariable String name, @PathVariable int stock) {
		List<Product> opt = prodService.findByNameAndStock(name, stock);

		return opt;
	}

	// http://localhost:8080/and/name/siya/stock/40
	@GetMapping("/name/{name}/stock/{stock}/price/{price}")
	public List<Product> selectNameorStockAndprice(@PathVariable String name, @PathVariable int stock,
			@PathVariable int price) {
		List<Product> opt = prodService.findByNameOrStockAndPrice(name, stock, price);

		return opt;
	}

	// http://localhost:8080/a/name/rama/stock/50/price/1100
	@GetMapping("/a/name/{name}/stock/{stock}/price/{price}")
	public List<Product> selectNameAndStockAndprice(@PathVariable String name, @PathVariable int stock,
			@PathVariable int price) {
		List<Product> opt = prodService.findByNameAndStockAndPrice(name, stock, price);

		return opt;
	}

	//
	@GetMapping("/like/name/{name}")
	public List<Product> selectNameLike(@PathVariable String name) {
		List<Product> opt = prodService.findByNameLike(name);

		return opt;
	}

	// http://localhost:8080/or/name/siya/stock/40/price/100
	@GetMapping("/or/name/{name}/stock/{stock}/price/{price}")
	public List<Product> selectNameorStockOrprice(@PathVariable String name, @PathVariable int stock,
			@PathVariable int price) {
		List<Product> opt = prodService.findByNameOrStockOrPrice(name, stock, price);

		return opt;
	}

	// http://localhost:8080/stocktop/asc
	@GetMapping("/stocktop/asc")
	public List<Product> selecttopAscStock() {
		List<Product> opt = prodService.findTop3ByOrderByStockAsc();

		return opt;
	}

	// http://localhost:8080/stocktop/desc
	@GetMapping("/stocktop/desc")
	public List<Product> selectTopDescStock() {
		List<Product> opt = prodService.findTop3ByOrderByStockDesc();

		return opt;
	}

	// quert native query

	// http://localhost:8080/allre
	@GetMapping("/allre")
	public List<Product> selectall() {
		List<Product> opt = prodService.findAllProducts();

		return opt;
	}

	// http://localhost:8080/idrec/8
	@GetMapping("/idrec/{id}")
	public List<Product> selectallid(@PathVariable int id) {
		List<Product> opt = prodService.findAllProductsid(id);

		return opt;
	}

	// http://localhost:8080/priceid
	@GetMapping("/priceid")
	public List<Integer> selectPrice() {
		List<Integer> prices = prodService.findPricesById();
		return prices;
	}

	// http://localhost:8080/priceid/id
	@GetMapping("/priceidd")
	public List<Integer> selectPriced() {
		List<Integer> prices = prodService.findPricesByIda();
		return prices;
	}

	// http://localhost:8080/namepro
	@GetMapping("/namepro")
	public List<String> selectPrname() {
		List<String> prices = prodService.findNamepro();
		return prices;
	}
}
