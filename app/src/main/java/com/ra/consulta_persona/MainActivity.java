package com.ra.consulta_persona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText Nombre;
    EditText Apellido;
    EditText Edad;
    String edad;
    EditText Salario;
    EditText Cargo;
    EditText Email;
    Button btnGuardar;
    TextView Message;
    Button btnConsultas;
    Button mostrarLista;

    Persona objPersona ;
    ArrayList<Persona> listaPersonas = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nombre = findViewById(R.id.txtNombre);
        Apellido =findViewById(R.id.txtApellido);
        Edad =findViewById(R.id.txtEdad);
        edad = Edad.getText().toString().trim();
        Salario =findViewById(R.id.txtSalario);
        Cargo =findViewById(R.id.txtCargo);
        Email =findViewById(R.id.txtEmail);
        Message = findViewById(R.id.txtMessage);
        btnGuardar =findViewById(R.id.btnGuardar);
        btnConsultas = findViewById(R.id.btnConsultas);
        mostrarLista = findViewById(R.id.btnMostrarLista);

        objPersona = new Persona(Nombre, Apellido, Edad, Salario, Cargo, Email);
        btnGuardar.setOnClickListener(this);
        btnConsultas.setOnClickListener(this);
        mostrarLista.setOnClickListener(this);
    }

    public void onClick(View v)
    {
        if (v.getId() == R.id.btnGuardar){
            listaPersonas.add(objPersona);
            elMasJoven(listaPersonas);
            //for (int i = 0; i<listaPersonas.size(); i++) {
                //Message.setText(listaPersonas.get(i).getEdad().getText().toString());
            //}
        }
        else if (v.getId() == R.id.btnConsultas){
            goConsultas();
        }
        else if (v.getId() == R.id.btnMostrarLista){
            elMasJoven(listaPersonas);
        }
    }

    public void goConsultas()
    {
        Intent myIntent = new Intent(this, Consultas.class);
        startActivity(myIntent);
    }

    /*public static void ordenarLista(ArrayList<Viajero> lista) {
    for (int i = 0; i < lista.size(); i++) {
        for (int j = 0; j < lista.size(); j++) {
            if(lista.get(i).getComida() < lista.get(j).getComida()) {
                Viajero aux = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, aux);
                }
            }
        }
        public static void BurbujaColObj(ArrayList<Jugador> jugador) {
    Jugador aux;
    for(int i = 0;i < jugador.size()-1;i++){
        for(int j = 0;j < jugador.size()-i-1;j++){
            // El if de abajo va a determinar si el primero es menor que el segundo
            // y si es true, se va a realizar el swap con una variable aux para
            // mover los objetos del array
            if(jugador.get(j+1).getpartidasGanadas() <  jugador.get(j).getpartidasGanadas()){
                aux = jugador.get(j+1);
                jugador.set(j+1,jugador.get(j));
                jugador.set(j,aux);
            }
        }
    }
}
    }*/

    public void elMasJoven(ArrayList<Persona> personas ){
        Persona aux;
        for (int i = 0; i < personas.size()-1; i++){
            for (int j = 0; j < personas.size()-i-1; j++){
                if (Integer.parseInt(personas.get(j+1).getEdad().getText().toString()) < Integer.parseInt(personas.get(j).getEdad().getText().toString())){
                     aux = personas.get(j+1);
                     personas.set(j+1, personas.get(j));
                     personas.set(j, aux);
                }
            }
        }
        printLista(personas);
    }


    private void printLista(ArrayList<Persona> listaPer){
        for (int i = 0; i < listaPersonas.size()-1; i++){
            Message.setText(listaPer.get(i).getEdad().getText().toString()+"\n---------");
        }
    }
}


