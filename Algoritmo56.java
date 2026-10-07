import java.net.URI; //URL WWW. GOGLE.COM
import java.net.http.HttpClient; // OBJETO QUE REPRESENTA O CLIENTE 

import java.net.http.HttpRequest; // SOLICITA UMA REQUISIÇÃO
//HTTP PROTOCOLO DE COMUNICAÇÃO
import java.net.http.HttpResponse; //EMVIA A RESPOSTA DO SERVIDOR   

public class Algoritmo56 {
    
public static void main(String[] args) {
 // URL da API para buscar as racas dos gatos
 String url = "https://api.thecatapi.com/v1/breeds";

 // Criando o cliente HTTP moderno nativo do Java
 HttpClient client = HttpClient.newHttpClient(); // linha 16 a 26 requisição
// Construindo a requisicao GET

 //HttpRequest request = HttpRequest.newBuilder()
 //OBJETO CLIENET
 HttpRequest request = HttpRequest.newBuilder()
 .uri(URI.create(url)).
 header("Accept", "application/json")
// Se tiver uma API Key, descomente a linha abaixo:
.header("x-api-key", "live_D1Vh2qA9ORenq5AgpRcAl7QaRTPJMNKJyVVMjer3cGPZ5EtF7vaKvmA3kria44aq")
 .GET()
 .build();

 try {
 // Enviando a requisicao de forma sincrona
 HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString() );

 if (response.statusCode() == 200) {
 System.out.println("Resposta da API:");
 System.out.println(response.body());

 // Dica: Para extrair a URL de forma elegante, voce pode usar
 // uma biblioteca como Jackson ou Gson, ou fazer um parsing simples.
 } else {
 System.out.println("Erro na requisicao: " + response.statusCode());
 }

 } catch (Exception e) {
 e.printStackTrace();
 }
 }
 }

