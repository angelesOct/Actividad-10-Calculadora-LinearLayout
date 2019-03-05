package com.example.calculadora_v2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edt_numero1;
    EditText edt_numero2;
    TextView txt_resultado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edt_numero1 = (EditText)findViewById(R.id.edt_numero1);
        edt_numero2 = (EditText)findViewById(R.id.edt_numero2);
        txt_resultado = (TextView)findViewById(R.id.txt_resultado);
    }
    public void sumarOnclick(View view){
        float numero1 = Float.parseFloat(edt_numero1.getText().toString());
        float numero2 = Float.parseFloat(edt_numero2.getText().toString());
        float suma = numero1 + numero2;
        txt_resultado.setText(String.valueOf(suma));
    }
    public void restaOnclick(View view){
        float numero1 = Float.parseFloat(edt_numero1.getText().toString());
        float numero2 = Float.parseFloat(edt_numero2.getText().toString());
        float resta = numero1 - numero2;
        txt_resultado.setText(String.valueOf(resta));
    }
    public void multiplicacionOnclick(View view){
        float numero1 = Float.parseFloat(edt_numero1.getText().toString());
        float numero2 = Float.parseFloat(edt_numero2.getText().toString());
        float mult = numero1 * numero2;
        txt_resultado.setText(String.valueOf(mult));
    }
    public void divisionOnclick(View view){
        float numero1 = Float.parseFloat(edt_numero1.getText().toString());
        float numero2 = Float.parseFloat(edt_numero2.getText().toString());
        float division = numero1 / numero2;
        txt_resultado.setText(String.valueOf(division));
    }
    public void moduloOnclick(View view){
        float numero1 = Float.parseFloat(edt_numero1.getText().toString());
        float numero2 = Float.parseFloat(edt_numero2.getText().toString());
        float modulo = numero1 % numero2;
        txt_resultado.setText(String.valueOf(modulo));
    }
}
