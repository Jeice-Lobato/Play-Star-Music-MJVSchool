# PLAY STAR MUSIC - MJV Projeto Final
#### Autor
- [Jeice Lobato](https://github.com/Jeice-Lobato)
Repositório contendo o código fonte do projeto Play-Star-Music
##### Tecnologias
* Java
* JPA Hibernate
* Postgre SQL
* Spring Boot
* Swagger
##### Apresentação
1. Cadastro de gênero musical
2. Cadastro de artista
3. Cadastro de músicas
4. Cadastro de usuários
5. Cadastro de playlist e seleção de músicas.
##### JSON Cadastros

* Cadastrando gênero musical:
```
{
  "name": "MÚSICA CLÁSSICA"
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
  "nomeUsuario": "Jeice Lobato",
  "cpf": "78546985213",
  "email": "jeicelobato@gmail.com",
  "senhaLogin": "mjv@School"
}
```
* Gerando playlist e selecionando músicas:
```
{
  "nomePlaylist": "JEICE`S PLAYLIST",
  "usuario": 3,
  "musicas": [
    {
      "musica": 2
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
* Exibindo  as músicas da playlist:
```
http://localhost:8080/playlist_musica
```




