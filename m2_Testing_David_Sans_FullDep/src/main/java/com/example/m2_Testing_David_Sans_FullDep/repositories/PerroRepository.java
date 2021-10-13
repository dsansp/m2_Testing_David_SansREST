package com.example.m2_Testing_David_Sans_FullDep.repositories;


import antlr.collections.impl.LList;
import com.example.m2_Testing_David_Sans_FullDep.entities.Perro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PerroRepository extends JpaRepository <Perro, Long>{
    List<Perro> findByNameIgnoreCase(String name);
    List<Perro> findByRazaIgnoreCase(String raza);
    List<Perro> findBySexoIgnoreCase(String sexo);
    List<Perro> findByPesoLessThan(Double peso);
    List<Perro> findByFecha_nacimientoBetween(Integer fecha_nacimiento);
    List<Perro> findByLicencia(Boolean licencia);
    List<Perro> findByAdopcionesLessThan(Integer adopciones);
}
