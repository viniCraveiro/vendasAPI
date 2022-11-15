package br.com.vinicraveiro.vendas.service;

import br.com.vinicraveiro.vendas.core.crud.CrudService;
import br.com.vinicraveiro.vendas.domain.Cliente;
import org.springframework.stereotype.Service;

@Service
public class ClienteService extends CrudService<Cliente, Long> {
    @Override
    protected Cliente editEntity(Cliente recoreved, Cliente entity) {
        recoreved.setNome(entity.getNome());
        return recoreved;
    }


}
