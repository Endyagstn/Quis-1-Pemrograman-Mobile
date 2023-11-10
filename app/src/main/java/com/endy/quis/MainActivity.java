package com.endy.quis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText Nilai_Tugas, Nilai_Quis, Nilai_UTS, Nilai_UAS;
    Button Proses_Hitung, Bersih;
    TextView Hasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nilai_Tugas = (EditText) findViewById(R.id.Nilai_Tugas);
        Nilai_Quis = (EditText) findViewById(R.id.Nilai_Quis);
        Nilai_UTS = (EditText) findViewById(R.id.Nilai_UTS);
        Nilai_UAS = (EditText) findViewById(R.id.Nilai_UAS);

        Proses_Hitung = (Button)findViewById(R.id.Proses_Hitung);
        Bersih = (Button)findViewById(R.id.Bersihkan);

        Hasil = (TextView) findViewById(R.id.Hasil);

        Proses_Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Nilai_Tugas.getText().length()>0) && (Nilai_Quis.getText().length()>0) && (Nilai_UTS.getText().length()>0) && (Nilai_UAS.getText().length()>0))
                {
                    double Tugas = Double.parseDouble(Nilai_Tugas.getText().toString());
                    double Quis = Double.parseDouble(Nilai_Quis.getText().toString());
                    double UTS = Double.parseDouble(Nilai_UTS.getText().toString());
                    double UAS = Double.parseDouble(Nilai_UAS.getText().toString());
                    double result = (Tugas*20/100) + (Quis*20/100) + (UTS*30/100) + (UAS*30/100);
                    Hasil.setText(Double.toString(result));

                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Nilai Tugas, Quis, UTS & UAS", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });

        Bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if((Nilai_Tugas.getText().length()>0) && (Nilai_Quis.getText().length()>0) && (Nilai_UTS.getText().length()>0) && (Nilai_UAS.getText().length()>0))
                {
                    double Tugas = Double.parseDouble(Nilai_Tugas.getText().toString());
                    double Quis = Double.parseDouble(Nilai_Quis.getText().toString());
                    double UTS = Double.parseDouble(Nilai_UTS.getText().toString());
                    double UAS = Double.parseDouble(Nilai_UAS.getText().toString());
                    double result = (Tugas*20/100) + (Quis*20/100) + (UTS*30/100) + (UAS*30/100);
                    Hasil.setText(Double.toString(result));
                }
                else {
                    Toast toast = Toast.makeText(MainActivity.this, "Mohon masukkan Nilai Tugas, Quis, UTS & UAS", Toast.LENGTH_LONG);
                    toast.show();
                }
            }
        });


        Bersih.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Nilai_Tugas.setText("");
                Nilai_Quis.setText("");
                Nilai_UTS.setText("");
                Nilai_UAS.setText("");
                Hasil.setText("0");
                Nilai_Tugas.requestFocus();
            }
        });
    }
}
