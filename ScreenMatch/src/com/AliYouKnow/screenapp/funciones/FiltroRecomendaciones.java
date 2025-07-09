package com.AliYouKnow.screenapp.funciones;

public class FiltroRecomendaciones {

    //metodo para recomendar
    public void filtra(Clasificable clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Alta evaluacion en el momento");
        } else if (clasificacion.getClasificacion() >=2) {
            System.out.println("Popular regular");
        }else{
            System.out.println("Colocalo en tu lista");
        }

    }
}
