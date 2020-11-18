package com.company;

import java.util.Scanner;

public class Main {
    static Koleksi buku;
    static Koleksi majalah;
    static Koleksi koran;
    static Koleksi cakramDigital;
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Perpustakaan perpustakaan = new Perpustakaan();
        Scanner scanner = new Scanner(System.in);
        String noKoleksi, nama, penerbit, tglTerbit, jenis, status, pengarang, issn, isbn, doi, arxivld, noEdisi, jenisTerbit, jenisMedia;
        int tahunMasuk;

        do {
            System.out.println("MENU");
            System.out.println("1.Tambah Koleksi\n2.Lihat Koleksi\n3.Exit");
            System.out.println("Pilih Menu: ");
            int inputan = scanner.nextInt();
            switch (inputan) {
                case 1:
                    System.out.println("Menu: \n1.Buku\n2.Majalah\n3.Koran\n4.Cakram Digital");
                    System.out.println("Pilih Menu: ");
                    int input = scanner.nextInt();
                    if (input == 1) {
                        System.out.println("Data Buku: ");
                        System.out.println("No Koleksi: ");
                        noKoleksi = scanner.next();
                        System.out.println("Judul Koleksi: ");
                        nama = scanner.next();
                        System.out.println("Penerbit: ");
                        penerbit = scanner.next();
                        System.out.println("Tanggal Terbit: ");
                        tglTerbit = scanner.next();
                        System.out.println("Jenis Koleksi: ");
                        jenis = scanner.next();
                        System.out.println("Status Koleksi: ");
                        status = scanner.next();
                        System.out.println("Pengarang: ");
                        pengarang = scanner.next();
                        System.out.println("Tahun Masuk: ");
                        tahunMasuk = scanner.nextInt();
                        System.out.println("issn: ");
                        issn = scanner.next();
                        System.out.println("isbn: ");
                        isbn = scanner.next();
                        System.out.println("doi: ");
                        doi = scanner.next();
                        System.out.println("arxivld: ");
                        arxivld = scanner.next();

                        buku = new Buku(noKoleksi,nama,penerbit,tglTerbit,jenis,status,pengarang,tahunMasuk,issn,isbn,doi,arxivld);
                        perpustakaan.addKoleksi(buku);
                        System.out.println("Koleksi ditambahkan");
                        System.out.println();

                    }
                    if (input == 2) {
                        System.out.println("Data Majalah: ");
                        System.out.println("No Koleksi: ");
                        noKoleksi = scanner.next();
                        System.out.println("Judul Koleksi: ");
                        nama = scanner.next();
                        System.out.println("Penerbit: ");
                        penerbit = scanner.next();
                        System.out.println("Tanggal Terbit: ");
                        tglTerbit = scanner.next();
                        System.out.println("Jenis Koleksi: ");
                        jenis = scanner.next();
                        System.out.println("Status Koleksi: ");
                        status = scanner.next();
                        System.out.println("No Edisi: ");
                        noEdisi = scanner.next();
                        System.out.println("Jenis Terbit: ");
                        jenisTerbit = scanner.next();

                        majalah = new Majalah(noKoleksi,nama,penerbit,tglTerbit,jenis,status,noEdisi,jenisTerbit);
                        perpustakaan.addKoleksi(majalah);
                        System.out.println("Koleksi ditambahkan");
                        System.out.println();
                    }
                    if (input == 3) {
                        System.out.println("Data Koran: ");
                        System.out.println("No Koleksi: ");
                        noKoleksi = scanner.next();
                        System.out.println("Judul Koleksi: ");
                        nama = scanner.next();
                        System.out.println("Penerbit: ");
                        penerbit = scanner.next();
                        System.out.println("Tanggal Terbit: ");
                        tglTerbit = scanner.next();
                        System.out.println("Jenis Koleksi: ");
                        jenis = scanner.next();
                        System.out.println("Status Koleksi: ");
                        status = scanner.next();
                        System.out.println("Jenis Terbit: ");
                        jenisTerbit = scanner.next();

                        koran = new Koran(noKoleksi, nama, penerbit,tglTerbit, jenis, status, jenisTerbit);
                        perpustakaan.addKoleksi(koran);
                        System.out.println("Koleksi ditambahkan");
                        System.out.println();
                    }
                    if (input == 4) {
                        System.out.println("Data Cakram Digital: ");
                        System.out.println("No Koleksi: ");
                        noKoleksi = scanner.next();
                        System.out.println("Judul Koleksi: ");
                        nama = scanner.next();
                        System.out.println("Penerbit: ");
                        penerbit = scanner.next();
                        System.out.println("Tanggal Terbit: ");
                        tglTerbit = scanner.next();
                        System.out.println("Jenis Koleksi: ");
                        jenis = scanner.next();
                        System.out.println("Status Koleksi: ");
                        status = scanner.next();
                        System.out.println("Jenis Media: ");
                        jenisMedia = scanner.next();

                        cakramDigital = new CakramDigital(noKoleksi, nama, penerbit, tglTerbit, jenis, status, jenisMedia);
                        perpustakaan.addKoleksi(cakramDigital);
                        System.out.println("Koleksi ditambahkan");
                        System.out.println();
                    }
                case 2:
                    perpustakaan.displayAll();
                    break;
            }
        }
            while (true) ;
    }
}

