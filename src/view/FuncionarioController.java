package view;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import bean.FuncionarioPbt;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author u49558987859
 */
public class FuncionarioController extends AbstractTableModel{
    private List lista;
    public void setList(List lista){
    this.lista = lista;
    }

    public FuncionarioPbt getBean (int row){
    return (FuncionarioPbt) lista.get(row);
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
        FuncionarioPbt funcionarios =(FuncionarioPbt) lista.get(rowIndex);
         if (columnIndex == 0 ) {
            return funcionarios.getIdfuncionarioPbt();
        }
        if (columnIndex == 1 ) {
            return funcionarios.getNome();
        }
        if (columnIndex == 2 ) {
            return funcionarios.getEmail();
        }
        if (columnIndex == 3 ) {
            return funcionarios.getTelefone();
        }
        if (columnIndex == 4 ) {
            return funcionarios.getCpf();  
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

