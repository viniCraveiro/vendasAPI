package br.com.vinicraveiro.vendas.repository;

import br.com.vinicraveiro.vendas.core.crud.CrudRepository;
import br.com.vinicraveiro.vendas.domain.Cliente;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}
