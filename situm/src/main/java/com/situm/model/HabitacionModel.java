package com.situm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.situm.enums.categoria;
import com.situm.enums.estado;

@Entity
@Table(name = "habitacion") // Nombre de la tabla en la BD
@Getter
@Setter
public class HabitacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idHabitacion;

    @Column(name = "IDEDIFICIO")
    private int idEdificio;

    @Column(name = "PLANTA")
    private int NumeroPlanta;

    @Column(name = "CATEGORIA")
    private categoria categoria;

    @Column(name = "CAPACIDAD")
    private int capacidad;

    @Column(name = "ESTADO")
    private estado estado;

    @Column(name = "LETRAPUERTA")
    private String letraPuerta;

    @Column(name = "NBAÑOSHABITACION")
    private int numeroBanios;


    public HabitacionModel(int idHabitacion, int idEdificio, int numeroPlanta, categoria categoria, int capacidad,
            estado estado, String letraPuerta, int numeroBanios) {
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
    public categoria getCategoria() {
        return categoria;
    }
    public void setCategoria(categoria categoria) {
        this.categoria = categoria;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public estado getEstado() {
        return estado;
    }
    public void setEstado(estado estado) {
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
