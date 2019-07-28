/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

import java.util.Currency;

/**
 *
 * @author jaime
 */
public class CuentaAdapter implements Cuenta {
    protected Account cuenta;
    protected Currency moneda;
    
    public CuentaAdapter(int id,double monto){
        
        
               
    }

    @Override
    public double Balance() {
       return cuenta.getAmount();
    }

    @Override
    public boolean Retirar(int monto) {
        String c=cuenta.withdraw(monto);
        if (c.contains("w")){
            return true;
        }
        return false;
    }
    

    
    public boolean Depositar(int n, double denominacion) {
        
    }
    
    
}
