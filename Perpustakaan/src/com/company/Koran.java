package com.company;

public class Koran extends Koleksi {
    protected String jenisTerbit;

    public Koran(String noKoleksi, String nama, String penerbit, String tglTerbit, String jenis, String status, String jenisTerbit) {
        super(noKoleksi, nama, penerbit, tglTerbit, jenis, status);
        this.jenisTerbit = jenisTerbit;
    }

    public String getJenisTerbit() {
        return jenisTerbit;
    }
    public void display() {
        System.out.println("Data Koleksi: ");
        System.out.println("No Koleksi: " + getNoKoleksi() + ", Nama Koleksi: " + getNama() + "Penerbit: " + getPenerbit() + ", Tanggal Terbit: " + getTglTerbit() + ", Jenis Koleksi: " + getJenis() +", Status Koleksi: " + getStatus());
        System.out.println("Data Koran: ");
        System.out.println("Jenis Terbit: " + getJenisTerbit());
        System.out.println();
    }
}
