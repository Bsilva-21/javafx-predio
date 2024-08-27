package com.example.model;

import java.util.ArrayList;
import java.util.List;

public class Predio {
    private List<Andar> andares;

    public Predio() {
        andares = new ArrayList<>();
    }

    public void addAndar(Andar andar){
        andares.add(andar);
    }

    public int getValor(){
        int valor = 0;
        for (Andar andar : andares) {
            valor+=andar.getValor();
        }
        return valor;
    }
    public static void main(String[] args) {
        Sala sala = new Sala(50);
        Andar andar = new Andar(300);        
        andar.addSala(sala);

        Predio predio1 = new Predio();
        predio1.addAndar(andar);

        Predio predio2 = new Predio();

        System.out.println(predio1.getValor());


    }

    
}
