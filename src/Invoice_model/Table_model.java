/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice_model;

import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author lenovo
 */
public class Table_model  extends AbstractTableModel {
    private ArrayList<Invoice> invoices;
    private String[] columns = {"Number.", "Date", "Customer", "Total invoice count "};
    
    public Table_model(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }
    
    @Override
    public int getRowCount() {
        return invoices.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int column) {
        return columns[column];
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Invoice invoice = invoices.get(rowIndex);
        
        switch (columnIndex) {
            case 0: return invoice.getNum();
            case 1: return invoice.getDate();
            case 2: return invoice.getCustomer();
            case 3: return invoice.getInvoiceTotal();
            default : return "";
        }
    }

    public void setModel(Table_model table_model) {
    }
}
