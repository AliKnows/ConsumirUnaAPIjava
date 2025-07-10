package com.AliYouKnow.screenapp.principal;

import java.io.IOException; //errores exception
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalConBusqueda {

    //este codigo no deberia estar en el main
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Escriba el nombre de la pelicula: ");

        var busqueda = teclado.nextLine();
        //https://www.omdbapi.com/?t=Matrix&apikey=fb5eae08
        String direccion = "https://www.omdbapi.com/?t=" + busqueda + "&apikey=fb5eae08";

        //Hacer una request/peticion a un servidor usando verbos http

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(direccion))
                .build();
// HttpRequest req = new HttpRequest(); <- es abstract como si fuera una "interfaz"
//por eso se usa builder
/*Recibir los datos despues de pedir*/
        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        System.out.println(response.body());


    }
}
