package br.com.vinicraveiro.vendas.repository;

import br.com.vinicraveiro.vendas.domain.Vendedor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendedorRepository extends JpaRepository<Vendedor, Long> {

}
