package com.corso.java.quadandcube;

public class Quadrato implements Risultato{

    private int numero;

    public Quadrato() {
    }

    public Quadrato(int numero) {
        this.numero = numero;
    }


    /**
     *
     * @param num - numero in ingresso; il metodo mi calcola il quadrato di quest'ultimo.
     */
    @Override
    public void ris(int num) {
        int uscita = num * num;
        System.out.println("\nIl quadrato del numero " + num + " e': " + uscita);
    }
}