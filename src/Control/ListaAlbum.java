/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Artista;
import Model.Musica;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class ListaAlbum {
    
    private ArrayList<Album> ListaAlbum = new ArrayList();
    
    public void cadastarAlbum(Album a)
    {
        ListaAlbum.add(a);
    }  
    
    public String imprimirNome(int index)
    {
        return ListaAlbum.get(index).getTitulo();
    }
    
    public int getSize()
    {
        return ListaAlbum.size();
    }
    
    public Album exibicao(int i)
    {
        return ListaAlbum.get(i);
    }
    
    public void adicionarPlaylist(Album album)
    {
        ListaAlbum.add(album);
    }
    
    
    
}
