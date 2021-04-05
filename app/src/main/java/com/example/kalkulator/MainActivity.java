package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button bt_submit;
    private EditText et_nama, et_nim, et_nilai;
    private TextView tv_Grade, tv_Nama, tv_NIM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt_submit = (Button) findViewById(R.id.btSubmit);
        et_nama = (EditText) findViewById(R.id.etNama);
        et_nim= (EditText) findViewById(R.id.etNIM);
        et_nilai= (EditText) findViewById(R.id.etNilai);
        tv_Grade= (TextView) findViewById(R.id.tvGrade);

        bt_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(MainActivity.this, Actifity2.class);

                String snilai = et_nilai.getText().toString();

                double nilai = Double.parseDouble(snilai);

                if (nilai <= 4 && nilai > 3.66){
                    intent.putExtra("Hasil","A");
                }else if (nilai <= 3.66 && nilai > 3.33){
                    intent.putExtra("Hasil","A-");
                }else if (nilai <= 3.33 && nilai > 3.00){
                    intent.putExtra("Hasil","B+");
                }else if (nilai <= 3.00 && nilai > 2.66){
                    intent.putExtra("Hasil","B");
                }else if (nilai <= 2.66 && nilai > 2.33){
                    intent.putExtra("Hasil","B-");
                }else if (nilai <= 2.33 && nilai > 2.00){
                    intent.putExtra("Hasil","C+");
                }else if (nilai <= 2.00 && nilai > 1.66){
                    intent.putExtra("Hasil","C");
                }else if (nilai <= 1.66 && nilai > 1.33){
                    intent.putExtra("Hasil","C-");
                }else if (nilai <= 1.33 && nilai > 1.00){
                    intent.putExtra("Hasil","D+");
                }else if (nilai == 1.00){
                    intent.putExtra("Hasil","D");
                }


                String snama = et_nama.getText().toString();
                intent.putExtra("Nama", snama);

                String snim = et_nim.getText().toString();
                intent.putExtra("NIM", snim);



                startActivity(intent);


            }
        });
    }

}