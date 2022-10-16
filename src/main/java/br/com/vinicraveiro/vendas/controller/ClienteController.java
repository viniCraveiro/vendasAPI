package br.com.vinicraveiro.vendas.controller;

import br.com.vinicraveiro.vendas.domain.Cliente;
import br.com.vinicraveiro.vendas.service.ClienteService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteController {

    private final ClienteService clienteService;

    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }

    @GetMapping
    public ResponseEntity<List<Cliente>> listar() {
        List<Cliente> clientes = clienteService.listar();
        return ResponseEntity.ok(clientes);
    }

    @PostMapping
    public ResponseEntity<Cliente> criar(@RequestBody Cliente cliente){
        Cliente novoCliente = clienteService.criar(cliente);
        return ResponseEntity.ok(novoCliente);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Cliente> editar(@PathVariable("id") Long id, @RequestBody Cliente cliente){
        return ResponseEntity.ok(clienteService.editar(id,cliente));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable("id") Long id){
        clienteService.excluir(id);
        return ResponseEntity.ok().build();
    }

}
