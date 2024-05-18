package org.example.ArbolCadena;



public class ArbolCadenas {
    //nodo raiz del arbol
    private NodoCadena raiz;

    //cosntructor de la clase arbol
    public ArbolCadenas(){this.raiz=null;}

    //inserta un nodo con el valor dato, si el arbol está vacio se crea un nodo
    public void insertar(String dato){
        if (this.raiz == null){
            this.raiz = new NodoCadena (dato);
        } else {
            this.insertar(this.raiz,dato);
        }
    }
    //si no tiene valro nulo, se inserta un orden

    private void insertar(NodoCadena padre, String dato){

        if (dato.compareTo(dato)>0){
            if(padre.GetSubarbolIzdo()==null){
                padre.SetRamaIzdo(new NodoCadena (dato));
            } else {
                insertar(padre.GetSubarbolIzdo(),dato);
            }
        }else{
            if(padre.GetSubarbolDcho()==null){
                padre.SetRamaDcho(new NodoCadena(dato));
            } else {
                this.insertar (padre.GetSubarbolDcho(),dato);
            }
        }
    }
}
