package com.situm.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.situm.enums.TipoVia;

@Entity
@Table(name = "edificio") // Nombre de la tabla en la BD
@Getter
@Setter
public class EdificioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEdificio;

    @Column(name = "NOMBREEDIFICIO", length = 50)
    private String nombre;

    @Column(name = "TIPOVIA", length = 50)
    private TipoVia  TipoVia;

    @Column(name = "NOMBREVIA", length = 50)
    private String nombreVia;

    @Column(name = "codigo_postal", length = 10)
    private int codigoPostal;

    @Column(name = "cantidad_plantas")
    private int CantidadPlantas;

    @Column(name = "NHABITACION")
    private int cantidadHabitaciones;

    @Column(name = "PAIS", length = 30)
    private String pais;

    @Column(name = "PROVINCIA", length = 30)
    private String provincia;

    @Column(name = "CIUDAD", length = 50)
    private String localidad;

    public EdificioModel(int idEdificio, String nombre,  TipoVia tipoVia, String nombreVia,  int codigoPostal, int cantidadPlantas, int cantidadHabitaciones, String pais, String provincia, String localidad) {
        this.idEdificio = idEdificio;
        this.nombre = nombre;
        this.TipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.codigoPostal = codigoPostal;
        this.CantidadPlantas = cantidadPlantas;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.pais = pais;
        this.provincia = provincia;
        this.localidad = localidad;
    }




    public int getIdEdificio() {
        return idEdificio;
    }

    public void setIdEdificio(int idEdificio) {
        this.idEdificio = idEdificio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public TipoVia getTipoVia() {
        return TipoVia;
    }
    public void setTipoVia(TipoVia tipoVia) {
        TipoVia = tipoVia;
    }

    public String getNombreVia() {
        return nombreVia;
    }

    public void setNombreVia(String nombreVia) {
        this.nombreVia = nombreVia;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    public int getCantidadPlantas() {
        return CantidadPlantas;
    }

    public void setCantidadPlantas(int cantidadPlantas) {
        CantidadPlantas = cantidadPlantas;
    }

    public int getCantidadHabitaciones() {
        return cantidadHabitaciones;
    }

    public void setCantidadHabitaciones(int cantidadHabitaciones) {
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public String getLocalidad() {
        return localidad;
    }
    
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }




}
