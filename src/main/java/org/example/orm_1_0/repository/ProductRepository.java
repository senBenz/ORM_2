package org.example.orm_1_0.repository;

import org.example.orm_1_0.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
