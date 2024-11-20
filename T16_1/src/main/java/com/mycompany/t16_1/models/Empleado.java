package com.mycompany.t16_1.models;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Empleado {
    private String nombre;
    private String apellido;
    private Date fechaN;

SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    public Empleado() {
    }

    public Empleado(String nombre, String apellido, Date fechaN) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaN = fechaN;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }

    @Override
    public String toString() {
        return "Empleado: " + nombre + " "+ apellido + ", nació en " + dateFormat.format(fechaN) ;
    }

    
}
