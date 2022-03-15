/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.arvorebinaria;

/**
 *
 * @author Aline
 */
public class No {

    private int elemento;
    private No esquerdo;
    private No direito;

    public No(int elemento) {
        this.elemento = elemento;
        this.esquerdo = null;
        this.direito = null;
    }

    public No() {
        this.elemento = 0;
        this.esquerdo = null;
        this.direito = null;
    }
    

    public int getElemento() {
        return elemento;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public No getEsquerdo() {
        return esquerdo;
    }

    public void setEsquerdo(No esquerdo) {
        this.esquerdo = esquerdo;
    }

    public No getDireito() {
        return direito;
    }

    public void setDireito(No direito) {
        this.direito = direito;
    }

}
