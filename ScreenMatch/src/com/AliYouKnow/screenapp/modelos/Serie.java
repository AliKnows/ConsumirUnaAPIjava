package com.AliYouKnow.screenapp.modelos;

import com.AliYouKnow.screenapp.funciones.Clasificable;

public class Serie extends Titulo  {
    private int temporadas;
    private int episodiosPorTemporada;
    private int minutosPorEpisodio;

    public Serie(String nombre, int fechaDeLanzamiento) {
        super(nombre, fechaDeLanzamiento);
    }

    //Identificar una sobre escritura de metodos: es una buena practica
    @Override
    public int getDuracionEnMinutos() {
        return temporadas*episodiosPorTemporada*minutosPorEpisodio; // Super: de la clase madre
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }

    @Override
    public String toString() {
        return "Serie: "+ this.getNombre()+ " ("+this.getFechaDeLanzamiento()+")";
    }
}
