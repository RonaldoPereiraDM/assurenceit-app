package com.treinamento.assurenceit.app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/treinamento")
public class Controller {

    @GetMapping("/up")
    public ResponseEntity<?> getMessage(){
        return ResponseEntity.ok("UP!");
    }
}
