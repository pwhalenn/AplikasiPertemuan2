package edu.uph.duaduasi.aplikasipertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

public class DasarActivity extends AppCompatActivity {
    Button btnOke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_activity);
        btnOke = (Button) findViewById(R.id.btnOke);
        btnOke.setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}