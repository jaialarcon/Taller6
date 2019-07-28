/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Patrones;

/**
 *
 * @author jaime
 */
public interface Cuenta {
    double Balance();
    boolean Retirar(int monto);
    boolean Depositar(int n,double denominacion);
    
    
}
