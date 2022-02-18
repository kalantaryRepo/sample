package com.example.sample.controller;

import com.example.sample.entity.Product;
import com.example.sample.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping(name = "/save")
    public Product save(@RequestBody Product product) {
        return productService.insert(product);
    }

    @GetMapping(name = "/search")
    public Product search(@RequestBody Long id) {
        return productService.searchById(id);
    }

//    @PostMapping(name = "/products")
////    @RequestMapping(name = "/products", method = RequestMethod.GET)
//    public List<Product> getAllProducts() {
//        return productService.showAll();
//    }
//
//    @DeleteMapping(name = "/delete")
//    public void delete(@RequestBody Long id) {
//        productService.delete(id);
//    }


}
