package com.company;

public class Majalah extends Koleksi {
    protected String noEdisi;
    protected String jenisTerbit;

    public Majalah(String noKoleksi, String nama, String penerbit, String tglTerbit, String jenis, String status, String noEdisi, String jenisTerbit) {
        super(noKoleksi, nama, penerbit, tglTerbit, jenis, status);
        this.noEdisi = noEdisi;
        this.jenisTerbit = jenisTerbit;
    }

    public String getNoEdisi() {
        return noEdisi;
    }

    public String getJenisTerbit() {
        return jenisTerbit;
    }

    public void display() {
        System.out.println("Data Koleksi: ");
        System.out.println("No Koleksi: " + getNoKoleksi() + ", Nama Koleksi: " + getNama() + "Penerbit: " + getPenerbit() + ", Tanggal Terbit: " + getTglTerbit() + ", Jenis Koleksi: " + getJenis() + ", Status Koleksi: " + getStatus());
        System.out.println("Data Majalah: ");
        System.out.println("No Edisi: " + getNoEdisi() + ", Jenis Terbit: " + getJenisTerbit());
        System.out.println();
    }
}
