package br.com.vinicraveiro.vendas.controller;

import br.com.vinicraveiro.vendas.VendasApplication;
import br.com.vinicraveiro.vendas.domain.Vendedor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    //GET | POST | PUT | DELETE

    @GetMapping
    public ResponseEntity<List<Vendedor>> listar(){
        Vendedor um = new Vendedor();
        um.setId(1L);
        um.setNome("Joao");

        Vendedor dois = new Vendedor();
        dois.setId(2L);
        dois.setNome("Mauricio");

        var vendedores = Arrays.asList(um, dois);

        return ResponseEntity.ok(vendedores);
    }


}
