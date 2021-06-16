/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unam.ciencias.computoconcurrente;

/**
 *
 * @author ferfong
 */
public interface Vault {
    
    void setPassword();
    
    boolean isCorrectPassword(int possiblePassword);
    
    boolean wasPasswordFound();
    
}
