/* @author augusto vieira do carmo*/

import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.List;
import java.util.Map;

public class App {
    public static void main(String[] args) throws Exception {

        //conexao http com api de filmes
        String url_filmes = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        URI endereco = URI.create(url_filmes);
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder(endereco).GET().build();
        HttpResponse<String> response = client.send(request, BodyHandlers.ofString());
        String body = response.body();
        //System.out.println(body);
        //System.out.println("teste");
        //extração dos atributos
        var parser = new JsonParser();
        List<Map<String, String>> listaDeFilmes = parser.parse(body);

        //exibiçao
        var geradora = new GeradoraDeFigurinhas();
        for (Map<String, String> filme : listaDeFilmes) {
            String urlImagem = filme.get("image");
            String titulo = filme.get("title");
            String nomeArquivo = titulo + ".png";
            InputStream inputStream = new URL(urlImagem).openStream();
        
            geradora.cria(inputStream, nomeArquivo);
            
            String y, z;
            y = filme.get("imDbRating");
            z = filme.get("year");
            System.out.println("Filme: "+titulo+"\nRating: "+y+"\tAno lançamento: "+z+"\n");
        }
        
    }
}