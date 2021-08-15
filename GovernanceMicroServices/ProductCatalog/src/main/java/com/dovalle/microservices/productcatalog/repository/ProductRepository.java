package com.dovalle.microservices.productcatalog.repository;

import com.dovalle.microservices.productcatalog.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepository extends CrudRepository<Product, Long> {

    List<Product> findByName (String name);
}
