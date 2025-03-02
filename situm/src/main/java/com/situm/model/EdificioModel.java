package com.situm.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "edificio") // Nombre de la tabla en la BD
@Getter
@Setter
public class EdificioModel {

    private int idEdificio;
    private String nombre;
    private String direccion;
    private Enum  TipoVia;
    private int codigoPostal;
    private int CantidadPlantas;
    private int cantidadHabitaciones;
    private String pais;
    private String provincia;
    private String localidad;

    public EdificioModel(int idEdificio, String nombre, String direccion, Enum tipoVia, int codigoPostal, int cantidadPlantas, int cantidadHabitaciones, String pais, String provincia, String localidad) {
        this.idEdificio = idEdificio;
        this.nombre = nombre;
        this.direccion = direccion;
        TipoVia = tipoVia;
        this.codigoPostal = codigoPostal;
        CantidadPlantas = cantidadPlantas;
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
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public Enum getTipoVia() {
        return TipoVia;
    }
    public void setTipoVia(Enum tipoVia) {
        TipoVia = tipoVia;
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
