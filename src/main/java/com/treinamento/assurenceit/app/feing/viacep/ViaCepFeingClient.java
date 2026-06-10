package com.treinamento.assurenceit.app.feing.viacep;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "viacep", url = "${viacep.base-url}")
public interface ViaCepFeingClient {

    @GetMapping("/ws/{cep}/json/")
    ViaCepResponse buscarPorCep(@PathVariable("cep") String cep);

}
