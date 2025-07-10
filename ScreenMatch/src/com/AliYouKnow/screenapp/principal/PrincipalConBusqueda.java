package com.AliYouKnow.screenapp.principal;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;

public class PrincipalConBusqueda {
    public static void main(String[] args) {
        //Hacer una request/peticion a un servidor usando verbos http

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://"))
                .build();

        


    }
}
