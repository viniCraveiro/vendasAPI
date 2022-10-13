package br.com.vinicraveiro.vendas.controller;

import br.com.vinicraveiro.vendas.VendasApplication;
import br.com.vinicraveiro.vendas.domain.Vendedor;
import br.com.vinicraveiro.vendas.service.VendedorService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/vendedor")
public class VendedorController {
    //GET | POST | PUT | DELETE

    private final VendedorService vendedorService;

    public VendedorController(VendedorService vendedorService) {
        this.vendedorService = vendedorService;
    }

    @GetMapping
    public ResponseEntity<List<Vendedor>> listar() {
        List<Vendedor> vendedores = vendedorService.listar();
        return ResponseEntity.ok(vendedores);
    }


    @GetMapping("/{id}")
    public ResponseEntity<Vendedor> especifico(@PathVariable("id") Long id) {
        Vendedor resultado = vendedorService.unicoVendedor(id);

        if (Objects.isNull(resultado)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(resultado);
    }

    @PostMapping
    public ResponseEntity<Vendedor> criar(@RequestBody Vendedor vendedor){
        Vendedor novoVendedor = vendedorService.criar(vendedor);
        return ResponseEntity.ok(novoVendedor);
    }

}
