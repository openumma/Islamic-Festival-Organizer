package com.example.ummahackathon.ui.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.ummahackathon.ui.Pendaftaran.FormPendaftaran;
import com.example.ummahackathon.Model.GetDetailQori;
import com.example.ummahackathon.Model.ListDataQori;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailQoriActivity extends AppCompatActivity {
    TextView tv_nama_qori,tv_umur_qori,tv_alamat_qori,tv_karir_qori,tv_deskripsi_qori;
    ApiInterface apiInterface;
    Button btn_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_qori);
        tv_nama_qori = findViewById(R.id.namaQori);
        tv_umur_qori = findViewById(R.id.umurQori);
        tv_alamat_qori = findViewById(R.id.alamatQori);
        tv_karir_qori = findViewById(R.id.karirQori);
        tv_deskripsi_qori = findViewById(R.id.descQori);
        btn_daftar = findViewById(R.id.btn_hubungi_qori);
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
        Call<GetDetailQori> getDataQoriCall = apiInterface.getDetailQori(id);
        getDataQoriCall.enqueue(new Callback<GetDetailQori>() {
            @Override
            public void onResponse(Call<GetDetailQori> call, Response<GetDetailQori> response) {
                if (response.isSuccessful()){
                    List<ListDataQori> list = response.body().getData();
                    for (ListDataQori listDataQori :list){
                        tv_nama_qori.setText(listDataQori.getNama_qori());
                        tv_umur_qori.setText(listDataQori.getUmur());
                        tv_alamat_qori.setText(listDataQori.getAlamat());
                        tv_karir_qori.setText(listDataQori.getKarir());
                        tv_deskripsi_qori.setText(listDataQori.getDeskripsi());
                    }
                }
            }

            @Override
            public void onFailure(Call<GetDetailQori> call, Throwable t) {

            }
        });
    }
}