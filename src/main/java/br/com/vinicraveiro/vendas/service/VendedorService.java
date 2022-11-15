package br.com.vinicraveiro.vendas.service;

import br.com.vinicraveiro.vendas.core.crud.CrudService;
import br.com.vinicraveiro.vendas.domain.Vendedor;
import org.springframework.stereotype.Service;

@Service
public class VendedorService extends CrudService<Vendedor, Long> {
    @Override
    protected Vendedor editEntity(Vendedor recoreved, Vendedor entity) {
        recoreved.setNome(entity.getNome());
        return recoreved;
    }


}
