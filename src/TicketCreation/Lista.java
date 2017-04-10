/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketCreation;


public class Lista {
    
   
    private String usuario;
    private String descripccion;
    private String tecAfect;
    private String test4;

    public Lista(){
        
    }

    public Lista(String usuario, String descripccion, String tecAfect, String test4) {
        this.usuario = usuario;
        this.descripccion = descripccion;
        this.tecAfect = tecAfect;
        this.test4 = test4;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getDescripccion() {
        return descripccion;
    }

    public void setDescripccion(String descripccion) {
        this.descripccion = descripccion;
    }

    public String getTecAfect() {
        return tecAfect;
    }

    public void setTecAfect(String tecAfect) {
        this.tecAfect = tecAfect;
    }

    public String getTest4() {
        return test4;
    }

    public void setTest4(String test4) {
        this.test4 = test4;
    }


    
    
    
    public void print(){
         
        System.out.println(tecAfect);
        System.out.println(usuario);
        System.out.println(descripccion);

    }
}
