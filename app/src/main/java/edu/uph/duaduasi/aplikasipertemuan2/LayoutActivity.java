package edu.uph.duaduasi.aplikasipertemuan2;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class LayoutActivity extends AppCompatActivity {
    Button btnOke;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_main);
        btnOke = (Button) findViewById(R.id.btnOke);
        btnOke.setBackgroundColor(Color.BLACK);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
