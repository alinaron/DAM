package com.example.adrianantonescu.qa.util;

import java.util.Arrays;

public class teacher extends user {
    private String[] materii;

    public teacher(String nume, String prenume, String username, String password, String[] materii) {
        super(nume, prenume, username, password);
        this.materii = materii;
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
                "materii=" + Arrays.toString(materii) +
                '}';
    }
}
