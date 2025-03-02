package com.situm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "habitacion") // Nombre de la tabla en la BD
@Getter
@Setter
public class HabitacionModel {

    private int idHabitacion;
    private int idEdificio;
    private int NumeroPlanta;
    private Enum categoria;
    private int capacidad;
    private Enum estado;
    private String letraPuerta;
    private int numeroBanios;


    public HabitacionModel(int idHabitacion, int idEdificio, int numeroPlanta, Enum categoria, int capacidad,
            Enum estado, String letraPuerta, int numeroBanios) {
        this.idHabitacion = idHabitacion;
        this.idEdificio = idEdificio;
        NumeroPlanta = numeroPlanta;
        this.categoria = categoria;
        this.capacidad = capacidad;
        this.estado = estado;
        this.letraPuerta = letraPuerta;
        this.numeroBanios = numeroBanios;
    }


    public int getIdHabitacion() {
        return idHabitacion;
    }
    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }
    public int getIdEdificio() {
        return idEdificio;
    }
    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }
    public int getNumeroPlanta() {
        return NumeroPlanta;
    }
    public void setNumeroPlanta(int numeroPlanta) {
        NumeroPlanta = numeroPlanta;
    }
    public Enum getCategoria() {
        return categoria;
    }
    public void setCategoria(Enum categoria) {
        this.categoria = categoria;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public Enum getEstado() {
        return estado;
    }
    public void setEstado(Enum estado) {
        this.estado = estado;
    }
    public String getLetraPuerta() {
        return letraPuerta;
    }
    public void setLetraPuerta(String letraPuerta) {
        this.letraPuerta = letraPuerta;
    }
    public int getNumeroBanios() {
        return numeroBanios;
    }
    public void setNumeroBanios(int numeroBanios) {
        this.numeroBanios = numeroBanios;
    }

}
