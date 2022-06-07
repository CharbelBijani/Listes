package com.dam.listes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        String[] listeDepuisStrings = getResources().getStringArray(R.array.liste_stagiaires);

        /** Methode 1 depuis un tableay situe dans le java (cette classe)
         * final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
         *       this, android.R.layout.simple_list_item_1, stagiaires);
         */


        // Methode 2 a partit d'un tableau dans strings.xml

        final ArrayAdapter<String> adapter = new ArrayAdapter<String>(
                this, android.R.layout.simple_list_item_checked, listeDepuisStrings);

        listeView.setAdapter(adapter);

        listeView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String valeurItemClique = (String) listeView.getItemAtPosition(position);
                Toast.makeText(MainActivity.this,
                        "Le jour est " + valeurItemClique,
                        Toast.LENGTH_SHORT)
                        .show();

            }
        });


    }


    /** Cycles de vie **/
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    /* 3 lancement de la methode initialisation */
        initUI();
        affichageDataDansListeView();
    }
}