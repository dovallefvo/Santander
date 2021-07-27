package com.dovalle.net;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.stream.Collectors;

public class MyUrl {
    //News from JDK 11 to work with http
    private HttpRequest request;
    private HttpResponse<String> response;
    private HttpClient client;

    //Old way to work with URL from JDK 8
    private URL url;
    private URLConnection urlConnection;

    public MyUrl(){
        makeUrlConnectionDeprecated();
        createHttpInfos();
    }

    private void makeUrlConnectionDeprecated() {
        try {
            this.url = new URL("https://www.java.com/pt-BR/about/");
            this.urlConnection = this.url.openConnection();
        }
        catch (Exception e){
            System.out.println("\nError to create an URL and its connection. " + e.getMessage());
        }
    }

    private void createHttpInfos(){
        try {
            var uriAux = URI.create("https://www.java.com/pt-BR/about/");
            this.request = HttpRequest.newBuilder().GET().uri(uriAux).build();
            this.client = HttpClient.newHttpClient();
            this.response = this.client.send(request, HttpResponse.BodyHandlers.ofString());
        }
        catch (Exception e){
            System.out.println("\nError to create a HTTP Client, Request and Response. " + e.getMessage());
        }

    }

    public void showContent(){
        try {
            var bufferReaded = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            System.out.println(String.format("\nSHOW CONTENT FROM URL: DEPRECATED METHODOLOGY\n %s", bufferReaded.lines().collect(Collectors.joining()).replaceAll("\\>", "\\>\n")));

            System.out.println("\n\n************\nSHOW CONTENT THROUGH HTTP CLIENT REQUEST\n");
            System.out.println("\nStatus code :: " + response.statusCode());
            System.out.println("\nHeader response :: " + response.headers());
            System.out.println("\n" + response.body());
        }
        catch (Exception e){
            System.out.println("\nError to show the content into URL. " + e.getMessage());
        }
    }

}
