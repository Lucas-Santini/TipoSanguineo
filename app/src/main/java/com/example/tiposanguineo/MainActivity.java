package com.example.tiposanguineo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void actionButton(View v){
        //Entrada
        //vinculo:
        EditText etN = (EditText)findViewById(R.id.idN);
        //tratamento
        String n = etN.getText().toString();
        //Calculo
        //instanciação
        String fat = (new tipoSanguineo()).doacao(n);
        //Saida
        TextView etR = (TextView) findViewById(R.id.idR);
        etR.setText(fat);
    }

}