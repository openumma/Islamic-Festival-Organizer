package com.example.ummahackathon.ui.ListHadroh;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ummahackathon.Model.GetDataHadroh;
import com.example.ummahackathon.Model.ListDataHadroh;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListHadrohFragment extends Fragment {
    RecyclerView rv_data_hadroh;
    ListHadrohAdapter listHadrohAdapter;
    List<ListDataHadroh> listDataHadrohs;
    ApiInterface apiInterface;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_list_hadroh, container, false);
        rv_data_hadroh = root.findViewById(R.id.rv_data_hadroh);
        listHadrohAdapter = new ListHadrohAdapter(getActivity(),listDataHadrohs);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rv_data_hadroh.setLayoutManager(layoutManager);
        rv_data_hadroh.setHasFixedSize(true);
        apiInterface = ApiClient.getClient("http://192.168.56.1/UmmaHackathonAPI/api/").create(ApiInterface.class);
        apiInterface.getdataHadroh().enqueue(new Callback<GetDataHadroh>() {
            @Override
            public void onResponse(Call<GetDataHadroh> call, Response<GetDataHadroh> response) {
                if (response.isSuccessful()){
                    rv_data_hadroh.setAdapter(new ListHadrohAdapter(getActivity(),response.body().getData()));
                }
                Log.e("Success",response.body().toString());
            }

            @Override
            public void onFailure(Call<GetDataHadroh> call, Throwable t) {

            }
        });
        return root;
    }
}