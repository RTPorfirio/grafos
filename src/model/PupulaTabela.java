/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author ricardo
 */
public class PupulaTabela extends AbstractTableModel{

    private ArrayList linhas;
    private String[] colunas;
    
    public PupulaTabela(ArrayList row, String[] col){
        linhas = new ArrayList();
        colunas = new String[col.length];
        this.linhas=row;
        this.colunas=col;
    }

    public ArrayList getLinhas() {
        return linhas;
    }

    public void setLinhas(ArrayList linhas) {
        this.linhas = linhas;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] colunas) {
        this.colunas = colunas;
    }
    
    @Override
    public int getRowCount() {
        return this.linhas.size();
    }

    @Override
    public int getColumnCount() {
        return this.colunas.length;
    }
    
    @Override
    public String getColumnName(int column){
        return colunas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Object[] linha = (Object[]) getLinhas().get(rowIndex);
        return linha[columnIndex];
    }
    
}
