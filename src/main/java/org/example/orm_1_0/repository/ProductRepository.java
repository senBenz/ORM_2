package org.example.orm_1_0.repository;

import org.example.orm_1_0.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {


    //premiere methode avec Contains et un nom d attribut convenable en ce cas name
    List<Product> findByNameContains(String keyword);
    List<Product> findByPriceGreaterThan(double price);

    //deuxieme methode avec l annotation query
//    @Query("select p from Product p where p.name like :x")
//    List<Product> search(@Param("x") String ky);
}
