/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.ClientePbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author rafae
 */
public class ClienteController extends AbstractTableModel {
 
    private List lista;
    
    public void setList(List lista){
    this.lista = lista;
    }
    
    public ClientePbt getBean(int row){
    return (ClientePbt) lista.get(row);
    
    }
    
    @Override
    public int getRowCount() {
       return lista.size();
       
    }

    @Override
    public int getColumnCount() {
        return 15;
        
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
       ClientePbt cliente = (ClientePbt) lista.get(rowIndex);
        
        if (columnIndex == 0){
    return cliente.getIdClientePbt();
    }
        if (columnIndex == 1){
    return cliente.getNomePbt();
    }
        if (columnIndex == 2){
    return  cliente.getEmailPbt();
    }
        if (columnIndex == 3){
    return  cliente.getCpfPbt();
    }
        if (columnIndex == 4){
    return cliente.getCepPbt();
    }
        if (columnIndex == 5){
    return cliente.getTelefonePbt();
    }
        if (columnIndex == 6){
    return cliente.getRgPbt();
    }
        if (columnIndex == 7){
    return cliente.getDadospagamentoPbt();
    }
        if (columnIndex == 8){
    return cliente.getDatanascimentoPbt();
    }
         if (columnIndex == 9){
    return cliente.getSexoPbt();
    }
          if (columnIndex == 10){
    return cliente .getCidadePbt();
    }
          if (columnIndex == 11){
    return cliente.getBarroPbt();
    }
          if (columnIndex == 12){
    return cliente.getCelularPbt();
    }
          if (columnIndex == 13){
    return cliente.getPaisPbt();
    }
          if (columnIndex == 14){
    return cliente.getApelidoPbt();
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
    return "Apelido";
    }
    if (column == 3){
    return "CPF";
    }
    if (column == 4){
    return "Senha";
    }
    return "";
    
    }
}
