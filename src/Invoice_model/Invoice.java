/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Invoice_model;

import java.util.ArrayList;

/**
 *
 * @author lenovo
 */
public class Invoice {
    private int _num ;
    private String _date;
    private String _customer ; 
    private ArrayList<Line>lines;

    public Invoice() {
    }

    public Invoice(int _num, String _date, String _customer) {
        this._num = _num;
        this._date = _date;
        this._customer = _customer;
    }

    public ArrayList<Line> getLines() {
        if(lines == null ) lines = new ArrayList<>();
        return lines;
    }

    public void setLines(ArrayList<Line> lines) {
        this.lines = lines;
    }

    public String getCustomer() {
        return _customer;
    }

    public void setCustomer(String _customer) {
        this._customer = _customer;
    }

    public int getNum() {
        return _num;
    }

    public void setNum(int _num) {
        this._num = _num;
    }

    public String getDate() {
        return _date;
    }
    
    public void setDate(String _date) {
        this._date = _date;
    }

    @Override
    public String toString() {
        return "Invoice{" + "_num=" + _num + ", _date=" + _date + ", _customer=" + _customer + ", lines=" + lines + '}';
    }
    
     public double getInvoiceTotal() {
        double total = 0.0;
        for (Line line : getLines()) {
            total += line.getLineTotal();
        }
        return total;}
}
