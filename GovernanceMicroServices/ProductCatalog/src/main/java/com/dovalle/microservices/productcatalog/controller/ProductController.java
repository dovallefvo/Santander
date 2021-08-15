package com.dovalle.microservices.productcatalog.controller;

import com.dovalle.microservices.productcatalog.entity.Product;
import com.dovalle.microservices.productcatalog.service.ProductService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/product")
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class ProductController {
    private ProductService productService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Product create (@RequestBody Product product){
        return this.productService.create(product);
    }

    @GetMapping("/{id}")
    public Optional<Product> findById (@PathVariable Long id){
        return this.productService.findById(id);
    }

    @GetMapping
    public List<Product> listAll(){
        return this.productService.listAll();
    }

    @GetMapping("/name/{name}")
    public List<Product> findByName(@PathVariable String name){
        return this.productService.findByName(name);
    }

}
