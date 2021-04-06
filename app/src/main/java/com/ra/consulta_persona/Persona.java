package com.ra.consulta_persona;

import android.widget.EdgeEffect;
import android.widget.EditText;

public class Persona {

    EditText Nombre;
    EditText Apellido;
    EditText Edad;
    EditText Salario;
    EditText Cargo;
    EditText Email;

    public Persona(EditText nombre, EditText apellido, EditText edad, EditText salario, EditText cargo, EditText email) {
        Nombre = nombre;
        Apellido = apellido;
        Edad =  edad;
        Salario = salario;
        Cargo = cargo;
        Email = email;
    }

    public EditText  getNombre() {
        return Nombre;
    }

    public void setNombre(EditText nombre) {
        Nombre = nombre;
    }

    public EditText getApellido() {
        return Apellido;
    }

    public void setApellido(EditText apellido) {
        Apellido = apellido;
    }

    public EditText getEdad() {
        return Edad;
    }

    public void setEdad(EditText edad) {
        Edad = edad;
    }

    public EditText getSalario() {
        return Salario;
    }

    public void setSalario(EditText salario) {
        Salario = salario;
    }

    public EditText getCargo() {
        return Cargo;
    }

    public void setCargo(EditText cargo) {
        Cargo = cargo;
    }

    public EditText getEmail() {
        return Email;
    }

    public void setEmail(EditText email) {
        Email = email;
    }

    @Override
    public String toString() {
        return  "Nombre: " + Nombre.getText().toString() +"\n"+
                "Apellido: " + Apellido.getText().toString() +"\n"+
                "Edad: " + Edad.getText().toString() +"\n" +
                "Salario: " + Salario.getText().toString() +"\n"+
                "Cargo: " + Cargo.getText().toString() +"\n"+
                "Email: " + Email.getText().toString();
    }
}
