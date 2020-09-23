/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Musica;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class ListaPlaylist{
    
    ArrayList<Playlist> ListaPlaylist = new ArrayList();
    private CadastrarMusica cm;
    
    public void recebeObjetoCadastrarMusica(CadastrarMusica o)
    {
        cm = o;
    }
    
    public int getSize()
    {
        return ListaPlaylist.size();
    }
    
    public void adicionarPlaylist(Playlist playlist)
    {
        ListaPlaylist.add(playlist);
    }
    
    public String imprimirNome(int index)
    {
        return ListaPlaylist.get(index).getNome();
    }
    
    public Playlist exibicao(int i)
    {
        return ListaPlaylist.get(i);
    }
    
}
