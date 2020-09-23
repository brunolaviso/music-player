/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bruno
 */
public class Musica {
    
    private String titulo;
    private String duracao;
    private String artista;
    private String genero;
    private String caminho; //passar o arquivo para reprodução
    
    public String getFile() {
        return caminho;
    }

    public void setFile(String caminho) {
        this.caminho = caminho;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Musica(String titulo, String duracao, String artista, String genero) {
        this.titulo = titulo;
        this.duracao = duracao;
        this.artista = artista;
        this.genero = genero;
    }

    public Musica() {
    }
    
    public Musica(String titulo, String artista, String caminho)
    {
        this.titulo = titulo;
        this.artista = artista;
        this.caminho = caminho;
    }
    
    
    
    
}
