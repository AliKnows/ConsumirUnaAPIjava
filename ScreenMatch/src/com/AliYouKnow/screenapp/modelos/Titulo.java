package com.AliYouKnow.screenapp.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    @SerializedName("Title")
    private String nombre;
    @SerializedName("Year")
    private int fechaDeLanzamiento;
   // @SerializedName("Runtime")
    private int duracionEnMinutos;
    private boolean incluidoEnElPlan;
    private double sumaDeCalificaciones; //modificadores de acceso - Encapsulamiento
    private int totalEvaluaciones;

    public Titulo(String nombre, int fechaDeLanzamiento) {
        this.nombre = nombre;
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    //creando metodos
    /*
    convencion de metodos: verbos en infinitivo y tambien en imperativo(mas usado)=
    */

    public String getNombre() {
        return nombre;
    }

    public int getFechaDeLanzamiento() {
        return fechaDeLanzamiento;
    }

    public int getDuracionEnMinutos() {
        return duracionEnMinutos;
    }

    public boolean isIncluidoEnElPlan() {
        return incluidoEnElPlan;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaDeLanzamiento(int fechaDeLanzamiento) {
        this.fechaDeLanzamiento = fechaDeLanzamiento;
    }

    public void setDuracionEnMinutos(int duracionEnMinutos) {
        this.duracionEnMinutos = duracionEnMinutos;
    }

    public void setIncluidoEnElPlan(boolean incluidoEnElPlan) {
        this.incluidoEnElPlan = incluidoEnElPlan;
    }

    public int getTotalEvaluaciones(){     //Convencion al crear un metodo que queremos obtener algo, se le llama => get
        return totalEvaluaciones;
    } // metodo que permite mostrar el valor totalEvaluaciones,
    //public, protected, private y default(Solo se accese las mismas clases que estan en el paquete).

    public void muestraFichaTecnica(){
        System.out.println("El nombre es: " + nombre);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Duracion en minutos: " + getDuracionEnMinutos());
        System.out.println("*************");
    }

    public void evalua(double calificacionPeli){
        sumaDeCalificaciones += calificacionPeli;
        totalEvaluaciones++;
    }

    public double calculaMedia() {
        return sumaDeCalificaciones / totalEvaluaciones;

    }

    @Override
    public int compareTo(Titulo otroTitulo) {
        return this.getNombre().compareTo(otroTitulo.getNombre());

    }

    @Override
    public String toString() {
        return  "nombre='" + nombre +
                ", fechaDeLanzamiento=" + fechaDeLanzamiento;
        //+", duracionEnMinutos=" + duracionEnMinutos;
    }
}
