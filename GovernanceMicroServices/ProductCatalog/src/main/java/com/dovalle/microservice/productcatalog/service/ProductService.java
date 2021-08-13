package com.dovalle.microservice.productcatalog.service;

import com.dovalle.microservice.productcatalog.entity.Product;
import com.dovalle.microservice.productcatalog.repository.ProductRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductService {
    private final ProductRepository productRepository;

    public Product create (Product product){
        return this.productRepository.save(product);
    }

    public Optional<Product> findById(Long id){
        return this.productRepository.findById(id);
    }

    public List<Product> listAll(){
        return (List<Product>) this.productRepository.findAll();
    }

    public List<Product> findByName(String name){
        return this.productRepository.findByName(name);
    }

}
