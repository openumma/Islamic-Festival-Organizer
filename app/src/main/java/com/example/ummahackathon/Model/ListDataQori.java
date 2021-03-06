package com.example.ummahackathon.Model;

public class ListDataQori {
        String id;
        String nama_qori;
        String umur;
        String alamat;
        String karir;
        String deskripsi;
        String link_video;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getNama_qori() {
            return nama_qori;
        }

        public void setNama_qori(String nama_ustad) {
            this.nama_qori = nama_ustad;
        }

        public String getUmur() {
            return umur;
        }

        public void setUmur(String umur) {
            this.umur = umur;
        }

        public String getAlamat() {
            return alamat;
        }

        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }

        public String getKarir() {
            return karir;
        }

        public void setKarir(String karir) {
            this.karir = karir;
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

        @Override
        public String toString() {
            return "ListDataUstad{" +
                    "id='" + id + '\'' +
                    ", nama_ustad='" + nama_qori + '\'' +
                    ", umur='" + umur + '\'' +
                    ", alamat='" + alamat + '\'' +
                    ", karir='" + karir + '\'' +
                    ", deskripsi='" + deskripsi + '\'' +
                    ", link_video='" + link_video + '\'' +
                    '}';
        }
    }
