package br.com.vinicraveiro.vendas.controller;

import br.com.vinicraveiro.vendas.core.crud.CrudController;
import br.com.vinicraveiro.vendas.domain.Cliente;
import br.com.vinicraveiro.vendas.domain.Vendedor;
import br.com.vinicraveiro.vendas.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, Long> {


}
