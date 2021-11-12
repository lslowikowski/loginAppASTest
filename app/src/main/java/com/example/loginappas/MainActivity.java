package com.example.loginappas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /********************************************************
     * nazwa funkcji: onCreate
     * parametry wejściowe: savedInstanceState - parametry uruchomieniowe
     * wartość zwracana: brak
     * działanie: uruchamia aplikację
     * autor: 01234567890
     * ****************************************************/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /********************************************************
     * nazwa funkcji: sprawdz
     * parametry wejściowe: view - widok, którego dotyczy zdarzenie
     * wartość zwracana: brak
     * działanie: sprawdza poprawność wprowadzonych do formularza
     * autor: 01234567890
     * ****************************************************/
    public void sprawdz(View view) {
        String sKomunikat = "";
        EditText email = (EditText) findViewById(R.id.email);
        String sEmail = email.getText().toString();
        if(sEmail.indexOf("@")<0) sKomunikat ="Nieprawidłowy adres e-mail";
        else sKomunikat = "Witaj " + sEmail;
        EditText haslo1 = (EditText) findViewById(R.id.haslo1);
        EditText haslo2 = (EditText) findViewById(R.id.haslo2);
        String sHaslo1 = haslo1.getText().toString();
        String sHaslo2 = haslo2.getText().toString();
        if(sHaslo1.equals(sHaslo2)); else sKomunikat = "Hasła się różnią";
        TextView komunikat = (TextView) findViewById(R.id.komunikat);
        komunikat.setText(sKomunikat);
    }
}