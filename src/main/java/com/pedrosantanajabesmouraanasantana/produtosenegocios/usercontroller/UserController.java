package com.pedrosantanajabesmouraanasantana.produtosenegocios.usercontroller;

import com.pedrosantanajabesmouraanasantana.produtosenegocios.model.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public ResponseEntity<User> findAll(){
        User user=new User(1L,"Ana","ana@gmail","45698712365","963123");
        return ResponseEntity.status(HttpStatus.OK).body(user);

    }
}
