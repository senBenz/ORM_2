package org.example.orm_1_0;

import org.example.orm_1_0.entities.Product;
import org.example.orm_1_0.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.List;

@SpringBootApplication
public class Orm10Application implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(Orm10Application.class, args);
    }
    @Autowired
    private ProductRepository productRepository;
    @Override
    public void run(String... args) throws Exception {
        productRepository.save(new Product(null,"Macbook Air M3",11000,1));
        productRepository.save(new Product(null,"Macbook Air M2",13000,14));
        productRepository.save(new Product(null,"Macbook Air M1",18000,10));
        List<Product> products = productRepository.findAll();
        products.forEach(System.out::println);

        Product product = productRepository.findById(Long.valueOf(2)).get();
        System.out.println("*******************");
        System.out.println(" product id :"+ product.getId());
        System.out.println(" product name :"+ product.getName());
        System.out.println(" product price :"+product.getPrice());
        System.out.println("product quantity :"+product.getQuantity());


       


    }
}
