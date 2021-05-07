package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<CartaBuenos> listaMazoBuenos = new ArrayList<>();
        ArrayList<CartaMalos> listaMazoMalos = new ArrayList<>();

        //Creación de las 15 cartas de heroe
        for(int i = 0; i < 15; i++){
            CartaBuenos cartaBuenos = new CartaBuenos();
            cartaBuenos.cartaDeHeroe = true;
            listaMazoBuenos.add(cartaBuenos);
        }

        CartaBuenos cartaAux = new CartaBuenos();

        cartaAux = listaMazoBuenos.get(0);
        cartaAux.numeroCarta = 1;
        cartaAux.tituloCarta = "SpiderWoman";
        cartaAux.costeCarta = 3;
        cartaAux.recurso = "universal";
        cartaAux.tipoDeCarta = "aliado";
        cartaAux.tipoDeHabilidad = "avenger SPY";
        cartaAux.textoCarta = "Respuesta: despues de que SpiderWoman entre al juego, confunde al villano";
        listaMazoBuenos.set(0, cartaAux);

        //System.out.println(listaMazoBuenos.get(0));
    }

    public crearCartaBueno(){




    }




}
