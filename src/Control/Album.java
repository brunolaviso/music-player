/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Artista;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class Album extends AbstractTableModel{

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    private String titulo;
    private String artista;
    private ArrayList<Integer> album = new ArrayList();
    private CadastrarMusica cm;
    private String[] colunas = {"Musica", "Artista", "Ducacao"};
    
    public void recebeObjetoCadastrarMusica(CadastrarMusica o)
    {
        cm = o;
    }
    
    public void adicionarMusica(int musica)
    {
        album.add(musica);
        this.fireTableDataChanged();
    }
    
    public int getSize()
    {
        return album.size();
    }
    

    @Override
    public int getRowCount() {
        return album.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return cm.imprimirTitulo(album.get(linha));
            case 1:
                return cm.imprimirArtista(album.get(linha));
            case 2:
                //return cm.imprimirDuracao(playlist.get(linha));
        }
        
        return null;
    }

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
    
}
