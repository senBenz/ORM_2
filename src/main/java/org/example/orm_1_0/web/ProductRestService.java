package org.example.orm_1_0.web;

import jakarta.annotation.Resource;
import jakarta.persistence.Access;
import org.example.orm_1_0.entities.Product;
import org.example.orm_1_0.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class ProductRestService {
   @Autowired
    private ProductRepository productRepository;

   @GetMapping("/products")
   public List<Product> produit() {
       return productRepository.findAll();
   }
   @GetMapping("/products/{id}")
   public List <Product> findproductById(@PathVariable Long id){
       Product product=productRepository.findById(id).orElse(null);
       return List.of(product);
   }

}
