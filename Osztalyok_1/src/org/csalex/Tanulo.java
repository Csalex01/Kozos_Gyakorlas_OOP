package org.csalex;

class Tanulo extends Szemely {
    private String iskola;
    private String szak;

    Tanulo() {
        super();
        this.iskola = "ÜRES";
        this.szak = "ÜRES";
    }

    Tanulo(String nev, int eletkor, int CNP, String iskola, String szak) {
        super(nev, eletkor, CNP);
        this.iskola = iskola;
        this.szak = szak;
    }

    String getIskola() {
        return this.iskola;
    }

    void setIskola(String iskola) {
        this.iskola = iskola;
    }

    String getSzak() {
        return this.szak;
    }

    void setSzak(String szak) {
        this.szak = szak;
    }
}
