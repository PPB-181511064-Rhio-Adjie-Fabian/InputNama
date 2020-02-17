package com.example.aplikasimobile;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText textNama;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Panggil variabel berdasarkan id
        textNama = (EditText)findViewById(R.id.txtNama);
        hasil = (TextView)findViewById(R.id.lbl_nama);
    }

    public void tampilNama(View v){
        hasil.setText("Nama anda : "+textNama.getText());
    }
}
