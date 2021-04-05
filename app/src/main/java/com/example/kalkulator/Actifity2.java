package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class Actifity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_actifity2);
        TextView txtNama     = findViewById(R.id.tvNama);
        TextView txtNim      = findViewById(R.id.tvNIM);
        TextView txtNilai = findViewById(R.id.tvGrade);

        Bundle extras = getIntent().getExtras();

        String nama = extras.getString("Nama");
        txtNama.setText(String.format(" %s", nama));

        String nim = extras.getString("NIM");
        txtNim.setText(String.format(" %s", nim));

        String hasil = extras.getString("Hasil");
        txtNilai.setText(String.format(" %s", hasil));
    }
}