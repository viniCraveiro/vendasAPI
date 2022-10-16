package br.com.vinicraveiro.vendas.service;

import br.com.vinicraveiro.vendas.domain.Vendedor;
import br.com.vinicraveiro.vendas.repository.VendedorRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

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

    public Vendedor criar(Vendedor vendedor) {
        return vendedorRepository.save(vendedor);
    }

    public Vendedor editar(Long id, Vendedor editado) {
        Vendedor recuperado = unicoVendedor(id);
        if (Objects.isNull(recuperado)) {
            throw new RuntimeException("Não foi encontrado");
        }
        recuperado.setNome(editado.getNome());
        return vendedorRepository.save(recuperado);
    }

    public void excluir(Long id) {
        vendedorRepository.deleteById(id);
    }

}
