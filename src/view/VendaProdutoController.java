/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaProdutoPbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u10154925179
 */
public class VendaProdutoController extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public VendaProdutoPbt getBean(int row){
    return (VendaProdutoPbt) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 3;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        VendaProdutoPbt vendaprodutoPbt = (VendaProdutoPbt) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return vendaprodutoPbt.getIdvendaProdutoPbt();
    }
        if (columnIndex == 1){
    return vendaprodutoPbt.getVendaPbt();
    }
        if (columnIndex == 2){
    return  vendaprodutoPbt.getIdvendaProdutoPbt();
    }
       if (columnIndex == 3){
    return  vendaprodutoPbt.getValorunitarioPbt();
    }  
        if (columnIndex == 4){
    return  vendaprodutoPbt.getQuantidadePbt();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "ID";
    }
    if (column == 2){
    return "ID";
    }
    if (column == 3){
    return "Valor";
    }
     if (column == 4){
    return "Valor";
    }
    return "";
    
    } 
    
}

 
 
    

