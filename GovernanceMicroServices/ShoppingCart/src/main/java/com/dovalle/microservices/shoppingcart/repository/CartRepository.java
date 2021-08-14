package com.dovalle.microservices.shoppingcart.repository;

import com.dovalle.microservices.shoppingcart.entity.Cart;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartRepository extends CrudRepository<Cart, Long> {
    Cart findByCustomerId(Integer idCostumer);
}
