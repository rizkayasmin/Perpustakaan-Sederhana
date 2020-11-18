package com.company;

public class Buku extends Koleksi {
    protected String pengarang;
    protected int tahunMasuk;
    protected String issn;
    protected String isbn;
    protected String doi;
    protected String arxivld;

    public Buku(String noKoleksi, String nama, String penerbit, String tglTerbit, String jenis, String status, String pengarang, int tahunMasuk, String issn, String isbn, String doi, String arxivld) {
        super(noKoleksi, nama, penerbit, tglTerbit, jenis, status);
        this.pengarang = pengarang;
        this.tahunMasuk = tahunMasuk;
        this.issn = issn;
        this.isbn = isbn;
        this.doi = doi;
        this.arxivld = arxivld;
    }

    public String getPengarang() {
        return pengarang;
    }

    public int getTahunMasuk() {
        return tahunMasuk;
    }

    public String getIssn() {
        return issn;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getDoi() {
        return doi;
    }

    public String getArxivld() {
        return arxivld;
    }
    public void display() {
        System.out.println("Data Koleksi: ");
        System.out.println("No Koleksi: " + getNoKoleksi() + ", Nama Koleksi: " + getNama() + ", Penerbit: " + getPenerbit() + ", Tanggal Terbit: " + getTglTerbit() + ", Jenis Koleksi: " + getJenis() +", Status Koleksi: " + getStatus());
        System.out.println("Data Buku: ");
        System.out.println("Pengarang: " + getPengarang() + ", Tahun Masuk: " + getTahunMasuk() + ", issn: " + getIssn() + ", isbn: " + getIsbn() + ", doi: " + getDoi() + ", arxivld" + getArxivld());
        System.out.println();
    }
}
