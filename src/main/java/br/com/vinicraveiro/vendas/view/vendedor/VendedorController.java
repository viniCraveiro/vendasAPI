package br.com.vinicraveiro.vendas.view.vendedor;

import br.com.vinicraveiro.vendas.view.CrudController;
import br.com.vinicraveiro.vendas.domain.vendedor.Vendedor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/vendedor")
public class VendedorController extends CrudController<Vendedor, Long> {



}
