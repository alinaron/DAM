package com.example.adrianantonescu.qa.util;

public class student extends user {
    private String grupa;
    private String serie;
    private int an;
    private String specializare;

    public student(String nume, String prenume, String username, String password, String grupa, String serie, int an, String specializare) {
        super(nume, prenume, username, password);
        this.grupa = grupa;
        this.serie = serie;
        this.an = an;
        this.specializare = specializare;
    }

    public String getGrupa() {
        return grupa;
    }

    public void setGrupa(String grupa) {
        this.grupa = grupa;
    }

    public String getSerie() {
        return serie;
    }

    public void setSerie(String serie) {
        this.serie = serie;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getSpecializare() {
        return specializare;
    }

    public void setSpecializare(String specializare) {
        this.specializare = specializare;
    }

    @Override
    public String toString() {
        return "student{" +
                "grupa='" + grupa + '\'' +
                ", serie='" + serie + '\'' +
                ", an=" + an +
                ", specializare='" + specializare + '\'' +
                '}';
    }
}
