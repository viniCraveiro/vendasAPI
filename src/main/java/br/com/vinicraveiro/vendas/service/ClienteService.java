package br.com.vinicraveiro.vendas.service;

import br.com.vinicraveiro.vendas.domain.Cliente;
import br.com.vinicraveiro.vendas.repository.ClienteRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Data
public class ClienteService {
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listar() {
        return clienteRepository.findAll();
    }

    public Cliente unicoCliente(Long id) {
        return clienteRepository.findById(id).orElse(null);
    }

    public Cliente criar(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente editar(Long id, Cliente editado) {
        Cliente recuperado = unicoCliente(id);
        if (Objects.isNull(recuperado)) {
            throw new RuntimeException("Não foi encontrado !");
        }
        recuperado.setNome(editado.getNome());
        return clienteRepository.save(recuperado);
    }

    public void excluir(Long id){
        clienteRepository.deleteById(id);
    }

}
