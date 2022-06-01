# 🎵🎧  PLAY STAR MUSIC - MJV Projeto Final  🎵🎧


<img src="https://www.vilage.com.br/blog/wp-content/uploads/2021/04/como-registrar-uma-musica.png" width="700px">

#### Autor 👩‍🎓
- Jeice Lobato
- Repositório contendo o código fonte do projeto Play-Star-Music : https://github.com/Jeice-Lobato

##### 💻 Tecnologias 💻
* Java
* JPA Hibernate
* PostgreSQL
* Spring Boot
* Swagger
* TDD
* Postman
* MVC
* Maven
* Eclipse

##### Proposta da implementação ✍️
* Permitir o cadastro de músicas, artistas e gêneros musicais. Sendo possível ao usuário, se cadastrar e nomear sua playlist, selecionando as músicas de sua preferência.
* Foi desenvolvida uma API documentada no Swagger em uma depência, através das tecnologias citadas anteriormente.

Diagrama de classes - UML

<img src="https://github.com/Jeice-Lobato/Play-Star-Music-MJVSchool/blob/main/UML%20-%20PLAY%20STAR%20MUSIC.png?raw=true" width="900px">

##### Apresentação 👩‍🏫
1. Cadastro de gêneros musicais
2. Cadastro de artistas
3. Cadastro de músicas
4. Cadastro de usuários
5. Cadastro de playlists e seleção de músicas.
##### JSON Cadastros

* Cadastrando gênero musical:
```
{
  "nomeGeneroMusical": "MÚSICA CLÁSSICA"
}
```
* Cadastrando artistas:
```
{
  "nomeArtista": "BEETHOVEN",
  "biografia": "Beethoven nasceu na cidade de Bonn (Alemanha) em 16 de dezembro de 1770.Conviveu com a música clássica desde a infância, pois seu pai era professor de música e tenor na corte de Bonn. Beethoven viveu uma época de transição musical, entre a era clássica e a romântica. Aos 22 anos mudou-se para a cidade de Viena (Áustria), onde construiu sua carreira. É autor de sonatas, quartetos, sinfonias e da ópera Fidélio, um de sus grandes criações. Em suas obras musicais passava um profundo sentimento e incomparável expressão.Nos últimos anos de sua vida, sofreu de surdez. Mesmo com o problema de saúde, continuou criando lindas obras musicais. Faleceu em 26 de março de 1827, aos 56 anos, na cidade de Viena (Império Austríaco), enquanto compunha sua 10ª sinfonia. A causa de sua morte foi cirrose hepática."
}
```
* Cadastrando músicas:
```
{
  "nomeMusica": "Für Elise",
  "artista": 13,
  "generoMusical": 5,
  "albumMusica": "1810",
  "tempoMusica": "5 : 06m"
 }
```
* Cadastrando  usuário:
```
{
  "nomeUsuario": "JON SNOW NÃO SABE DE NADA",
  "cpf": "78546985213",
  "email": "joaodasneves@gmail.com",
  "senhaLogin": "nao sei de nada"
}
```
* Gerando playlist e selecionando músicas:
```
{
  "nomePlaylist": "JONS`S PLAYLIST",
  "usuario": 2,
  "musicas": [
    {
      "musica": 47
    },
{
      "musica": 37
    },
{
      "musica": 18
    },
{
      "musica": 7
    }
  ]
}
```
* Para acessar os dados na API, importe o código fonte e acesse o link abaixo:

  http://localhost:8080/swagger-ui/index.html






