package com.example.m2_Testing_David_Sans_FullDep.repositories;


import com.example.m2_Testing_David_Sans_FullDep.entities.Perro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerroRepository extends JpaRepository <Perro, Long>{

}
