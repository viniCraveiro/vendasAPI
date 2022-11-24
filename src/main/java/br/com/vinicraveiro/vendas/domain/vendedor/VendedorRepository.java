package br.com.vinicraveiro.vendas.domain.vendedor;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends CrudRepository<Vendedor, Long> {

}
