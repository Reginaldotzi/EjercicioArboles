package org.example.ArbolCadena;

import org.example.ArbolBinario.Nodo;

public class NodoCadena {

    protected String dato;

    protected NodoCadena izdo;

    protected NodoCadena dcho;

    public NodoCadena(String valor){
        dato= valor;
        izdo = dcho = null;

    }
    public NodoCadena (NodoCadena ramaIzdo, String valor, NodoCadena ramaDcho){
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }

    public String valorNodo(){return dato;}
    public NodoCadena GetSubarbolIzdo(){return izdo;}
    public NodoCadena GetSubarbolDcho(){return dcho;}

    public void nuevoValor(String d){dato = d;}
    public void SetRamaIzdo(NodoCadena n){izdo = n;}

    public void SetRamaDcho(NodoCadena n){dcho = n;}

    public void imprimirDato(){
        System.out.println(this.valorNodo());
    }
}


