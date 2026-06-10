package com.treinamento.assurenceit.app;

import com.treinamento.assurenceit.app.feing.viacep.ViaCepFeingClient;
import com.treinamento.assurenceit.app.feing.viacep.ViaCepResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/treinamento")
public class Controller {

    private final ViaCepFeingClient cepFeingClient;

    public Controller(ViaCepFeingClient cepFeingClient){
        this.cepFeingClient = cepFeingClient;
    }

    @GetMapping("/health")
    public ResponseEntity<?> getMessage(){
        return ResponseEntity.ok("UP!");
    }

    @GetMapping("/cep/{cep}")
    public ResponseEntity<ViaCepResponse> getCep(@PathVariable String cep){
        return ResponseEntity.ok(cepFeingClient.buscarPorCep(cep));
    }

}
