package Patrones;

import java.util.Currency;
import java.util.Locale;

// Asuma que de esta clase solo tiene el .class
public final class Account {
    private int id;
    private Locale locale;
    private double amount;
    private Currency moneda;
     
    public Account(int id, double amount) {
        this.id = id;
        this.locale = Locale.UK;
        this.amount = amount;
        this.moneda = Currency.getInstance(locale);
    }
    public int getId(){
        return id;
    }
    
    public double getAmount() {
        return amount;
    }
     
    public Locale getLocale() {
        return this.locale;
    }
     
    public String status() {
        return moneda.getCurrencyCode() + " " +amount + " in the account";
    }
     
    public String deposit(double deposit) {
        amount += deposit;
        return moneda.getCurrencyCode() + " " +deposit;
    }
     
    public String withdraw(double w) {
        if (w<=amount) {
            amount -= w;
            return moneda.getCurrencyCode() + " " +w;
        } else {
            return "Error:" + moneda.getCurrencyCode() + " " +w+ " withdraw failed!!!";
        }
         
    }
     
}