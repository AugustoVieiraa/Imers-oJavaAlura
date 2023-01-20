# Repositorio do projeto de Imersao Java da Alura realizado em 18/07/2022. #alura #imersaojava
A imersao foi dividida em 5 aulas. Em cada aula foram disponbilizados os links relacionados, desafios e materiais complementares dos assuntos de cada aula. Abaixo seguem os links e os desafios propostos.
Link repositorio alura: https://github.com/alura-cursos/imersao-java/tree/aula5

# Link da Aula 01 - Consumindo uma API de filmes com Java.
https://www.alura.com.br/imersao-java/aulas/aula01-consumindo-api-com-java?utm_source=ActiveCampaign&utm_medium=email&utm_content=%5BImers%C3%A3o+Java%5D+Aula+1+liberada++Vem+ver%21&utm_campaign=%5BImers%C3%A3o%5D+%28Java+1%C2%B0+ed+%29++Libera%C3%A7%C3%A3o+aula+01&vgo_ee=zsQrQKC88qmOk9MIWtHiwgA3SuMkJhmkGexv49sZvNU%3D

# Desafios aula 1:
1. Consumir o endpoint de filmes mais populares da API do IMDB. Procure também, na documentação da API do IMDB, o endpoint que retorna as melhores séries e o que retorna as séries mais populares.
2. Usar sua criatividade para deixar a saída dos dados mais bonitinha: usar emojis com código UTF-8, mostrar a nota do filme como estrelinhas, decorar o terminal com cores, negrito e itálico usando códigos ANSI, e mais!
3. Colocar a chave da API do IMDB em algum lugar fora do código como um arquivo de configuração (p. ex, um arquivo .properties) ou uma variável de ambiente
4. Mudar o JsonParser para usar uma biblioteca de parsing de JSON como Jackson ou GSON
5. Desafio supremo: criar alguma maneira para você dar uma avaliação ao filme, puxando de algum arquivo de configuração OU pedindo a avaliação para o usuário digitar no terminal.

# Links citados aula 1
- Os 250 melhores filmes de acordo com a classificação do IMDB. https://www.imdb.com/chart/top/
- A documentação da API do IMDB.https://imdb-api.com/api
- Instalação do Visual Studio Code com o Coding Pack para Java: https://code.visualstudio.com/docs/languages/java#_install-visual-studio-code-for-java
- Documentação da classe HttpRequest do pacote java.net.http: https://docs.oracle.com/en/java/javase/17/docs/api/java.net.http/java/net/http/HttpRequest.html
- Classe pronta que utiliza Expressões Regulares para fazer parse de um JSON. https://gist.github.com/alexandreaquiles/cf337d3bcb59dd790ed2b08a0a4db7a3
- Biblioteca Jackson, que faz parse de JSON. https://github.com/FasterXML/jackson
- Site que ajuda a entender Expressões Regulares. https://regex101.com/
- Artigo: Como deixar no seu GitHub com um README interessante.https://www.alura.com.br/artigos/escrever-bom-readme
- O endpoint da API do IMDB que devolve os 250 melhores filmes: https://imdb-api.com/en/API/Top250Movies/ + SUA-API-KEY : https://imdb-api.com/en/API/Top250Movies/

# Material complementar aula 1
- Artigo na Alura “O que é JSON?”: https://www.alura.com.br/artigos/o-que-e-json
- Artigo na Alura sobre como pintar o terminal, com tabelinha de cores e negrito: https://www.alura.com.br/artigos/decorando-terminal-cores-emojis
- Artigo na Alura sobre como usar VS Code para codar em Java: https://www.alura.com.br/artigos/desenvolvendo-aplicacoes-java-vs-code

# Link da Aula 02 - Gerando figurinhas para WhatsApp.
https://www.alura.com.br/imersao-java/aulas/aula02-stickers-com-whatsapp?utm_source=ActiveCampaign&utm_medium=email&utm_content=%5BImers%C3%A3o+Java%5D+Te+ensinamos+a+criar+os+famosos+stickers&utm_campaign=%5BImers%C3%A3o%5D+%28Java+1%C2%B0+ed+%29++Libera%C3%A7%C3%A3o+aula+02&vgo_ee=zsQrQKC88qmOk9MIWtHiwgA3SuMkJhmkGexv49sZvNU%3D

# Desafios aula 2:
1. Ler a documentação da classe abstrata InputStream.
2. Centralizar o texto na figurinha.
3. Fazer um pacote no Whatsapp e/ou Telegram com as suas próprias figurinhas!
4. Criar diretório de saída das imagens, se ainda não existir.
5. Colocar outra fonte como a Comic Sans ou a Impact, a fonte usada em memes.
6. Colocar uma imagem de você que está fazendo esse curso sorrindo, fazendo joinha!
7. Colocar contorno (outline) no texto da imagem.
8. Tratar as imagens retornadas pela API do IMDB para pegar uma imagem maior ao invés dos thumbnails. Opções: pegar a URL da imagem e remover o trecho mostrado durante a aula ou consumir o endpoint de posters da API do IMDB (mais trabalhoso), tratando o JSON retornado.
9. Fazer com que o texto da figurinha seja personalizado de acordo com as classificações do IMDB.
10. Desafio supremo: usar alguma biblioteca de manipulação de imagens como OpenCV pra extrair imagem principal e contorná-la. https://github.com/opencv-java

# Link citados aula 2
- Documentação do pacote javax.imageio, que trata de leitura e escrita de imagens. https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/javax/imageio/package-summary.html
- Documentação da classe BufferedImage, que representa uma imagem no Java: https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/image/BufferedImage.html
- Documentação da classe Graphics2D, a “caneta” que permite escrever, desenhar e imprimir outras imagens em uma imagem original. https://docs.oracle.com/en/java/javase/17/docs/api/java.desktop/java/awt/Graphics2D.html
- Documentação da abstração InputStream, que representa um fluxo de leitura de dados de qualquer fonte, como arquivos, URLs, entre outros. https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/io/InputStream.html

# Material complementar aula 2
- Primeira aula do curso “Java Polimorfismo: entenda herança e interfaces” da Alura. https://www.alura.com.br/conteudo/java-heranca-interfaces-polimorfismo
- Apêndice da apostila “Java e Orientação a Objetos” da Alura sobre o pacote java.io que explica com mais detalhes a abstração InputStream. https://www.alura.com.br/apostila-java-orientacao-objetos/apendice-pacote-java-io

# Link da Aula 03 - Ligando as pontas, refatoração e orientação a objetos
https://www.alura.com.br/imersao-java/aulas/aula03-orientacao-a-objetos?utm_source=ActiveCampaign&utm_medium=email&utm_content=%5BImers%C3%A3o+Java%5D+Liberado%21+Vem+ver+a+aula+03%2C++FIRSTNAME&utm_campaign=%5BImers%C3%A3o%5D+%28Java+1%C2%B0+ed+%29++Libera%C3%A7%C3%A3o+aula+03&vgo_ee=zsQrQKC88qmOk9MIWtHiwgA3SuMkJhmkGexv49sZvNU%3D

# Desafios aula 3:
1. Transformar a classe que representa os conteúdos em um Record, disponível a partir do Java 16.
2. Criar as suas próprias exceções e usá-las na classe que implementa o cliente HTTP.
3. Usar recursos do Java 8 e posterior, como Streams e Lambdas, para mapear uma lista em uma outra.
4. Criar uma Enum que une, como configurações, a URL da API e o extrator utilizado.
5. Desafio supremo: consumir outras APIs que contém imagens, como a da Marvel, que é bem diferente. Repositório com APIs públicas: https://github.com/public-apis/public-apis

# Links citados aula 3
- Documentação das APIs da NASA: https://api.nasa.gov/
- API da Foto Astronômica do dia da NASA: https://api.nasa.gov/planetary/apod?api_key=DEMO_KEY
- Artigo na Alura “Como não aprender Java e Orientação a Objetos: getters e setters”: https://www.alura.com.br/artigos/nao-aprender-oo-getters-e-setters-
- Livro “Design Patterns”, de 1994, que descreve soluções comuns para problemas recorrentes de como organizar seu código: https://www.amazon.com/Design-Patterns-Elements-Reusable-Object-Oriented/dp/0201633612
- Livro “Refactoring”, de 1999, que cataloga maneiras sistemáticas de melhorar o código sem modificar o que é feito: https://www.amazon.com/Refactoring-Improving-Design-Existing-Code/dp/0201485672

# Material complementar aula 3
- Artigo na Alura “Como não aprender Java e Orientação a Objetos: herança”: https://www.alura.com.br/artigos/como-nao-aprender-orientacao-a-objetos-heranca
- Podcast Hipsters.tech sobre Práticas de Orientação a Objetos: https://www.alura.com.br/podcast/praticas-de-orientacao-a-objetos-hipsters-129-a453
- Podcast Hipsters.tech sobre Design Patterns: https://www.alura.com.br/podcast/design-patterns-hipsters-206-a345
- Podcast Hipsters.tech sobre SOLID: https://www.alura.com.br/podcast/solid-codigo-bom-e-bonito-hipsters-ponto-tech-219-a649

# Link da Aula 04 - Criando nossa própria API com Spring
https://www.alura.com.br/imersao-java/aulas/aula04-apis-com-spring?utm_source=ActiveCampaign&utm_medium=email&utm_content=%5BImers%C3%A3o+Java%5D+Aula+04+dispon%C3%ADvel+%E2%9C%85&utm_campaign=%5BImers%C3%A3o%5D+%28Java+1%C2%B0+ed+%29++Libera%C3%A7%C3%A3o+aula+04&vgo_ee=zsQrQKC88qmOk9MIWtHiwgA3SuMkJhmkGexv49sZvNU%3D

# Desafios aula 4:
1. Finalizar o CRUD (Create, Read, Update e Delete) para que se possa atualizar e excluir uma linguagem cadastrada;
2. Devolver a listagem ordenada pelo ranking;
3. Criar na sua API um modelo de entidade com nomes diferentes de title e image e criar seu próprio extrator de informações personalizado OU, manter com o nome title e image e traduzir para que seja retornado como título e imagem através do uso de DTO (Data Transfer Object);
4. Retornar o status 201 quando um recurso (linguagem, no nosso caso) for cadastrado através do POST;
5. Desafio supremo: Aplicar modificações parciais no recurso através do método PATCH, por exemplo, modificando o número de votos ou de pessoas que utilizam cada linguagem de programação.

# Links citados aula 4
- Documentação do Spring Framework: https://spring.io/
- Link para iniciar um projeto utilizando Spring: https://start.spring.io/
- Link para download do Maven: https://maven.apache.org/download.cgi
- Link para download do Postman: https://www.postman.com/
- Página para fazer o registro e começar a utilizar o MongoDb Atlas: https://www.mongodb.com/cloud/atlas/register
- GitHub com os logos das linguagens de programação: https://github.com/abrahamcalf/programming-languages-logos
- Artigo sobre o pack de stickers da Alura para Whatsapp e Telegram: alura.com.br/artigos/stickers-dev-aluraverso-whatsapp-telegram

# Material complementar aula 4
- Primeira aula do curso “Maven: gerenciamento de dependências e build de aplicações Java” da Alura: https://www.alura.com.br/conteudo/maven-gerenciamento-dependencias-build-aplicacoes-java
- Alura+ “O que é REST?”: https://www.youtube.com/watch?v=weQ8ssA6iBU&ab_channel=AluraCursosOnline
- Artigo da Alura “Conceito e fundamentos sobre REST”: https://www.alura.com.br/artigos/rest-conceito-e-fundamentos
- Podcast Hipsters.Tech sobre MongoDB: https://www.hipsters.tech/mongodb-hipsters-ponto-tech-305/
- Hipters.Tube “O que é SQL e NoSQL?”: https://www.youtube.com/watch?v=aure5d3B88g&ab_channel=AluraCursosOnline
- Artigo da Alura “Spring: Conheça esse framework Java”: https://www.alura.com.br/artigos/spring-conheca-esse-framework-java
- Alura+ Introdução ao Postman”: https://www.youtube.com/watch?v=op81bMbgZXs

# Aula 05 - Publicando nossa API no CloudCada aula foram 
https://www.alura.com.br/imersao-java/aulas/aula05-deploy-no-cloud?utm_source=ActiveCampaign&utm_medium=email&utm_content=%5BImers%C3%A3o+Java%5D+Todas+as+aulas+liberadas%21+E+al%C3%A9m+disso&utm_campaign=%5BImers%C3%A3o%5D+%28Java+1%C2%B0+ed+%29++Recados+importantes+%2B+aviso+que+ter%C3%A1+desconto+na+segunda&vgo_ee=zsQrQKC88qmOk9MIWtHiwgA3SuMkJhmkGexv49sZvNU%3D

# Desafios aula 5:
1. Compartilhe com seus amigos a sua URL do Heroku, para que eles possam consumir a sua API (com o padrão de atributos title e image) e gerar figurinhas do conteúdo que você utilizou (linguagens de programação, filmes, músicas);
2. Colocar a aplicação no cloud da Oracle;
3. Implementar algum mecanismo de votação na API, para que outros amigos votem nas linguagens preferidas para que se possa fazer um ranking;
4. Desafio supremo: Evoluir o projeto das três primeiras aula para que ele gere um bundle de stickers, para que se possa fazer o download e já incluir vários stickers no WhatsApp; Usar os conhecimentos aprendidos em alguma imersão React da Alura e fazer uma aplicação front-end para gerar esse bundle, onde possa se passar a URL do conteúdo e já visualizar os stickers;

# Links citados aula 5
- Dev em T: especialista x generalista. https://www.alura.com.br/dev-em-t
- Site do Heroku, que é um PaaS (plataforma como serviço). https://www.heroku.com/
- Documentação sobre a Oracle Cloud. https://docs.oracle.com/pt-br/iaas/Content/home.htm
- Artigo: Como elaborar um bom arquivo Readme para os seus projetos. https://www.alura.com.br/artigos/escrever-bom-readme

# Material complementar aula 5
- Artigo da Alura “Heroku, Vercel e outras opções de Cloud como plataforma”. https://www.alura.com.br/artigos/heroku-vercel-outras-opcoes-cloud-plataforma
- Podcast Hipters.Tech “Integração Contínua, Deploy Contínuo e Github Actions”. https://www.alura.com.br/podcast/hipsterstech-integracao-continua-deploy-continuo-e-github-actions-hipsters-213-a335
- Pesquisa da JetBrains, empresa que desenvolve a IDE IntelliJ, sobre o ecossistema Java em 2021. https://www.jetbrains.com/lp/devecosystem-2021/java/

# Links e links alternativos
- API da NASA: Caso a API da NASA fique instável, use as seguintes URLs, que terão os mesmos dados usados na aula:
1. (https://api.mocki.io/v2/549a5d8b/NASA-APOD)
2. (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD.json)
3. (https://api.mocki.io/v2/549a5d8b/NASA-APOD-JamesWebbSpaceTelescope)
4. (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/NASA-APOD-JamesWebbSpaceTelescope.json)

- API do IMDB instável: Como a API do IMDB continua muito instável, vamos deixar algumas alternativas de API com um conteúdo semelhante para vocês:
1. (https://api.mocki.io/v2/549a5d8b/Top250Movies)
2. (https://api.mocki.io/v2/549a5d8b/MostPopularMovies)
3. (https://api.mocki.io/v2/549a5d8b/MostPopularTVs)
4. (https://api.mocki.io/v2/549a5d8b/Top250TVs)

- Segue também uma solução inspirada na que foi criada ontem pelo instrutor Alex Felipe:
1. (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopMovies.json)
2. (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/MostPopularMovies.json)
3. (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/MostPopularTVs.json)
4. (https://raw.githubusercontent.com/alura-cursos/imersao-java/api/TopTVs.json)


