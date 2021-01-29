package com.example.ummahackathon.ui.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ummahackathon.FormPendaftaran;
import com.example.ummahackathon.Model.GetDetailUstad;
import com.example.ummahackathon.Model.ListDataUstad;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailUstadActivity extends AppCompatActivity {
    TextView tv_nama_ustad,tv_umur_ustad,tv_alamat_ustad,tv_karir_ustad,tv_deskripsi_ustad;
    Button btn_daftar;
    ApiInterface apiInterface;
    ImageView iv_foto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_ustad);
        tv_nama_ustad = findViewById(R.id.namaPenceramah);
        tv_umur_ustad = findViewById(R.id.umurPenceramah);
        tv_alamat_ustad = findViewById(R.id.alamatPenceramah);
        tv_karir_ustad = findViewById(R.id.karirPenceramah);
        tv_deskripsi_ustad = findViewById(R.id.descPenceramah);
        iv_foto = findViewById(R.id.foto_penceramah);
        btn_daftar = findViewById(R.id.btn_hubungi_ustad);

        apiInterface = ApiClient.getClient("http://192.168.56.1/UmmaHackathonAPI/api/").create(ApiInterface.class);
        response();
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle getdata = getIntent().getExtras();
                Intent myIntent = new Intent(getBaseContext(), FormPendaftaran.class);
                myIntent.putExtra("id",getdata.getString("id"));
                startActivity(myIntent);
            }
        });
    }
    public void response(){
        Bundle getdata = getIntent().getExtras();
        int id = Integer.parseInt(getdata.getString("id"));
        Call<GetDetailUstad> getDetailUstadCall = apiInterface.getDetailUstad(id);
        getDetailUstadCall.enqueue(new Callback<GetDetailUstad>() {
            @Override
            public void onResponse(Call<GetDetailUstad> call, Response<GetDetailUstad> response) {
                if (response.isSuccessful()){
                    List<ListDataUstad> list = response.body().getData();
                    for (ListDataUstad listDataUstad : list){
                        tv_nama_ustad.setText(listDataUstad.getNama_ustad());
                        tv_alamat_ustad.setText(listDataUstad.getAlamat());
                        tv_karir_ustad.setText(listDataUstad.getKarir());
                        tv_umur_ustad.setText(listDataUstad.getUmur());
                        tv_deskripsi_ustad.setText(listDataUstad.getDeskripsi());
                    }
                }
            }

            @Override
            public void onFailure(Call<GetDetailUstad> call, Throwable t) {

            }
        });
    }
}