package br.com.vinicraveiro.vendas.controller;

import br.com.vinicraveiro.vendas.VendasApplication;
import br.com.vinicraveiro.vendas.domain.Vendedor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    //GET | POST | PUT | DELETE

    @GetMapping
    public ResponseEntity<List<Vendedor>> listar() {
        return ResponseEntity.ok(vendedores());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> especifico(@PathVariable("id") Long id){
        Vendedor resultado = vendedores().stream().filter(vendedor -> vendedor.getId().equals(id)).findFirst().orElse(null);

        if(Objects.isNull(resultado)){
            return ResponseEntity.notFound().build();
        }

        return ResponseEntity.ok(resultado);
    }

    private List<Vendedor> vendedores() {
        Vendedor um = new Vendedor();
        um.setId(1L);
        um.setNome("Joao");

        Vendedor dois = new Vendedor();
        dois.setId(2L);
        dois.setNome("Mauricio");


        return Arrays.asList(um, dois);
    }

}
