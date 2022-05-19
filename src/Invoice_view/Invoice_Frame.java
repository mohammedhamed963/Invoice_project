/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice_view;

import Invoice_control.Actions;
import Invoice_model.Invoice;
import Invoice_model.Table_model;
import java.util.ArrayList;
import javax.swing.JLabel;
import javax.swing.JTable;

/**
 *
 * @author lenovo
 */
public class Invoice_Frame extends javax.swing.JFrame {

    /**
     * Creates new form Invoice_Frame
     */
    public Invoice_Frame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        invoice_table = new javax.swing.JTable();
        invoice_table.getSelectionModel().addListSelectionListener(actions);
        invoice_number = new javax.swing.JLabel();
        customer_name = new javax.swing.JLabel();
        invoice_date = new javax.swing.JLabel();
        total = new javax.swing.JLabel();
        create_invoice = new javax.swing.JButton();
        create_invoice.addActionListener(actions);
        delete_invoice = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        total_cal = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        line_table = new javax.swing.JTable();
        new_item = new javax.swing.JButton();
        delete_item = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        load = new javax.swing.JMenuItem();
        load.addActionListener(actions);
        save = new javax.swing.JMenuItem();
        save.addActionListener(actions);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        invoice_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(invoice_table);

        invoice_number.setText("Invoice number");

        customer_name.setText("Customer name");

        invoice_date.setText("Invoice date");

        total.setText("Total");

        create_invoice.setText("Create invoice");
        create_invoice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                create_invoiceActionPerformed(evt);
            }
        });

        delete_invoice.setText("Delete invoice");
        delete_invoice.addActionListener(actions);

        jLabel1.setText("enter number");

        jLabel2.setText("enter name");

        jLabel3.setText("enter date");

        total_cal.setText("cal total");

        line_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(line_table);

        new_item.setText("New item");
        new_item.addActionListener(actions);

        delete_item.setText("Delete item");
        delete_item.addActionListener(actions);

        jMenu1.setText("File");

        load.setText("Load");
        jMenu1.add(load);

        save.setText("Save");
        jMenu1.add(save);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(create_invoice)
                        .addGap(124, 124, 124)
                        .addComponent(delete_invoice)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(customer_name)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoice_number)
                                .addGap(56, 56, 56)
                                .addComponent(jLabel1)))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(total)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(total_cal))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(invoice_date)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(new_item)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(delete_item)
                        .addGap(57, 57, 57))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(create_invoice)
                            .addComponent(delete_invoice)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(invoice_number)
                            .addComponent(jLabel1)
                            .addComponent(invoice_date)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(customer_name)
                                .addComponent(jLabel2)
                                .addComponent(total))
                            .addComponent(total_cal))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(new_item)
                    .addComponent(delete_item))
                .addContainerGap(179, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void create_invoiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_create_invoiceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_create_invoiceActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Invoice_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Invoice_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton create_invoice;
    private javax.swing.JLabel customer_name;
    private javax.swing.JButton delete_invoice;
    private javax.swing.JButton delete_item;
    private javax.swing.JLabel invoice_date;
    private javax.swing.JLabel invoice_number;
    private javax.swing.JTable invoice_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable line_table;
    private javax.swing.JMenuItem load;
    private javax.swing.JButton new_item;
    private javax.swing.JMenuItem save;
    private javax.swing.JLabel total;
    private javax.swing.JLabel total_cal;
    // End of variables declaration//GEN-END:variables
private ArrayList<Invoice> invoices ;
private  Actions actions = new Actions (this) ;
   private Table_model table_model;
    public ArrayList<Invoice> getInvoices() {
        return invoices;
    }

    public void setInvoices(ArrayList<Invoice> invoices) {
        this.invoices = invoices;
    }

    public Table_model getTable_model() {
        return table_model;
    }

    public void setTable_model(Table_model table_model) {
        this.table_model = table_model;
    }

    public JLabel getCustomer_name() {
        return customer_name;
    }

    public void setCustomer_name(JLabel customer_name) {
        this.customer_name = customer_name;
    }

    public JLabel getInvoice_date() {
        return invoice_date;
    }

    public void setInvoice_date(JLabel invoice_date) {
        this.invoice_date = invoice_date;
    }

    public JLabel getInvoice_number() {
        return invoice_number;
    }

    public void setInvoice_number(JLabel invoice_number) {
        this.invoice_number = invoice_number;
    }

    public JTable getInvoice_table() {
        return invoice_table;
    }

    public void setInvoice_table(JTable invoice_table) {
        this.invoice_table = invoice_table;
    }

    public JTable getLine_table() {
        return line_table;
    }

    public void setLine_table(JTable line_table) {
        this.line_table = line_table;
    }

    public JLabel getTotal() {
        return total;
    }

    public void setTotal(JLabel total) {
        this.total = total;
    }

    public Actions getActions() {
        return actions;
    }

    public void setActions(Actions actions) {
        this.actions = actions;
    }


   

    public Table_model getInvoicesTableModel() {
        if (table_model == null) {
            table_model = new Table_model(getInvoices());
        }
        return table_model;
    }

    public void setInvoicesTableModel(Table_model invoicesTableModel) {
        this.table_model = table_model;
    }

    public JLabel getCustomerNameLabel() {
        return customer_name ;
    }

    public JLabel getInvoiceDateLabel() {
        return invoice_date ;
    }

    public JLabel getInvoiceNumLabel() {
        return invoice_number ;
    }

    public JTable getInvoiceTable() {
        return invoice_table ;
    }

    public JLabel getInvoiceTotalLabel() {
        return total_cal;
    }

    public JTable getLineTable() {
        return line_table;
    }

    public Actions getController() {
        return actions ;
    }
    
    public int getNextInvoiceNum() {
        int num = 0;
        
        for (Invoice invoice : getInvoices()) {
            if (invoice.getNum() > num) 
                num = invoice.getNum();
        }
        
        return ++num;
    }
    
}
