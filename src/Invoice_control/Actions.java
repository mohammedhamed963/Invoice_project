/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice_control;

import Invoice_model.Invoice;
import Invoice_model.Line;
import Invoice_model.Table_model;
import Invoice_model.Rows_table_model;
import Invoice_view.Invoice_Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import javax.swing.JFileChooser;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 *
 * @author lenovo
 */
public class Actions implements ActionListener , ListSelectionListener  {
    private Invoice_Frame frame ; 
public Actions (Invoice_Frame frame){this.frame = frame ; }
    @Override
    public void actionPerformed(ActionEvent e) {
            String pressed_button = e.getActionCommand() ;
        System.out.println("Actions : "+  pressed_button );
        switch (pressed_button){
        case"Create invoice": create_invoice_method(); break ;
        case"New item"  : new_item_method(); break;
        case"Delete invoice":delete_invoce_method(); break ;
        case"Delete item":delete_item_method(); break ;
        case"Load":Load_method(); break ;
        case"Save": Save_method(); break ;
        case "createInvoiceCancel":
                /*createInvoiceCancel();
                break;
            case "createInvoiceOK":
                createInvoiceOK();
                break;
            case "createLineOK":
                createLineOK();
                break;
            case "createLineCancel":
                createLineCancel();
                break;*/

        }
    }
  @Override
    public void valueChanged(ListSelectionEvent e) {
           int selectedIndex = frame.getInvoiceTable().getSelectedRow();
        if (selectedIndex != -1) {
            System.out.println("You have selected row: " + selectedIndex);
            Invoice currentInvoice = frame.getInvoices().get(selectedIndex);
            frame.getInvoice_number().setText("" + currentInvoice.getNum());
            frame.getInvoice_date().setText(currentInvoice.getDate());
            frame.getCustomerNameLabel().setText(currentInvoice.getCustomer());
            frame.getInvoiceTotalLabel().setText("" + currentInvoice.getInvoiceTotal());
            Rows_table_model rows_table_model = new Rows_table_model(currentInvoice.getLines());
            frame.getLineTable().setModel(rows_table_model);
            rows_table_model.fireTableDataChanged();
        }
    }
    private void create_invoice_method() {
        
    }

    private void new_item_method() {}
    

    private void delete_invoce_method() {
       int selectedRow = frame.getInvoice_table().getSelectedRow();
        if (selectedRow != -1) {
            frame.getInvoices().remove(selectedRow);
            frame.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void delete_item_method() {
        int selectedRow = frame.getLineTable().getSelectedRow();

        if (selectedRow != -1) {
            Rows_table_model rows_table_model = (Rows_table_model) frame.getLineTable().getModel();
              rows_table_model.getLines().remove(selectedRow);
                  rows_table_model.fireTableDataChanged();
            frame.getInvoicesTableModel().fireTableDataChanged();
        }
    }

    private void Load_method() {
        JFileChooser fc = new JFileChooser();
        try {
       int result =  fc.showOpenDialog(frame);
       if (result == JFileChooser.APPROVE_OPTION){
           File headerFile = fc.getSelectedFile();
           Path headerPath = Paths.get(headerFile.getAbsolutePath());
           ArrayList <String> headerLines ;
           headerLines = (ArrayList<String>) Files.readAllLines(headerPath);
           /**/
            ArrayList<Invoice> invoicesArray = new ArrayList<>();
                for (String headerLine : headerLines) {
                    String[] headerParts = headerLine.split(",");
                    int invoiceNum = Integer.parseInt(headerParts[0]);
                    String invoiceDate = headerParts[1];
                    String customerName = headerParts[2];

                    Invoice invoice = new Invoice(invoiceNum, invoiceDate, customerName);
                    invoicesArray.add(invoice);
                }
                System.out.println("Check point");
                result = fc.showOpenDialog(frame); 
                /*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/
              
                if (result == JFileChooser.APPROVE_OPTION) {
                    File lineFile = fc.getSelectedFile();
                    Path linePath = Paths.get(lineFile.getAbsolutePath());
                    ArrayList<String> lineLines = (ArrayList<String>) Files.readAllLines(linePath);
                    System.out.println("Lines have been read");
                     for (String lineLine : lineLines) {
                        String lineParts[] = lineLine.split(",");
                        int invoiceNum = Integer.parseInt(lineParts[0]);
                        String itemName = lineParts[1];
                        double itemPrice = Double.parseDouble(lineParts[2]);
                        int count = Integer.parseInt(lineParts[3]);
                        Invoice inv = null;
                        for (Invoice invoice : invoicesArray) {
                            if (invoice.getNum() == invoiceNum) {
                                inv = invoice;
                                break;
                            }
                        }

                        Line line = new Line(itemName, itemPrice, count, inv);
                        inv.getLines().add(line);
                    }
    /*xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx*/

                    System.out.println("Check point");
                }
                frame.setInvoices(invoicesArray);
                Table_model table_model = new Table_model(invoicesArray);
                frame.setTable_model(table_model);
              //  farme.getTable_model().set
                frame.getTable_model().setModel(table_model);/*  فيه غلطة كبيرة هنا*/
                frame.getTable_model().fireTableDataChanged();
       }}
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }
  

    private void Save_method() {
    }
/*
     private void createInvoiceCancel() {
         Invoice_
        invoiceDialog.setVisible(false);
        invoiceDialog.dispose();
        invoiceDialog = null;
    }

    private void createInvoiceOK() {
        String date = invoiceDialog.getInvDateField().getText();
        String customer = invoiceDialog.getCustNameField().getText();
        int num = frame.getNextInvoiceNum();

        Invoice invoice = new Invoice(num, date, customer);
        frame.getInvoices().add(invoice);
        frame.getInvoicesTableModel().fireTableDataChanged();
        invoiceDialog.setVisible(false);
        invoiceDialog.dispose();
        invoiceDialog = null;
    }

    private void createLineOK() {
        String item = lineDialog.getItemNameField().getText();
        String countStr = lineDialog.getItemCountField().getText();
        String priceStr = lineDialog.getItemPriceField().getText();
        int count = Integer.parseInt(countStr);
        double price = Double.parseDouble(priceStr);
        int selectedInvoice = frame.getInvoiceTable().getSelectedRow();
        if (selectedInvoice != -1) {
            Invoice invoice = frame.getInvoices().get(selectedInvoice);
            Line line = new Line(item, price, count, invoice);
            invoice.getLines().add(line);
            LinesTableModel linesTableModel = (LinesTableModel) frame.getLineTable().getModel();
            //linesTableModel.getLines().add(line);
            linesTableModel.fireTableDataChanged();
            frame.getInvoicesTableModel().fireTableDataChanged();
        }
        lineDialog.setVisible(false);
        lineDialog.dispose();
        lineDialog = null;
    }

    private void createLineCancel() {
        lineDialog.setVisible(false);
        lineDialog.dispose();
        invoice_Line = null;
    }
*/
}


  
    
