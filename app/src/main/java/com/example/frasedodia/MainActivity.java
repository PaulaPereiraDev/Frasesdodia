package com.example.frasedodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNovaFrase(View view) {

        String[] frases = {
                "Nunca deixe de acreditar no seu potencial, mesmo que algumas pessoas te façam questioná-lo.",
                "Nunca é demais fazer mais uma pessoa sorrir durante o seu dia.",
                "Não duvide que você é merecedor de uma vida plena. Seja feliz sempre!",
                "Se atreva a ser corajoso, lute pelos seus sonhos e desfrute de cada conquista."
        };


        int numero = new Random().nextInt(4); //gerar números aleatórios.

        TextView texto = findViewById(R.id.txtResultado);
        texto.setText(frases[numero]);


    }
}