package com.dovalle.microservices.shoppingcart.controller;

import com.dovalle.microservices.shoppingcart.entity.Cart;
import com.dovalle.microservices.shoppingcart.entity.Item;
import com.dovalle.microservices.shoppingcart.service.CartService;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/cart")
@Data
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class CartController {
    private CartService cartService;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/{idCart}")
    public Cart addItem(@PathVariable Long idCart, @RequestBody Item item){
        return this.cartService.addItem(idCart, item);
    }

    @GetMapping("/{idCart}")
    public Cart findById (@PathVariable Long idCart){
        return this.cartService.findById(idCart);
    }

    @DeleteMapping("/{idCart}")
    public Cart removeItem(@PathVariable Long idCart, @RequestBody Item item){
        return this.cartService.removeItem(idCart, item);
    }

    @DeleteMapping("/clear/{idCart}")
    public void clear(@PathVariable Long idCart){
        this.cartService.clear(idCart);
    }
}
