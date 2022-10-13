package br.com.vinicraveiro.vendas.service;

import br.com.vinicraveiro.vendas.domain.Vendedor;
import br.com.vinicraveiro.vendas.repository.VendedorRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class VendedorService {

    private final VendedorRepository vendedorRepository;

    public VendedorService(VendedorRepository vendedorRepository) {
        this.vendedorRepository = vendedorRepository;
    }

    public List<Vendedor> listar() {
        return vendedorRepository.findAll();
    }

    public Vendedor unicoVendedor(Long id) {
        return vendedorRepository.findById(id).orElse(null);
    }

    public Vendedor criar(Vendedor vendedor){
        return vendedorRepository.save(vendedor);
    }


}
