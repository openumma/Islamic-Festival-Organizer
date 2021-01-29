package com.example.ummahackathon.Model;

import com.google.gson.annotations.SerializedName;

public class PostDataPendaftaran {
    @SerializedName("status")
    String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "PostDataPendaftaran{" +
                "status='" + status + '\'' +
                '}';
    }
}
