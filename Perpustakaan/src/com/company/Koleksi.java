package com.company;

public class Koleksi {
    protected String noKoleksi;
    protected String nama;
    protected String penerbit;
    protected String tglTerbit;
    protected String jenis;
    protected String status;

    public Koleksi(String noKoleksi, String nama, String penerbit, String tglTerbit, String jenis, String status) {
        this.noKoleksi = noKoleksi;
        this.nama = nama;
        this.penerbit = penerbit;
        this.tglTerbit = tglTerbit;
        this.jenis = jenis;
        this.status = status;
    }

    public String getNoKoleksi() {
        return noKoleksi;
    }

    public String getNama() {
        return nama;
    }

    public String getPenerbit() {
        return penerbit;
    }

    public String getTglTerbit() {
        return tglTerbit;
    }

    public String getJenis() {
        return jenis;
    }

    public String getStatus() {
        return status;
    }

    public void display() {
        System.out.println("Data Koleksi: ");
        System.out.println("No Koleksi: " + getNoKoleksi() + ", Nama Koleksi: " + getNama() + ", Penerbit: " + getPenerbit() + ", Tanggal Terbit: " + getTglTerbit() + "Jenis Koleksi: " + getJenis() + ", Status Koleksi: " + getStatus());
        System.out.println();
    }
}
