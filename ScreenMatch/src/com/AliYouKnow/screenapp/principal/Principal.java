package com.AliYouKnow.screenapp.principal;

import com.AliYouKnow.screenapp.funciones.CalculadoraDeTiempo;
import com.AliYouKnow.screenapp.funciones.FiltroRecomendaciones;
import com.AliYouKnow.screenapp.modelos.Episodio;
import com.AliYouKnow.screenapp.modelos.Pelicula;
import com.AliYouKnow.screenapp.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        Pelicula pelicula1 = new Pelicula("Matrix",2000);
        //pelicula1.setNombre("Matrix");
        pelicula1.setDuracionEnMinutos(120);

        //Llamamos a los metodos de la clase

        pelicula1.muestraFichaTecnica();

        pelicula1.evalua(9.5);
        pelicula1.evalua(8);
        pelicula1.evalua(6);
        System.out.println(pelicula1.getNombre());
        System.out.println(pelicula1.getFechaDeLanzamiento());
        System.out.println(pelicula1.getTotalEvaluaciones());

        System.out.println(pelicula1.calculaMedia());

        Serie mrRobot = new Serie("Mr Robot", 2001);
        //mrRobot.setNombre("Mr Robot");
        //mrRobot.setFechaDeLanzamiento(2001);
        mrRobot.setTemporadas(5);
        mrRobot.setMinutosPorEpisodio(53);
        mrRobot.setEpisodiosPorTemporada(10);
        mrRobot.muestraFichaTecnica();
        //muestre la duracion en minutos de la serie

        System.out.println("la duracion de minutos es de: "+ mrRobot.getDuracionEnMinutos());


        Pelicula pelicula2 = new Pelicula("Devs",2005);
        //pelicula2.setNombre(Devs);
        //pelicula2.setFechaDeLanzamiento(2005);
        pelicula2.setDuracionEnMinutos(150);


        CalculadoraDeTiempo calcularTiempo =  new CalculadoraDeTiempo();
        calcularTiempo.incluyeTitulos(pelicula1);
        calcularTiempo.incluyeTitulos(mrRobot);
        calcularTiempo.incluyeTitulos(pelicula2);

        System.out.println("Tiempo para ver los titulo: "+calcularTiempo.getTiempoTotal() + " Minutos");


        FiltroRecomendaciones filtroRecomendaciones = new FiltroRecomendaciones();
        filtroRecomendaciones.filtra(pelicula1);

        Episodio episodio = new Episodio();
        episodio.setNumeroEpisodio(1);
        episodio.setNombre("Osymandias");
        episodio.setSerie(mrRobot);
        episodio.setTotalVisualiziones(50);
        filtroRecomendaciones.filtra(episodio);

        //Es lo mismo que decir el tipo de clase Pelicula pero es fuertemente tipado
        var pelicula3 = new Pelicula("Un argumento",2001); //Agregar el nombre por defecto
        pelicula3.setDuracionEnMinutos(180);
       // pelicula3.setFechaDeLanzamiento(2001);


        /*
Tamaño fijo: el tamaño de un array es fijo y no se puede cambiar una vez creado.
        *  Esto puede resultar problemático en situaciones en las que el tamaño de los datos
        * que se almacenarán es desconocido o variable.
Ausencia de métodos: los arrays no cuentan con métodos que permitan insertar, quitar o buscar elementos
de manera eficiente. Esto puede conducir a soluciones de código complicadas e ineficientes para tareas simples.
        *
        * */
        //Clase de ARRAYS
        ArrayList<Pelicula> listaDePeliculas = new ArrayList<>();
        listaDePeliculas.add(pelicula3);
        listaDePeliculas.add(pelicula1);
        listaDePeliculas.add(pelicula2);

        System.out.println("Tamaño de la Lista: " + listaDePeliculas.size());
        System.out.println("La Primera pelicula es: " + listaDePeliculas.get(0).getNombre());
        System.out.println(listaDePeliculas.toString());
        System.out.println("To String de la pelicula: " + listaDePeliculas.get(0).toString());

        //array de primitivos Y arrays de objetos estaticos
        int[] numeros = new int[5];
        for (int i = 0; i <numeros.length; i++) {
                numeros[i] = i + 1;
        }

        Pelicula[] peliculasMovies = new Pelicula[5];
















    }
}
