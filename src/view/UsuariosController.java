/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bean.UsuarioPbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Marcos
     */
public class UsuariosController extends AbstractTableModel {

    private List lista;

    public void setList(List lista) {
        this.lista = lista;
        this.fireTableDataChanged();
    }
   
    public UsuarioPbt getBean(int row) {
        return (UsuarioPbt) lista.get(row);
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
    public Object getValueAt(int row, int column) {
        UsuarioPbt usuarios = (UsuarioPbt) lista.get(row);
        if (column == 0) {
           return usuarios.getIdusuarioPbt();
        } 
        if (column == 1) {
           return usuarios.getNomePbt();
        } 
        if (column == 2) {
           return usuarios.getNicknamePbt();
        } 
        if (column == 3) {
           return usuarios.getCpfPbt();
        } 
        return null;
    }

    @Override
    public String getColumnName(int column) {
        if (column == 0) {
            return "Id";
        }
        if (column == 1) {
            return "Nome";
        }
        if (column == 2) {
            return "Apelido";
        }
        if (column == 3) {
            return "Cpf";
        }
        return "";
    }
}
