package org.example;

public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;

    void incrementarSueldo(int porcentajeIncemento) {
    	this.sueldo+=sueldo*(1+porcentajeIncemento/100.0);
    }
}
