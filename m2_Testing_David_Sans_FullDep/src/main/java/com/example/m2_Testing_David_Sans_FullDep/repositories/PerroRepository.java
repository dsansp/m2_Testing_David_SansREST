package com.example.m2_Testing_David_Sans_FullDep.repositories;


import antlr.collections.impl.LList;
import com.example.m2_Testing_David_Sans_FullDep.entities.Perro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface PerroRepository extends JpaRepository <Perro, Long>{
    List<Perro> findByNameIgnoreCase(String name);
    List<Perro> findByChipIgnoreCase(String chip);
    List<Perro> findByRazaIgnoreCase(String raza);
    List<Perro> findBySexoIgnoreCase(String sexo);
    List<Perro> findByPesoLessThan(Double peso);
    List<Perro> findByLicencia(Boolean licencia);
    List<Perro> findByAdopcionesLessThan(Integer adopciones);
}
