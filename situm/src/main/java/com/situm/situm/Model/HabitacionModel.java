package com.situm.situm.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.situm.situm.Enums.Categoria;
import com.situm.situm.Enums.Estado;

/*Clase que se encarga de mapear los atributos de la tabla habitacion en la base de datos
 * esta clase contiene los atributos de la tabla habitacion en la base de datos
*/
@Entity
@Table(name = "habitacion") // Nombre de la tabla en la BD

public class HabitacionModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDHABITACION")
    private int idHabitacion;

    @Column(name = "IDEDIFICIO")
    private int idEdificio;

    @Column(name = "PLANTA")
    private int NumeroPlanta;

    @Enumerated(EnumType.STRING)//Debido a que se usa un Enum se tiene que especificar el tipo, para que no haya errores al momento de mapear
    @Column(name = "CATEGORIA")
    private Categoria categoria;

    @Column(name = "CAPACIDAD")
    private int capacidad;

    @Enumerated(EnumType.STRING)//Debido a que se usa un Enum se tiene que especificar el tipo, para que no haya errores al momento de mapear
    @Column(name = "ESTADO")
    private Estado estado;

    @Column(name = "LETRAPUERTA")
    private String letraPuerta;

    @Column(name = "NBAÑOSHABITACION")
    private int numeroBanios;

    // Constructor vacio
    public HabitacionModel() {
    }

    // Constructor con argumentos
    public HabitacionModel(int idHabitacion, int idEdificio, int numeroPlanta, Categoria categoria, int capacidad,
            Estado estado, String letraPuerta, int numeroBanios) {
        this.idHabitacion = idHabitacion;
        this.idEdificio = idEdificio;
        this.NumeroPlanta = numeroPlanta;
        this.categoria = categoria;
        this.capacidad = capacidad;
        this.estado = estado;
        this.letraPuerta = letraPuerta;
        this.numeroBanios = numeroBanios;
    }

    // Getters y setters
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
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

