package com.example.sample.controller;

import com.example.sample.entity.Product;
import com.example.sample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/test")
    public String test() {
        return "hello";
    }

    @PostMapping("/save")
    public Product save(@RequestBody Product product) {
        return productService.insert(product);
    }

    @GetMapping("/search")
    public Product search(@RequestBody Long id) {
        return productService.searchById(id);
    }

    @PostMapping("/products")
//    @RequestMapping(name = "/products", method = RequestMethod.GET)
    public List<Product> getAllProducts() {
        return productService.showAll();
    }

    @DeleteMapping("/delete")
    public void delete(@RequestBody Long id) {
        productService.delete(id);
    }


}
