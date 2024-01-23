package com.product.crud.repository;

import com.product.crud.entity.ProductEntity;
import com.product.crud.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    ProductEntity findProductById(int id);
}
