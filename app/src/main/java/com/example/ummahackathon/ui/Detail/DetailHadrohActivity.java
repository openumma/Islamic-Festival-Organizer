package com.example.ummahackathon.ui.Detail;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.ummahackathon.Model.GetDataHadroh;
import com.example.ummahackathon.Model.GetDetailQori;
import com.example.ummahackathon.Model.ListDataHadroh;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;
import com.example.ummahackathon.ui.ListHadroh.ListHadrohAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailHadrohActivity extends AppCompatActivity {
    TextView tv_nama_hadroh,tv_deskripsi_hadroh;
    ApiInterface apiInterface;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hadroh);
        tv_nama_hadroh = findViewById(R.id.namaHadroh);
        tv_deskripsi_hadroh = findViewById(R.id.descHadroh);
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
                    }

                }
            }

            @Override
            public void onFailure(Call<GetDataHadroh> call, Throwable t) {

            }
        });
    }
}