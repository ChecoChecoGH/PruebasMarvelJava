package com.company;

public class Carta{
    String tituloCarta = "";
    Short numeroCarta = 0;
    //ImageView imageView = null;
    String tipoDeCarta = "";
    String textoCarta = "";

    @Override
    public String toString() {
        return "Carta{" +
                "tituloCarta='" + tituloCarta + '\'' +
                ", numeroCarta=" + numeroCarta +
                ", tipoDeCarta='" + tipoDeCarta + '\'' +
                ", textoCarta='" + textoCarta + '\'' +
                '}';
    }
}