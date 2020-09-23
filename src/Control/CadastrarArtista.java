/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Artista;
import java.util.ArrayList;

/**
 *
 * @author bruno
 */
public class CadastrarArtista {
    
    private ArrayList<Artista> ListaArtista = new ArrayList();
    
    public int getSize()
    {
        return ListaArtista.size();
    }
    
    public void cadastarArtista(String nome)
    {
        ListaArtista.add(new Artista(nome));
    }
    
    public String imprimirListaCompleta()
    {
        return ListaArtista.toString();
    }

    public CadastrarArtista() {
    }
    
    public String imprimirIndividual(int index)
    {
        return ListaArtista.get(index).getNome().toString();
    }   
    
}
