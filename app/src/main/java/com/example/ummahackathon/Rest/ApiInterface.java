package com.example.ummahackathon.Rest;

import com.example.ummahackathon.Model.GetDataHadroh;
import com.example.ummahackathon.Model.GetDataQori;
import com.example.ummahackathon.Model.GetDataUstad;
import com.example.ummahackathon.Model.GetDetailQori;
import com.example.ummahackathon.Model.GetDetailUstad;
import com.example.ummahackathon.Model.PostDataPendaftaran;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface ApiInterface {
    @GET("dataustad")
    Call<GetDataUstad> getdataustad();

    @GET("dataqori")
    Call<GetDataQori> getdataqori();

    @GET("datahadroh")
    Call<GetDataHadroh> getdataHadroh();

    @GET("dataustad")
    Call<GetDetailUstad> getDetailUstad(@Query("id") int id);

    @GET("dataqori")
    Call<GetDetailQori> getDetailQori(@Query("id") int id);

    @GET("datahadroh")
    Call<GetDataHadroh> getDetailHadroh(@Query("id") int id);

    @FormUrlEncoded
    @POST("datapendaftaran")
    Call<PostDataPendaftaran> postDataPendaftaran(@Field("nama_pengisi") String nama,
                                                  @Field("email") String email,
                                                  @Field("no_whatsapp") int no_whatsapp,
                                                  @Field("jenis_kegiatan") String jenis_kegiatan,
                                                  @Field("tema") String tema,
                                                  @Field("jmlhpeserta") int jmlhpeserta,
                                                  @Field("tglkegiatan") String tglKegiatan,
                                                  @Field("waktukegiatan") String waktukegiatn,
                                                  @Field("jam_mulai") String jam_mulai,
                                                  @Field("jam_selesai") String jam_selesai
                                                );
}

