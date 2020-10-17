package com.example.l161100033;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText valor1, valor2;
    Button suma,resta,multiplicacion, division,limpiar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = (Button)findViewById(R.id.btnS);
        multiplicacion = (Button)findViewById(R.id.btnM);
        division = (Button)findViewById(R.id.btnD);
        limpiar = (Button)findViewById(R.id.btnL);
        resta = (Button)findViewById(R.id.btnR);
        valor1 = (EditText)findViewById(R.id.uno);
        valor2 = (EditText) findViewById(R.id.dos);
       final TextView mensajes = (TextView)findViewById(R.id.mensaje);

        limpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                valor1.setText("");
                valor2.setText("");
                mensajes.setText("");
            }
        });




        division.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float su = 0;
                String va1 = valor1.getText().toString();
                String va2 = valor2.getText().toString();
                if(va1.isEmpty()||va2.isEmpty()){
                    if(va1.isEmpty())
                        valor1.setError("No ingreso el número");
                    if(va2.isEmpty())
                        valor2.setError("No ingreso el número");
                }else{
                    float n1 = Integer.valueOf(va1);
                    float n2 = Integer.valueOf(va2);
                    if(n1==0 || n2 ==0){
                        AlertDialog.Builder alerta = new AlertDialog.Builder(MainActivity.this);
                        alerta.setMessage("No se puede dividir entre Cero").setNegativeButton("Aceptar", null).create().show();
                    }else{
                        su = n1 / n2;
                         String men = String.valueOf(su);
                        mensajes.setText(men);
                    }

                }
            }
        });

        multiplicacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su = 0;
                String va1 = valor1.getText().toString();
                String va2 = valor2.getText().toString();
                if(va1.isEmpty()||va2.isEmpty()){
                    if(va1.isEmpty())
                        valor1.setError("No ingreso el número");
                    if(va2.isEmpty())
                        valor2.setError("No ingreso el número");
                }else{
                    int n1 = Integer.valueOf(va1);
                    int n2 = Integer.valueOf(va2);

                    su = n1 * n2;
                    String men = String.valueOf(su);
                    mensajes.setText(men);
                     }
            }
        });




        suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int su = 0;
                String va1 = valor1.getText().toString();
                String va2 = valor2.getText().toString();
                if(va1.isEmpty()||va2.isEmpty()){
                    if(va1.isEmpty())
                        valor1.setError("No ingreso el número");
                    if(va2.isEmpty())
                        valor2.setError("No ingreso el número");
                }else{
                    int n1 = Integer.valueOf(va1);
                    int n2 = Integer.valueOf(va2);

                    su = n1 +n2;

                    String men = String.valueOf(su);
                    mensajes.setText(men);
                  }
            }
        });

        resta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float res;
                String va1 = valor1.getText().toString();
                String va2 = valor2.getText().toString();
                if(va1.isEmpty()||va2.isEmpty()){
                    if(va1.isEmpty())
                        valor1.setError("No ingreso el número");
                    if(va2.isEmpty())
                        valor2.setError("No ingreso el número");
                }else{
                    float n1 = Integer.valueOf(va1);
                    float n2 = Integer.valueOf(va2);

                    res = n1 - n2;
                    String men = String.valueOf(res);
                    mensajes.setText(men);
                }
            }
        });

    }
}