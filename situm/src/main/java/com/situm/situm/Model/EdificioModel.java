package com.situm.situm.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import com.situm.situm.Enums.TipoVia;


/*Clase que contiene los atributos de la tabla edificio en la base de datos
 * Esta clase se encarga de mapear los atributos de la tabla edificio en la base de datos
*/
@Entity
@Table(name = "edificio") // Nombre de la tabla en la BD

public class EdificioModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "IDEDIFICIO")
    private int idEdificio;

    @Column(name = "NOMBREEDIFICIO", length = 50)
    private String nombre;

    @Enumerated(EnumType.STRING)//Debido a que se usa un Enum se tiene que especificar el tipo, para que no haya errores al momento de mapear
    @Column(name = "TIPOVIA", length = 50)
    private TipoVia tipoVia;

    @Column(name = "NOMBREVIA", length = 50)
    private String nombreVia;

    @Column(name = "CODIGOPOSTAL", length = 10)
    private int codigoPostal;

    @Column(name = "CANTIDADPLANTAS")
    private int cantidadPlantas;

    @Column(name = "NHABITACION")
    private int cantidadHabitaciones;

    @Column(name = "PAIS", length = 30)
    private String pais;

    @Column(name = "PROVINCIA", length = 30)
    private String provincia;

    @Column(name = "CIUDAD", length = 50)
    private String localidad;

    // Constructor vacio
    public EdificioModel() {
    }

    // Constructor con argumentos
    public EdificioModel(int idEdificio, String nombre, TipoVia tipoVia, String nombreVia, int codigoPostal, int cantidadPlantas, int cantidadHabitaciones, String pais, String provincia, String localidad) {
        this.idEdificio = idEdificio;
        this.nombre = nombre;
        this.tipoVia = tipoVia;
        this.nombreVia = nombreVia;
        this.codigoPostal = codigoPostal;
        this.cantidadPlantas = cantidadPlantas;
        this.cantidadHabitaciones = cantidadHabitaciones;
        this.pais = pais;
        this.provincia = provincia;
        this.localidad = localidad;
    }

    // Getters y setters
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
        return tipoVia;
    }

    public void setTipoVia(TipoVia tipoVia) {
        this.tipoVia = tipoVia;
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
        return cantidadPlantas;
    }

    public void setCantidadPlantas(int cantidadPlantas) {
        this.cantidadPlantas = cantidadPlantas;
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
