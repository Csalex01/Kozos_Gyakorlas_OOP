package org.csalex;

class Szemely {
    private String nev;
    private int eletkor;
    private int CNP;

    Szemely() {
        this.nev = "ÜRES";
        this.eletkor = -1;
        this.CNP = -1;
    }

    Szemely(String nev, int eletkor, int CNP) {
        this.nev = nev;
        this.eletkor = eletkor;
        this.CNP = CNP;
    }

    String getNev() {
        return this.nev;
    }

    int getEletkor() {
        return this.eletkor;
    }

    int getCNP() {
        return this.CNP;
    }

    void setNev(String nev) {
        this.nev = nev;
    }

    void setEletkor(int eletkor) {
        this.eletkor = eletkor;
    }

    void setCNP(int CNP) {
        this.CNP = CNP;
    }
}
