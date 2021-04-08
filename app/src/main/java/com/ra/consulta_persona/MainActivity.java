package com.ra.consulta_persona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Nombre;
    EditText Apellido;
    EditText Edad;
    EditText Salario;
    EditText Cargo;
    EditText Email;

    Button btnGuardar;
    Button btnMenor;
    Button btnmayor;
    Button btnSalarios;
    Button btnCargos;

    TextView Message;

    ArrayList<Persona> listaPersonas = new ArrayList();
    ArrayList<Integer> listaOrdenada = new ArrayList();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Nombre = findViewById(R.id.txtNombre);
        Apellido =findViewById(R.id.txtApellido);
        Edad =findViewById(R.id.txtEdad);
        Salario =findViewById(R.id.txtSalario);
        Cargo =findViewById(R.id.txtCargo);
        Email =findViewById(R.id.txtEmail);
        Message = findViewById(R.id.txtMessage);
        btnGuardar =findViewById(R.id.btnGuardar);
        btnMenor = findViewById(R.id.btnMenor);
        btnmayor = findViewById(R.id.btnMenor);
        btnSalarios = findViewById(R.id.btnSalarios);
        btnCargos = findViewById(R.id.btnSalarios);

        btnGuardar.setOnClickListener(this);
        btnMenor.setOnClickListener(this);
        btnmayor.setOnClickListener(this);
        btnSalarios.setOnClickListener(this);
        btnCargos.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.btnGuardar){
            String nombre = Nombre.getText().toString();
            String apelido = Apellido.getText().toString();
            Integer edad = Integer.parseInt(Edad.getText().toString());
            Integer salario =Integer.parseInt(Salario.getText().toString());
            String cargo = Cargo.getText().toString();
            String email = Email.getText().toString();

            String mensaje="";

            Persona objPersona = new Persona(nombre, apelido, edad, salario, cargo, email);
            listaPersonas.add(objPersona);
            for (int i = 0; i<listaPersonas.size(); i++) {
                mensaje =listaPersonas.get(i).toString()+"\n";
            }
            Message.setText(mensaje);
        }
        else if (v.getId() == R.id.btnMenor){
            //goConsultas();a
            String menor ="";
            ordenarEdades();
            for (int i = listaOrdenada.size()-1; i>=0; i--) {
                menor =listaOrdenada.get(i).toString();
            }
            Message.setText(menor);
        }
        else if (v.getId() == R.id.btnMayor){
            String mayor ="";
            ordenarEdades();
            for (int i = 0; i<listaOrdenada.size(); i++) {
                 mayor =listaOrdenada.get(i).toString();
            }
            Message.setText(mayor);
        }
        else if (v.getId() == R.id.btnSalarios){
            ordenarSalarios();
            String salarioMenor = "";
            String salarioMayor = "";
            double sumSalarios =0;
            double promSalrio;
            for (int i = 0; i<listaOrdenada.size(); i++) {
                salarioMayor ="El salario mas alto es: "+listaOrdenada.get(i).toString()+"\n";
                sumSalarios=sumSalarios+listaOrdenada.get(i);
            }
            for (int i = listaOrdenada.size()-1; i>=0; i--) {
                salarioMenor ="El salario mas bajo es: "+listaOrdenada.get(i).toString()+"\n";
            }
            promSalrio = sumSalarios/listaOrdenada.size();
            Message.setText(salarioMayor+salarioMenor+"El promedio es: "+promSalrio);

        }
        else if (v.getId() == R.id.btnCargos){

        }

    }

    public ArrayList ordenarEdades(){
        for (int i = 0; i < listaPersonas.size(); i++) {
            listaOrdenada.add(listaPersonas.get(i).getEdad());
        }
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }
    public ArrayList ordenarSalarios(){
        for (int i = 0; i < listaPersonas.size(); i++) {
            listaOrdenada.add(listaPersonas.get(i).getSalario());
        }
        Collections.sort(listaOrdenada);
        return listaOrdenada;
    }

    public void goConsultas()
    {
        Intent myIntent = new Intent(this, Consultas.class);
        startActivity(myIntent);
    }

}


