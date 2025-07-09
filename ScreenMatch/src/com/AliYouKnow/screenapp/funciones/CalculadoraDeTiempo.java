package com.AliYouKnow.screenapp.funciones;
//import com.AliYouKnow.screenapp.modelos.Pelicula;
//import com.AliYouKnow.screenapp.modelos.Serie;
import com.AliYouKnow.screenapp.modelos.Titulo;

public class CalculadoraDeTiempo {

    private int tiempoTotal;


    public int getTiempoTotal() {
        return tiempoTotal;
    }

    //metodos codigo duplicado

//    public void incluyeTitulos(Pelicula peli){
//        tiempoTotal += peli.getDuracionEnMinutos();
//
//
//    }
//    public void incluyeTitulos(Serie serie){
//
//        tiempoTotal += serie.getDuracionEnMinutos();
//
//
//}


//Polimorfismo:

    public void incluyeTitulos(Titulo tittle){
        System.out.println("Agregando duracion en minutos de " + tittle);
        this.tiempoTotal += tittle.getDuracionEnMinutos(); // para hacer referencia a la varible de la case this.
    }




}
