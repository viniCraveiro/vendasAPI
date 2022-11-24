package br.com.vinicraveiro.vendas.view.cliente;

import br.com.vinicraveiro.vendas.view.CrudController;
import br.com.vinicraveiro.vendas.domain.cliente.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/cliente")
public class ClienteController extends CrudController<Cliente, Long> {


}
