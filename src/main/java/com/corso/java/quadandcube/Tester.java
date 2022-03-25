package com.corso.java.quadandcube;

import java.util.*;

public class Tester {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Inserisci numero: ");
        int input = sc.nextInt();

        Risultato q = new Quadrato(input);
        q.ris(input);

        Risultato c = new Cubo(input);
        c.ris(input);


    }
}
