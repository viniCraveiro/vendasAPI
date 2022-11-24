package br.com.vinicraveiro.vendas.domain.cliente;

import br.com.vinicraveiro.vendas.common.crud.CrudService;
import br.com.vinicraveiro.vendas.domain.cliente.Cliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ClienteService extends CrudService<Cliente, Long> {

    ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }
    public ClienteService() {
    }

    @Override
    protected Cliente editEntity(Cliente recoreved, Cliente entity) {
        recoreved.setNome(entity.getNome());
        return recoreved;
    }


}
