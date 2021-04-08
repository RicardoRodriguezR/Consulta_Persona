package com.ra.consulta_persona;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Consultas extends AppCompatActivity implements View.OnClickListener {

    Button btnMasJoven;
    Button btnMasViejo;
    Button btnSalarios;
    Button btnCargos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consultas);

         getActivity();
    }
        public void getActivity(){
            Intent getIntent = new Intent(this, MainActivity.class);
            startActivity(getIntent);
        }

    @Override
    public void onClick(View v) {

    }
}