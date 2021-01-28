package com.example.ummahackathon.Rest;

import com.example.ummahackathon.Model.GetDataHadroh;
import com.example.ummahackathon.Model.GetDataQori;
import com.example.ummahackathon.Model.GetDataUstad;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("dataustad")
    Call<GetDataUstad> getdataustad();
    @GET("dataqori")
    Call<GetDataQori> getdataqori();
    @GET("datahadroh")
    Call<GetDataHadroh> getdataHadroh();
}
