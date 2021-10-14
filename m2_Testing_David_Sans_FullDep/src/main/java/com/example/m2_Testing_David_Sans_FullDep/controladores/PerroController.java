package com.example.m2_Testing_David_Sans_FullDep.controladores;

import com.example.m2_Testing_David_Sans_FullDep.entities.Perro;
import com.example.m2_Testing_David_Sans_FullDep.repositories.PerroRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PerroController {

    PerroRepository repository;

    public PerroController(PerroRepository repository) {
        this.repository = repository;
    }

    // Get Recuperar

    @GetMapping("/verperros")
    public List<Perro> findAll() {
        return repository.findAll();
    }

    // Post Crear

    @PostMapping("/perros")
    public void create(@RequestBody Perro perro) {
        if (perro.getId() == null)
            repository.save(perro);
    }

    // Put actualizar / modificar
    @PutMapping("/perros")
    public void update(@RequestBody Perro perro) {
        if (perro.getId() != null && repository.existsById(perro.getId())) {
            repository.save(perro);
        }

    }

    // Delete Borrar
    @DeleteMapping("/perros/{id}")
    public void deleteById(@PathVariable Long id) {
        if (repository.existsById(id))
            repository.deleteById(id);

    }
}

