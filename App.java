/* @author augusto vieira do carmo*/
// email: augustocarmo@aluno.santoangelo.uri.br

import java.io.InputStream;
import java.net.URL;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {

        //conexao http com api de filmes
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        // String url = "https://imdb-api.com/en/API/Top250Movies/k_0ojt0yvm";

        //url filmes IMDB
        //String url = "https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json";
        //ExtratorDeConteudo extrator = new ExtratorDeConteudoDoImdb();
       
        //url fotos Nasa
        String url = "https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY&start_date=2022-06-12&end_date=2022-06-20";
        ExtratorDeConteudo extrator = new ExtratorDeConteudoDaNasa();
        
        var http = new ClienteHttp();
        String json = http.buscaDados(url);

        //exibir e manipular
        List<Conteudo> conteudos = extrator.extraiConteudos(json);
       
        var geradora = new GeradoraDeFigurinhas();

        for (int i = 0; i < 5; i++) {

            Conteudo conteudo = conteudos.get(i);

            String nomeArquivo = "saida/" + conteudo.getTitulo() + ".png";

            InputStream inputStream = new URL(conteudo.getUrlImagem()).openStream();
            
            geradora.cria(inputStream, nomeArquivo);

            System.out.println(conteudo.getTitulo());
            System.out.println();
        }
    }
}
