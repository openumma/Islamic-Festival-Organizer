package com.example.ummahackathon.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetDataQori {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    List<ListDataQori> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ListDataQori> getData() {
        return data;
    }

    public void setData(List<ListDataQori> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetDataQori{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
