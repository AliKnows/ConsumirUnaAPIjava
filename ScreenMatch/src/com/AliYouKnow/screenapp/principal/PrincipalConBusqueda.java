package com.AliYouKnow.screenapp.principal;

import com.AliYouKnow.screenapp.excepciones.ErrorEnConversionDeDuracionException;
import com.AliYouKnow.screenapp.modelos.Titulo;
import com.AliYouKnow.screenapp.modelos.TituloOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException; //errores exception
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalConBusqueda {

    //este codigo no deberia estar en el main
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner teclado = new Scanner(System.in);
        List<Titulo> titulos = new ArrayList<>();

        //Instanciando la clase del paquete gson
        //Gson gson = new Gson();

        //Usando el patron builder con Gson para comprender
        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting() //mejorar la lista visualmente en json
                .create();

        //Titulo tituloConGson = gson.fromJson(json, Titulo.class );


        while(true){

            System.out.println("Escriba el nombre de la pelicula: ");
            var busqueda = teclado.nextLine();

            if (busqueda.equalsIgnoreCase("salir") || busqueda.equalsIgnoreCase("exit")){

                break;
            }


            //https://www.omdbapi.com/?t=Matrix&apikey=fb5eae08
            String direccion = "https://www.omdbapi.com/?t=" + busqueda.replace(" ", "+") + "&apikey=fb5eae08";//remplaza los expacios por +
            //Utilizar la clase: URLEncoder para cambiar el espacio->
            //Hacer una request/peticion a un servidor usando verbos http

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))   //en este lugar esta el error del problema de Encoding
                        .build();
// HttpRequest req = new HttpRequest(); <- es abstract como si fuera una "interfaz"
//por eso se usa builder
                /*Recibir los datos despues de pedir*/
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);

                //System.out.println("Titulo: " + tituloConGson.getNombre());
                //System.out.println(tituloConGson);

                TituloOmdb tituloConGsonOmdb = gson.fromJson(json, TituloOmdb.class);
                System.out.println(tituloConGsonOmdb);

                Titulo tituloConBuilder = new Titulo(tituloConGsonOmdb);
                System.out.println(" Titulo ya convertido: " + tituloConBuilder);

                /*Metodo de escritura de la clase java.io
                FileWriter escritura = new FileWriter("peliculas.txt"); // crea un archivo
                escritura.write(tituloConBuilder.toString()); //el momento en que crea y escribe
                escritura.close();                    //Cerrar la escritura, es importante cerra para evitar porblemas como de memoria,etc
                */

                titulos.add(tituloConBuilder);


            } catch (NumberFormatException e) {
                System.out.println("Ocurrio un error");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException e) {
                System.out.println("");

            }//catch (Exception e){  <- es una exception general mas generica
            //System.out.println("Ocurrio un error inesperado");}
            catch (ErrorEnConversionDeDuracionException e){
                System.out.println(e.getMessage());
            }
        }
        System.out.println(titulos);
        FileWriter escritura = new FileWriter("titulos.json");
        escritura.write(gson.toJson(titulos));
        escritura.close();

        System.out.println("Finalizo la ejecucion del Programa");

    }



}
