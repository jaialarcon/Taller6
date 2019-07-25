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
public interface Manejador {
    Manejador getManejador(int n, double denominacion);
    void setNext(Manejador m);
    boolean retirar (int monto);
    boolean depositar(int n, double denominacion);
    
}
