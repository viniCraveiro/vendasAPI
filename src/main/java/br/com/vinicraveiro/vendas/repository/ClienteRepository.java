package br.com.vinicraveiro.vendas.repository;

import br.com.vinicraveiro.vendas.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}
