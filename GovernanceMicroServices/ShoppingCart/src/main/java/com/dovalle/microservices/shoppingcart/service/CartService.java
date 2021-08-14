package com.dovalle.microservices.shoppingcart.service;

import com.dovalle.microservices.shoppingcart.entity.Cart;
import com.dovalle.microservices.shoppingcart.entity.Item;
import com.dovalle.microservices.shoppingcart.repository.CartRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartService {
    private final CartRepository cartRepository;

    public Cart findById(Long idCart){
        Cart cartAux = new Cart();
        cartAux = this.cartRepository.findById(idCart).orElse(cartAux);
        return cartAux;
    }

    public Cart addItem(Long idCart, Item item){
        Cart cart = this.setOrReturn(idCart);
        cart.getItems().add(item);
        return this.cartRepository.save(cart);
    }

    public Cart removeItem(Long idCart, Item item){
        Cart cart = this.setOrReturn(idCart);
        if (cart.getItems() != null && !cart.getItems().isEmpty()){
            cart.getItems().remove(item);
        }

        return this.cartRepository.save(cart);
    }

    public void clear(Long idCart){
        Cart cart = setOrReturn(idCart);
        this.cartRepository.delete(cart);
    }

    private Cart setOrReturn(Long idCart){
        Cart cartAux = this.findById(idCart);
        if (cartAux.getId() == null){
            cartAux.setId(idCart);
        }
        if(cartAux.getItems() == null){
            cartAux.setItems(new ArrayList<>());
        }
        return cartAux;
    }


}
