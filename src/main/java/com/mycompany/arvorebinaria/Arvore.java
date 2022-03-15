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
public class Arvore {

    private No raiz;

    public Arvore() {
        this.raiz = null;
    }

    public void adicionar(int elemento) {
        No novoNo = new No(elemento);

        if (this.raiz == null) {
            this.raiz = novoNo;
        } else {
            No noAtual = this.raiz;
            No noAnterior;
            while(true){
                noAnterior = noAtual;
                if(elemento <= noAtual.getElemento()){
                    noAtual = noAtual.getEsquerdo();
                    if(noAtual == null){
                        noAnterior.setEsquerdo(novoNo);
                        return;
                    }
                }
                else{
                    noAtual = noAtual.getDireito();
                    if(noAtual == null){
                        noAnterior.setDireito(novoNo);
                        return;
                    }
                }
            }
        }
    }

    public int altura() {
        return 0;
    }
    
    public int profundidade(){
        return 0;
    }
    
    public int nivel(){
        return 0;
    }
    
    public int folhas(){
        return 0;
    }
}
