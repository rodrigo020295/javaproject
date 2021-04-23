package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.analistard.models.Product;
import com.analistard.services.ProductService;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

	
	@Autowired
	private ProductService productService;
	
	@GetMapping(value = "/{id}")
    public ResponseEntity<Product> findById(@PathVariable Long id) {
	Product obj = productService.findById(id);
	return ResponseEntity.ok().body(obj);
	
	
}
}
