package br.com.vinicraveiro.vendas.controller;

import br.com.vinicraveiro.vendas.domain.Vendedor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    //GET | POST | PUT | DELETE

    @GetMapping
    public ResponseEntity<String> nomeVendedor(){
        return ResponseEntity.ok("Vinicius");
    }
}
