/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author bruno
 */
public class Playlist extends AbstractTableModel{

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    private String nome;
    ArrayList<Integer> playlist = new ArrayList();
    private String[] colunas = {"Musica", "Artista", "Ducacao"};
    private CadastrarMusica cm;
    
    public void recebeObjetoCadastrarMusica(CadastrarMusica o)
    {
        cm = o;
    }

    public int getSize()
    {
        return playlist.size();
    }    
    
    public void adicionarMusica(int musica)
    {
        playlist.add(musica);
        this.fireTableDataChanged();
    }

    @Override
    public int getRowCount() {
        return playlist.size();
    }

    @Override
    public int getColumnCount() {
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        switch(coluna){
            case 0:
                return cm.imprimirTitulo(playlist.get(linha));
            case 1:
                return cm.imprimirArtista(playlist.get(linha));
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
