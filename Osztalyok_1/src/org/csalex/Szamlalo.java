package org.csalex;

class Szamlalo {
    private int t;
    public static int darab = 0;

    Szamlalo() {
        this.t = 10;
    }

    Szamlalo(int  t) {
        this.t  =t;
    }

    int getT() {
        return this.t;
    }

    void setT(int t) {
        this.t  = t;
    }
}
