package br.com.vinicraveiro.vendas.domain.cliente;

import br.com.vinicraveiro.vendas.common.crud.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
