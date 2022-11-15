package br.com.vinicraveiro.vendas.core.crud;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Objects;

public abstract class CrudService<T, ID> {

    @Autowired
    protected CrudRepository<T, ID> repository;

    public List<T> listAll() {
        return repository.findAll();
    }

    public T byId(ID id) {
        return repository.findById(id).orElse(null);
    }

    public T create(T entity) {
        return repository.save(entity);
    }

    public void delete(ID id) {
        repository.deleteById(id);
    }

    public T edit(ID id, T entity) {
        T recovered = byId(id);
        if (Objects.isNull(recovered)) {
            throw new RuntimeException("Not Found !");
        }
        T entitySave = editEntity(recovered, entity);
        return repository.save(entitySave);
    }

    protected abstract T editEntity(T recoreved, T entity);

}
