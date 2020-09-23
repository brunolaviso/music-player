/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Model.Artista;
import Model.Musica;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class CadastrarMusica extends AbstractTableModel{
    
    private ArrayList<Musica> ListaMusica = new ArrayList();
    private String[] colunas = {"Musica", "Artista", "Caminho"};
    
    public int getSize() 
    {
        return ListaMusica.size();
    }
    
    public void cadastarMusica(String titulo, String duracao, String artista, String genero)
    {
        ListaMusica.add(new Musica(titulo, duracao, artista, genero));
    }
    
    public void cadastrarMusicaOnlyTitulo(String titulo, String artista, String caminho)
    {
        ListaMusica.add(new Musica(titulo, artista, caminho));
        this.fireTableDataChanged();
    }
    
    public String imprimirListaCompleta()
    {

        return ListaMusica.toString();

    }
    
    public String imprimirTitulo(int index)
    {
        return ListaMusica.get(index).getTitulo().toString();
    }   
    
    public String imprimirArtista(int index)
    {
        return ListaMusica.get(index).getArtista().toString();
    }  
        
    public String imprimirDuracao(int index)
    {
        return ListaMusica.get(index).getDuracao().toString();
    }  

    public CadastrarMusica() {
    }    

    @Override
    public String getColumnName(int i) {
        return colunas[i];
    }
    
    @Override
    public int getRowCount() {
        return getSize();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return ListaMusica.get(linha).getTitulo();
            case 1:
                return ListaMusica.get(linha).getArtista();
            case 2:
                return ListaMusica.get(linha).getFile();
        }
        
        return null;
    }
    
    public void removeMusica(int linha)
    {
        this.ListaMusica.remove(linha);
        this.fireTableRowsDeleted(linha, linha);
    }
}
