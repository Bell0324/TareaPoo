/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author usuario
 */
public class Empleado {
        private String Nombres;
        private String Apellidos; 
        private String cargo;
        private double salario;

    public Empleado() {
    }

    public Empleado(String Nombres, String Apellidos, String cargo, double salario) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.cargo = cargo;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    // Método para aumentar el salario
    public void aumentarSalario() {
        if (this.salario < 12000) {
            this.salario *= 1.2;
            
        }
    }

    @Override
    public String toString() {
        return "Empleado{" + "Nombres=" + Nombres + ", Apellidos=" + Apellidos + ", cargo=" + cargo + ", salario=" + salario + '}';
    }
           
    
}
