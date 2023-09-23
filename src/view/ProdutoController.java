/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ProdutoPbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ProdutoController extends AbstractTableModel {
     private List lista;
     
    public void setList(List lista){
    this.lista = lista;
     this.fireTableDataChanged();
    }
    
    public ProdutoPbt getBean(int row){
    return (ProdutoPbt) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 5;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        ProdutoPbt produto = (ProdutoPbt) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return produto.getIdprodutoPbt();
    }
        if (columnIndex == 1){
    return produto.getNomePbt();
    }
        if (columnIndex == 2){
    return produto.getDescricaoPbt();
    }
        if (columnIndex == 3){
    return produto.getValorPbt();
    }
         if (columnIndex == 4){
    return produto .getCategoriaPbt();
    }
        return "";
    
    
    }
    @Override
    public String getColumnName(int column){
    if (column == 0){
       return "ID";
    }
    if (column == 1){
      return "Nome";
    }
    if (column == 2){
       return "Descricao";
    }
    if (column == 3){
       return "Valor";
    }
   
    return "Categoria";
    
    } 
    
}
