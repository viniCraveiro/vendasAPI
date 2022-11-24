package br.com.vinicraveiro.vendas.domain.vendedor;

import br.com.vinicraveiro.vendas.common.crud.CrudService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class VendedorService extends CrudService<Vendedor, Long> {

    VendedorRepository vendedorRepository;

    public VendedorService(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public VendedorService() {
    }

    @Override
    protected Vendedor editEntity(Vendedor recoreved, Vendedor entity) {
        recoreved.setNome(entity.getNome());
        return recoreved;
    }


}
