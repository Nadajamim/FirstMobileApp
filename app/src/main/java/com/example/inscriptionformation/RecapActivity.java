package com.example.inscriptionformation;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class RecapActivity extends AppCompatActivity {

    private TextView tvRecap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recap);

        tvRecap = findViewById(R.id.tvRecap);

        // Récupérer les données de l'intent
        String nom = getIntent().getStringExtra("NOM");
        String email = getIntent().getStringExtra("EMAIL");
        String phone = getIntent().getStringExtra("PHONE");
        String adresse = getIntent().getStringExtra("ADRESSE");
        String ville = getIntent().getStringExtra("VILLE");

        // Afficher les informations
        String recap = "Nom & Prénom: " + nom + "\n"
                + "Email: " + email + "\n"
                + "Téléphone: " + phone + "\n"
                + "Adresse: " + adresse + "\n"
                + "Ville: " + ville;

        tvRecap.setText(recap);
    }
}
