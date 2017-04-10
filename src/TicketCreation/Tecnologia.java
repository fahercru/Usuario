/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketCreation;

/**
 *
 * @author Fabian Hernandez
 */
public enum Tecnologia {
    
    blanco(""),Impresoras("Impresoras"), Computador("Computador"), Telefono("Telefono"), Fax("Fax");

    private String name;

    Tecnologia(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }
    
}
