package com.example.springbootasm.controller;

import com.example.springbootasm.entity.Account;
import com.example.springbootasm.entity.Credential;
import com.example.springbootasm.entity.Product;
import com.example.springbootasm.repository.AccountRepository;
import com.example.springbootasm.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/seed/generate")
public class SeedController {
    @Autowired
    private ProductRepository productRepository;
    private AccountRepository accountRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String seed(){
        Product product1 = new Product(1,"Iphone 5", 10000000);
        Product product2 = new Product(2,"Iphone 6", 20000000);
        Product product3 = new Product(3,"Iphone 7", 30000000);
        Product product4 = new Product(4,"Iphone 8", 40000000);
        Product product5 = new Product(5,"Iphone X", 50000000);
        Product product6 = new Product(6,"Oppo", 2000000);
        Product product7 = new Product(7,"Ghế gaming", 4000000);
        Product product8 = new Product(8,"Chuột steelseries", 2000000);
        Product product9 = new Product(9,"Tai nghe edra", 70000000);
        Product product10 = new Product(10,"Màn hình Sony", 1000000);
        List<Product> products = Arrays.asList(product1, product2, product3, product4,product5, product6, product7, product8, product9, product10);
        productRepository.saveAll(products);
        return "done";
    }
}
