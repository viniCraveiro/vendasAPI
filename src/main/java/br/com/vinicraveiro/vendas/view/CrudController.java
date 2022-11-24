package br.com.vinicraveiro.vendas.view;

import br.com.vinicraveiro.vendas.common.crud.CrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Objects;

public abstract class CrudController<T, ID> {
    public CrudController() {
    }

    public CrudController(CrudService<T, ID> service) {
        this.service = service;
    }

    private CrudService<T, ID> service;

    @GetMapping
    public ResponseEntity<List<T>> listAll() {
        List<T> toReturn = service.listAll();
        return ResponseEntity.ok(toReturn);
    }

    @GetMapping("/{id}")
    public ResponseEntity<T> especifico(@PathVariable("id") ID id) {
        T result = service.byId(id);
        if (Objects.isNull(result)) {
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(result);
    }

    @PostMapping
    public ResponseEntity<T> create(@RequestBody T entity) {
        T toReturn = service.create(entity);
        return ResponseEntity.ok(toReturn);
    }

    @PutMapping("/{id}")
    public ResponseEntity<T> edit(@PathVariable("id") ID id, @RequestBody T entity) {
        return ResponseEntity.ok(service.edit(id, entity));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable("id") ID id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}
