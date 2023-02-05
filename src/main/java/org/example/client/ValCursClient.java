package org.example.client;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class ValCursClient {
    private HttpClient httpClient = HttpClient.newHttpClient();

    public String getRawValCurs() throws IOException, InterruptedException {
        HttpRequest httpRequest = HttpRequest.newBuilder()
                .GET()
                .uri(URI.create("http://www.cbr.ru/scripts/XML_daily.asp"))
                .build();
        return httpClient.send(httpRequest, HttpResponse.BodyHandlers.ofString()).body();

    }

}
