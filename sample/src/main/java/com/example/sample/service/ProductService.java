package com.example.sample.service;

import com.example.sample.dao.ProductDao;
import com.example.sample.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductDao productDao;

    public Product insert(Product product) {
        return productDao.save(product);
    }

    public List<Product> showAll() {
        return productDao.findAll();
    }

    public Product searchById(Long id) {
        Optional<Product> product = productDao.findById(id);
        Product p = new Product();
        if(product.isPresent()) {
            p = product.get();
        }
        return p;
    }

    public void delete(Long id){
        productDao.deleteById(id);
    }


}
