package org.csalex;

public class Main {
    public static void main(String[] args)
    {
        Szamlalo sz1 = new Szamlalo(0);
        Szamlalo sz2 = new Szamlalo(10);

        System.out.println(Szamlalo.darab + " " + Szamlalo.darab);
        Szamlalo.darab = 1;
        System.out.println(Szamlalo.darab + " " + Szamlalo.darab);

        Szemely Jozsi = new Szemely();

        System.out.println(Jozsi.getNev() + ", " + Jozsi.getEletkor() + ", " + Jozsi.getCNP());

        Jozsi.setNev("Antal Jozsef");
        Jozsi.setEletkor(19);
        Jozsi.setCNP(1);

        System.out.println(Jozsi.getNev() + ", " + Jozsi.getEletkor() + ", " + Jozsi.getCNP());

        Tanulo Peti = new Tanulo("Erszény Péter", 19, 2, "Sapientia EMTE", "Távközlés");

        System.out.println(Peti.getNev() + ", " +
                            Peti.getEletkor() + ", " +
                            Peti.getCNP() + ", " +
                            Peti.getIskola() + ", " +
                            Peti.getSzak()
                            );
    }
}
