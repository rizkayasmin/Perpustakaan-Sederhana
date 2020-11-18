package com.company;

import java.util.ArrayList;

public class Perpustakaan {
    private ArrayList<Koleksi> array = new ArrayList<>();

    public ArrayList<Koleksi> getArray() {
        return array;
    }


    public void displayAll(){
        for (Koleksi koleksi: array){
            koleksi.display();
        }
    }

    public void addKoleksi(Koleksi koleksi) {
        getArray().add(koleksi);
    }
}
