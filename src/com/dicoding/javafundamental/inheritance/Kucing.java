package com.dicoding.javafundamental.inheritance;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

public class Kucing extends Hewan implements Mamalia{
    private String ras;
    private String habitat;

    public Kucing(String ras, String habitat) {
        this.ras = ras;
        this.habitat = habitat;
    }

    @Override
    public String toString() {
        return "Kucing ras = " + ras +"habitat = "+habitat;
    }


    public Kucing(){
        super();
        System.out.println("Kucing");
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Kucing){
            Kucing other =(Kucing) obj;
            return this.ras.equals(other.ras);
        }else {
          return false;
        }
    }

    public void makan(){
        System.out.println("kucing makan");
    }

    public void makan(String food){
        System.out.println("kucing makan "+food);
    }


}
