package br.com.vinicraveiro.vendas.repository;

import br.com.vinicraveiro.vendas.domain.Vendedor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Long> {

}
