/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package socopan.util;

/**
 *
 * @author Mili
 */
public class SocopanException extends Exception{
    
    private String poruka;

    public SocopanException(String poruka) {
        super(poruka);
        this.poruka = poruka;
    }

    public String getPoruka() {
        return poruka;
    }
    
}
