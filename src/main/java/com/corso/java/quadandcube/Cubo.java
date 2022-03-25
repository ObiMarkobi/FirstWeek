package com.corso.java.quadandcube;

public class Cubo implements Risultato{

    private int numero;

    public Cubo() {
    }

    public Cubo(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }


    /**
     *
     * @param num - numero in ingresso; il metodo overridden mi calcola il cubo del numero
     */
    @Override
    public void ris(int num) {
        int uscita = num * num * num;
        System.out.println("\nIl cubo di " + num + " è: " + uscita);
    }
}

