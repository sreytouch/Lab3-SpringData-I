package com.webshop.mapping.controller;

import com.webshop.mapping.domain.Product;
import com.webshop.mapping.dto.ProductDto;
import com.webshop.mapping.dto.ReviewDto;
import com.webshop.mapping.service.ProductService;
import com.webshop.mapping.service.ReviewService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    ProductService productService;

    ReviewService reviewService;

    public ProductController(ProductService productService, ReviewService reviewService){
        this.productService = productService;
        this.reviewService = reviewService;
    }

    @GetMapping
    public ResponseEntity<List<ProductDto>> getAll(){
        var products = productService.findAll();
        return ResponseEntity.ok().body(products);
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProductDto> getById(@PathVariable Long id){
        var product = productService.findById(id);
        return ResponseEntity.ok(product);
    }

    @PostMapping
    public ResponseEntity<ProductDto> create(@RequestBody ProductDto product){
        product = productService.save(product);
        return ResponseEntity.ok(product);
    }

    @PutMapping("/{id}")
    public ResponseEntity<ProductDto> update(@RequestBody ProductDto product, @PathVariable Long id){
        product.setId(id);
        product = productService.save(product);
        return ResponseEntity.ok(product);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id){
        productService.remove(id);
        return new ResponseEntity(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}/reviews")
    public ResponseEntity<List<ReviewDto>> getProductReview(@PathVariable Long id){
        List<ReviewDto> reviewDtos = reviewService.findAllReviewByProductId(id);
        return ResponseEntity.ok(reviewDtos);
    }

    @GetMapping("/filter-price-greater-than")
    public ResponseEntity<List<ProductDto>> findAllByPriceGreaterThan(@RequestParam("min-price") Double minPrice){
        List<ProductDto> productDtos = productService.findAllByPriceGreaterThan(minPrice);
        return ResponseEntity.ok(productDtos);
    }

    @GetMapping("/filter-category-and-price-less-than")
    public ResponseEntity<List<ProductDto>> findByCategoryNameAndPriceLessThan(@RequestParam("max-price") Double maxPrice, @RequestParam("category") String category){
        List<ProductDto> productDtos = productService.findByCategoryNameAndPriceLessThan(category, maxPrice);
        return ResponseEntity.ok(productDtos);
    }

    @GetMapping("/filter-name")
    public ResponseEntity<List<ProductDto>> findAllByNameContains(@RequestParam String name){
        List<ProductDto> productDtos = productService.findAllByNameContains(name);
        return ResponseEntity.ok(productDtos);
    }

}
