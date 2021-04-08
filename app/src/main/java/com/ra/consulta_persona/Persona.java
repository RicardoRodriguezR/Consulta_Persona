package com.ra.consulta_persona;

import android.widget.EdgeEffect;
import android.widget.EditText;

public class Persona {

    String Nombre;
    String Apellido;
    Integer Edad;
    Integer Salario;
    String Cargo;
    String Email;

    public Persona(String nombre, String apellido, Integer edad, Integer salario, String cargo, String email) {
        Nombre = nombre;
        Apellido = apellido;
        Edad =  edad;
        Salario = salario;
        Cargo = cargo;
        Email = email;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public Integer getEdad() {
        return Edad;
    }

    public void setEdad(Integer edad) {
        Edad = edad;
    }

    public Integer getSalario() {
        return Salario;
    }

    public void setSalario(Integer salario) {
        Salario = salario;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String cargo) {
        Cargo = cargo;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return  "Nombre: " + Nombre +" "+Apellido +"\n"+
                "Edad: " + Edad +" Salario: "+ Salario +"\n"+
                "Cargo: " + Cargo +"\n"+
                "Email: " + Email;
    }
}
