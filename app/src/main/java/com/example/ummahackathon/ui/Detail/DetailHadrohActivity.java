package com.example.ummahackathon.ui.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ummahackathon.ui.Jadwal.JadwalPengisiAcaraActivity;
import com.example.ummahackathon.ui.Pendaftaran.FormPendaftaran;
import com.example.ummahackathon.Model.GetDataHadroh;
import com.example.ummahackathon.Model.ListDataHadroh;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;
import com.example.ummahackathon.ui.Video.VideoActivity;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailHadrohActivity extends AppCompatActivity {
    TextView tv_nama_hadroh,tv_deskripsi_hadroh,tv_alamat_hadroh;
    Button btn_daftar,btn_video_hadroh,btn_jadwal_hadroh;
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hadroh);
        tv_nama_hadroh = findViewById(R.id.namaHadroh);
        tv_deskripsi_hadroh = findViewById(R.id.descHadroh);
        tv_alamat_hadroh = findViewById(R.id.alamatHadroh);
        btn_daftar = findViewById(R.id.btn_hubungi_hadroh);
        btn_video_hadroh = findViewById(R.id.btn_video_hadroh);
        btn_jadwal_hadroh = findViewById(R.id.btn_jadwal_hadroh);
        btn_video_hadroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailHadrohActivity.this, VideoActivity.class);
                startActivity(intent);
            }
        });
        btn_jadwal_hadroh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DetailHadrohActivity.this, JadwalPengisiAcaraActivity.class);
                startActivity(intent);
            }
        });
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle getdata = getIntent().getExtras();
                Intent myIntent = new Intent(getBaseContext(), FormPendaftaran.class);
                myIntent.putExtra("id",getdata.getString("id"));
                startActivity(myIntent);
            }
        });
        apiInterface = ApiClient.getClient("http://192.168.56.1/UmmaHackathonAPI/api/").create(ApiInterface.class);
        response();
    }
    public void response(){
        Bundle getdata = getIntent().getExtras();
        int id = Integer.parseInt(getdata.getString("id"));
        Call<GetDataHadroh> getDataHadrohCall = apiInterface.getDetailHadroh(id);
        getDataHadrohCall.enqueue(new Callback<GetDataHadroh>() {
            @Override
            public void onResponse(Call<GetDataHadroh> call, Response<GetDataHadroh> response) {
                if (response.isSuccessful()){
                    List<ListDataHadroh> listDataHadrohs = response.body().getData();
                    for (ListDataHadroh listDataHadroh : listDataHadrohs){
                        tv_nama_hadroh.setText(listDataHadroh.getNama_hadroh());
                        tv_deskripsi_hadroh.setText(listDataHadroh.getDeskripsi());
                        tv_alamat_hadroh.setText(listDataHadroh.getAlamat());
                    }

                }
            }

            @Override
            public void onFailure(Call<GetDataHadroh> call, Throwable t) {

            }
        });
    }
}