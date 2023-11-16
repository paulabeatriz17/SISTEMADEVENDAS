/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.VendaPbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u10154925179
 */
public class VendasController extends AbstractTableModel  {
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public VendaPbt getBean(int row){
    return (VendaPbt) lista.get(row);
    
    }
    
    public int getRowCount() {
       return lista.size();
       
    }

    public int getColumnCount() {
        return 3;
        
    }

    public Object getValueAt(int rowIndex, int columnIndex) {
        VendaPbt vendaPbt = (VendaPbt) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return vendaPbt.getIdvendaPbt();
    }
        if (columnIndex == 1){
    return vendaPbt.getDataPbt();
    }
        if (columnIndex == 2){
    return  vendaPbt.getTotalPbt();
    }
         if (columnIndex == 3){
    return vendaPbt.getFormapagamentoPbt();
    }
        if (columnIndex == 4){
    return vendaPbt.getvendedorPbt();
    }
        return "";
    
    
    }
    public String getColumnName(int column){
    if (column == 0){
    return "ID";
    }
    if (column == 1){
    return "Fornecedor";
    }
    if (column == 2){
    return "Data";
    }
    if (column == 3){
    return "Valor";
    }
    if (column == 4){
    return "ID";
    }
    return "";
    
    } 
    
}
