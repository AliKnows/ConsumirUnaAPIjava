package com.AliYouKnow.screenapp.modelos;
import com.AliYouKnow.screenapp.funciones.Clasificable;

public class Pelicula extends Titulo implements Clasificable {
    private String director;
    public Pelicula(String nombre, int fechaDeLanzamiento){
        super(nombre, fechaDeLanzamiento);
    }
    

    public String getDirector() {
        return director;
    }
    public void setDirector(String director) {
        this.director = director;
    }

    @Override  //sobre escritura para leer el metodo getClasificacion de la clase: Clasificable
    public int getClasificacion() { return (int) calculaMedia() / 2; }

    @Override //sobreescritura de la clase String
    public String toString() {
        return "Pelicula: " +this.getNombre() + " (" + getFechaDeLanzamiento() + ") ";


    }
}
