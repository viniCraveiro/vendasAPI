package br.com.vinicraveiro.vendas.domain.cliente;

import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends org.springframework.data.jpa.repository.JpaRepository<Cliente, Long> {

}
