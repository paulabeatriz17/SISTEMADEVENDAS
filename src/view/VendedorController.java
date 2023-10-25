package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import bean.VendedorPbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class VendedorController extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
     this.lista = lista;
     this.fireTableDataChanged();
    }

    public VendedorPbt getBean (int row){
    return (VendedorPbt) lista.get(row);
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
        VendedorPbt vendedor =(VendedorPbt) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return vendedor.getIdvendedorPbt();
        }
        if (columnIndex == 1 ) {
            return vendedor.getNomePbt();
        }
        if (columnIndex == 2 ) {
            return vendedor.getEmailPbt();
        }
        if (columnIndex == 3 ) {
            return vendedor.getTelefonePbt();
        }
        if (columnIndex == 4 ) {
            return vendedor.getVendedorPbtcol();  
        }

 
       
         return "";
    }
    @Override
    public String getColumnName(int column){
        if (column == 0 ) {
            return "id";
        }
        if (column == 1 ) {
            return "nome";
        }
        if (column == 2 ) {
            return "email";
        }
        if (column == 3 ) {
            return "telefone";
        }
        if (column == 4 ) {
            return "cpf";
        }
    
        return "";
        }
        
    }

