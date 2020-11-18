package com.company;

public class CakramDigital extends Koleksi {
    protected String jenisMedia;

    public CakramDigital(String noKoleksi, String nama, String penerbit, String tglTerbit, String jenis, String status, String jenisMedia) {
        super(noKoleksi, nama, penerbit, tglTerbit, jenis, status);
        this.jenisMedia = jenisMedia;
    }

    public String getJenisMedia() {
        return jenisMedia;
    }
    public void display() {
        System.out.println("Data Koleksi: ");
        System.out.println("No Koleksi: " + getNoKoleksi() + ", Nama Koleksi: " + getNama() + "Penerbit: " + getPenerbit() + ", Tanggal Terbit: " + ", Jenis Koleksi: " + getJenis() + getTglTerbit() + ", Status Koleksi: " + getStatus());
        System.out.println("Data Cakram Digital: ");
        System.out.println("Jenis Media: " + getJenisMedia());
        System.out.println();
    }
}
