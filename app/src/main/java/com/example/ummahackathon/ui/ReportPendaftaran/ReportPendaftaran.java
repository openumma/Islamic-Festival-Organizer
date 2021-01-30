package com.example.ummahackathon.ui.ReportPendaftaran;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.ummahackathon.MainActivity;
import com.example.ummahackathon.R;

public class ReportPendaftaran extends AppCompatActivity {
    Button btn_kembali_keberanda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_report_pendaftaran);
        btn_kembali_keberanda = findViewById(R.id.btn_kemabali_keberanda);
        btn_kembali_keberanda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ReportPendaftaran.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}