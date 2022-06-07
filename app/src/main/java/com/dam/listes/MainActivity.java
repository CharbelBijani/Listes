package com.dam.listes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    /* 1 variables globales */
    private ListView listeView;
    private String[] stagiaires = new String[]{
            "Nelson",
            "Charbel",
            "Hicham",
            "Walid",
            "Antoine",
            "Nassir",
            "Ben",
            "Sonia",
            "Ons",
            "Anh Hoang",
    };


    /* 2 initialisation */

    private void initUI(){
        listeView = findViewById(R.id.id_lvStagiaires);
    }

    /** Methodes perso pour l'application **/
    private void affichageDataDansListeView(){


    }



    /** Cycles de vie **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /* 3 lancement de la methode initialisation */
        initUI();

    }
}