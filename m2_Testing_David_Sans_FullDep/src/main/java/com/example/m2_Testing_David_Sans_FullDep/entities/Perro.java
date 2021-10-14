package com.example.m2_Testing_David_Sans_FullDep.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Perro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )

    private Long id;
    private Integer chip;
    private String name;
    private  String raza;
    private String sexo;
    private Double peso;
    private LocalDate fecha_nacimiento;
    private Boolean licencia;
    private Integer adopciones;

    public Perro() {
    }

    public Perro(Long id, Integer chip, String name, String raza, String sexo, Double peso, LocalDate fecha_nacimiento, Boolean licencia, Integer adopciones) {
        this.id = id;
        this.chip = chip;
        this.name = name;
        this.raza = raza;
        this.sexo = sexo;
        this.peso = peso;
        this.fecha_nacimiento = fecha_nacimiento;
        this.licencia = licencia;
        this.adopciones = adopciones;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getChip() {
        return chip;
    }

    public void setChip(Integer chip) {
        this.chip = chip;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public LocalDate getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setFecha_nacimiento(LocalDate fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

    public Boolean getLicencia() {
        return licencia;
    }

    public void setLicencia(Boolean licencia) {
        this.licencia = licencia;
    }

    public Integer getAdopciones() {
        return adopciones;
    }

    public void setAdopciones(Integer adopciones) {
        this.adopciones = adopciones;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "id=" + id +
                ", chip=" + chip +
                ", name='" + name + '\'' +
                ", raza='" + raza + '\'' +
                ", sexo='" + sexo + '\'' +
                ", peso=" + peso +
                ", fecha_nacimiento=" + fecha_nacimiento +
                ", licencia=" + licencia +
                ", adopciones=" + adopciones +
                '}';
    }
}

