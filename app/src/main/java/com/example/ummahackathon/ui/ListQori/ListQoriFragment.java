package com.example.ummahackathon.ui.ListQori;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ummahackathon.Model.GetDataQori;
import com.example.ummahackathon.Model.ListDataQori;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListQoriFragment extends Fragment {
    RecyclerView rv_data_qori;
    ListQoriAdapter listQoriAdapter;
    List<ListDataQori> listDataQoris;
    ApiInterface apiInterface;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_list_qori, container, false);
        rv_data_qori = root.findViewById(R.id.rv_data_qori);
        listQoriAdapter = new ListQoriAdapter(getActivity(),listDataQoris);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rv_data_qori.setLayoutManager(layoutManager);
        rv_data_qori.setHasFixedSize(true);
        apiInterface = ApiClient.getClient("http://192.168.56.1/UmmaHackathonAPI/api/").create(ApiInterface.class);
        apiInterface.getdataqori().enqueue(new Callback<GetDataQori>() {
            @Override
            public void onResponse(Call<GetDataQori> call, Response<GetDataQori> response) {
                if (response.isSuccessful()){
                    rv_data_qori.setAdapter(new ListQoriAdapter(getActivity(),response.body().getData()));
                }
                Log.e("Success",response.body().toString());
            }

            @Override
            public void onFailure(Call<GetDataQori> call, Throwable t) {
                Log.e("Fail",t.getLocalizedMessage());
            }
        });
        return root;
    }
}