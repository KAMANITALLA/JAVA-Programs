/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sessionN;

/**
 *
 * @author GENERAL STORES
 */
public class DeplacementImpossibleException extends Exception {
    private String message;
    
    public DeplacementImpossibleException(String message) {
        super(message);
        this.message=message;
    }
    
    public String getMessage(){
        return this.message;
    }
    
}
