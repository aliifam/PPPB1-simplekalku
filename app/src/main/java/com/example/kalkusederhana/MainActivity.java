package com.example.kalkusederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.view.View;
import android.text.TextUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.kalkulator);

        final TextView hasil = findViewById(R.id.hasiloperasi);
        final EditText angkapertama = findViewById(R.id.angkapertama);
        final EditText angkakedua = findViewById(R.id.angkakedua);
        Button tambahkan = findViewById(R.id.tambahkan);
        Button kurangkan = findViewById(R.id.kurangkan);
        Button kalikan = findViewById(R.id.kalikan);
        Button bagikan = findViewById(R.id.bagikan);


        tambahkan.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                hasil.setText("");
                try {
                    float angper = Float.parseFloat(angkapertama.getText().toString());
                    float angked = Float.parseFloat(angkakedua.getText().toString());
                    float hasfix = angper + angked;
                    hasil.setText("Hasil = " + hasfix);
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });

        kurangkan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("");
                try {
                    float angper = Float.parseFloat(angkapertama.getText().toString());
                    float angked = Float.parseFloat(angkakedua.getText().toString());
                    float hasfix = angper - angked;
                    hasil.setText("Hasil = " + hasfix);
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });

        kalikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("");
                try {
                    float angper = Float.parseFloat(angkapertama.getText().toString());
                    float angked = Float.parseFloat(angkakedua.getText().toString());
                    float hasfix = angper * angked;
                    hasil.setText("Hasil = " + hasfix);
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });

        bagikan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hasil.setText("");
                try {
                    float angper = Float.parseFloat(angkapertama.getText().toString());
                    float angked = Float.parseFloat(angkakedua.getText().toString());
                    float hasfix = angper / angked;
                    hasil.setText("Hasil = " + hasfix);
                } catch (NumberFormatException e) {
                    Toast toast = Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT);
                    toast.show();
                }
            }

        });



        // Batas

//        final TextView onkkliknama = findViewById(R.id.cobaonklik);
//        final EditText nama = findViewById(R.id.cobanama);
//        Button butonklik = findViewById(R.id.cobatombol);
//
//        butonklik.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                onkkliknama.setText("");
//                if (TextUtils.isEmpty(nama.getText().toString().trim())){
//                    Toast toast = Toast.makeText(getApplicationContext(), "Nama gaboleh koosong!!!", 2000);
//                    toast.show();
//                } else {
//                    onkkliknama.setText("Halo, " + nama.getText().toString());
//                }
//            }
//
//        });

        //Batas

//        final TextView hw = findViewById(R.id.ubahdarijava);
//        hw.setText("dari java ini");


    }
}