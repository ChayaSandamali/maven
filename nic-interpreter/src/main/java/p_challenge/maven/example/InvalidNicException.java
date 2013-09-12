/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package p_challenge.maven.example;


/**
 *
 * @author Chaya
 */
public class InvalidNumberException extends Exception {
    
    public InvalidNumberException() {
		super("Invalid NIC number has entered");
	}
    
}
