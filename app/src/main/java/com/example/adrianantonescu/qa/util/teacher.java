package com.example.adrianantonescu.qa.util;

import java.util.Arrays;

public class teacher extends user {
    private String nume;
    private String prenume;
    private String[] materii;

    public teacher(String username, String password, String nume, String prenume, String[] materii) {
        super(username, password);
        this.nume = nume;
        this.prenume = prenume;
        this.materii = materii;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getPrenume() {
        return prenume;
    }

    public void setPrenume(String prenume) {
        this.prenume = prenume;
    }

    public String[] getMaterii() {
        return materii;
    }

    public void setMaterii(String[] materii) {
        this.materii = materii;
    }

    @Override
    public String toString() {
        return "teacher{" +
                "nume='" + nume + '\'' +
                ", prenume='" + prenume + '\'' +
                ", materii=" + Arrays.toString(materii) +
                '}';
    }
}
