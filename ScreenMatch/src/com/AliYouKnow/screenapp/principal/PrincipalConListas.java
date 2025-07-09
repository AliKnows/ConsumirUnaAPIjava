package com.AliYouKnow.screenapp.principal;

import com.AliYouKnow.screenapp.modelos.Pelicula;
import com.AliYouKnow.screenapp.modelos.Serie;
import com.AliYouKnow.screenapp.modelos.Titulo;

import java.util.*;

public class PrincipalConListas {
    public static void main(String[] args) {

        //ArrayList
        Pelicula pelicula1 = new Pelicula("Matrix",2000);
        pelicula1.evalua(9);
        Pelicula pelicula2 = new Pelicula("Devs",2005);
        pelicula2.evalua(8);
        var pelicula3 = new Pelicula("MurderBot",2001);
        pelicula3.evalua(5);
        Serie mrRobot = new Serie("Mr Robot", 2001);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(pelicula1);
        lista.add(pelicula2);
        lista.add(pelicula3);
        lista.add(mrRobot);
        //clase List
        Pelicula pelicula4 = new Pelicula("El resplandor",1999);
        Pelicula pelicula5 = new Pelicula("Silicon Valley", 2005);
        var pelicula6 = new Pelicula("Dumath",2025);
        Serie serie2 = new Serie("Snowden",2004);

        List<Titulo> lista2 =new LinkedList<>(); /// Se esta  referenciando el objeto (linkedlist) con la interfaz "List"
        lista2.add(pelicula4);          //las interfaces abstractas se puede cambiar a la vez sin importar el objeto -- List es una interfaz
        lista2.add(pelicula5);
        lista2.add(pelicula6);
        lista2.add(serie2);


        lista2.sort(Comparator.comparing(Titulo::getNombre));
        System.out.println("Ordenando la Lista2(titulo):  " + lista2);
        lista2.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Order by DATE: " + lista2);
        Collections.sort(lista2);
        System.out.println(lista2);

        for (Titulo item: lista){
        System.out.println(item.getNombre());
        if (item instanceof Pelicula pelicula && pelicula.getClasificacion() > 2) {
         //   Pelicula pelicula4 = (Pelicula) item; //casteo
            System.out.println(pelicula.getClasificacion());
            }
        }
//    Titulo.forEach(item -> System.out.println(item)); //operacion lambda
//method Reference: expresion reucida Lambda

        Pelicula peliculaB = pelicula1; //en objetos ; se crea una variable de referencia que muestra el espacio de memoria
        //tanto pelicula5 y pelicula ven y observan los valores



        ArrayList <String> listaDeArtistas = new ArrayList<>();

        listaDeArtistas.add("Penelope Cruz");
        listaDeArtistas.add("Antonio Banderas");
        listaDeArtistas.add("Ali Astete");
        listaDeArtistas.add("Israel Astete");
        System.out.println(listaDeArtistas);
        Collections.sort(listaDeArtistas);
        System.out.println("Lista ordenada " + listaDeArtistas);

        Collections.sort(lista);
        System.out.println("Lista ordenada de Titulos" + lista);


        lista.sort(Comparator.comparing(Titulo::getFechaDeLanzamiento));
        System.out.println("Lista ordenada por fecha " + lista);

       // lista.sort(Comparator.comparing(Titulo::getDuracionEnMinutos));



    }
}
