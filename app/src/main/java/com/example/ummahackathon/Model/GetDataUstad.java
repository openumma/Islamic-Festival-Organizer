package com.example.ummahackathon.Model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetDataUstad {
    @SerializedName("status")
    String status;
    @SerializedName("data")
    List<ListDataUstad> data;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<ListDataUstad> getData() {
        return data;
    }

    public void setData(List<ListDataUstad> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "GetDataUstad{" +
                "status='" + status + '\'' +
                ", data=" + data +
                '}';
    }
}
