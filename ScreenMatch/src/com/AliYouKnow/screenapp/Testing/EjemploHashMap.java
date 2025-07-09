package com.AliYouKnow.screenapp.Testing;

import java.util.HashMap;
import java.util.Map;

public class EjemploHashMap {
    public static void main(String[] args) {
        //creando un objeto de la clase hashmap que implemnta la interface
        Map<String, Integer> usandoHashMap = new HashMap<>();
        //agregando pares clave valor
        usandoHashMap.put("Grima", 1);
        usandoHashMap.put("Ali", 2);
        usandoHashMap.put("Israel", 3);
        usandoHashMap.put("Kevin", 4);
    //Accediendo un vakir usando una clave
        int valor = usandoHashMap.get("Ali");
        System.out.println(valor);
    //eliminando un par clave-valor
        usandoHashMap.remove("Kevin");
    //Iterando sobre las claves
        for (String clave : usandoHashMap.keySet()){
            System.out.println("Clave: " + clave);
            System.out.println("Valor: " + usandoHashMap.get(clave));
        }

    }


}
