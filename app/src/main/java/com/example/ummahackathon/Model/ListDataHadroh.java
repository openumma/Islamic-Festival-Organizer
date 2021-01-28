package com.example.ummahackathon.Model;

public class ListDataHadroh {
    String id;
    String nama_hadroh;
    String deskripsi;
    String link_video;

    @Override
    public String toString() {
        return "ListDataHadroh{" +
                "id='" + id + '\'' +
                ", nama_hadroh='" + nama_hadroh + '\'' +
                ", deskripsi='" + deskripsi + '\'' +
                ", link_video='" + link_video + '\'' +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama_hadroh() {
        return nama_hadroh;
    }

    public void setNama_hadroh(String nama_hadroh) {
        this.nama_hadroh = nama_hadroh;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getLink_video() {
        return link_video;
    }

    public void setLink_video(String link_video) {
        this.link_video = link_video;
    }
}
