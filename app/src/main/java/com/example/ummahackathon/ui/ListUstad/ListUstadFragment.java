package com.example.ummahackathon.ui.ListUstad;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.ummahackathon.Model.GetDataUstad;
import com.example.ummahackathon.Model.ListDataUstad;
import com.example.ummahackathon.R;
import com.example.ummahackathon.Rest.ApiClient;
import com.example.ummahackathon.Rest.ApiInterface;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class ListUstadFragment extends Fragment {
    ListUstadAdapter listUstadAdapter;
    ArrayList<ListDataUstad> listDataUstad;
    RecyclerView rv_data_ustad;
    ApiInterface apiInterface;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_list_ustad, container, false);
        rv_data_ustad = root.findViewById(R.id.rv_data_ustad);
        listUstadAdapter = new ListUstadAdapter(listDataUstad,getActivity());
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getActivity());
        rv_data_ustad.setLayoutManager(layoutManager);
        rv_data_ustad.setHasFixedSize(true);
        apiInterface = ApiClient.getClient("http://192.168.56.1/UmmaHackathonAPI/api/").create(ApiInterface.class);

        apiInterface.getdataustad().enqueue(new Callback<GetDataUstad>() {
            @Override
            public void onResponse(Call<GetDataUstad> call, Response<GetDataUstad> response) {
                if (response.isSuccessful()){
                    rv_data_ustad.setAdapter(new ListUstadAdapter(response.body().getData(),getActivity()));
                }
                Log.e("Success",response.body().toString());
            }

            @Override
            public void onFailure(Call<GetDataUstad> call, Throwable t) {
                Log.e("Fail",t.getLocalizedMessage());
            }
        });
        return root;
    }
}