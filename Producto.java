/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog02;

/**
 *
 * @author USUARIO1
 */
public class Producto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    }
    
    private String fechaenvasado;
    private String fechacaducidad;
    private int numerolote;
    private String paisdeorigen;

    public Producto() {
    }

    public Producto(String fechaenvasado, String fechacaducidad, int numerolote, String paisdeorigen) {
        this.fechaenvasado = fechaenvasado;
        this.fechacaducidad = fechacaducidad;
        this.numerolote = numerolote;
        this.paisdeorigen = paisdeorigen;
    }

    public String getFechaenvasado() {
        return fechaenvasado;
    }

    public void setFechaenvasado(String fechaenvasado) {
        this.fechaenvasado = fechaenvasado;
    }

    public String getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(String fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    public int getNumerolote() {
        return numerolote;
    }

    public void setNumerolote(int numerolote) {
        this.numerolote = numerolote;
    }

    public String getPaisdeorigen() {
        return paisdeorigen;
    }

    public void setPaisdeorigen(String paisdeorigen) {
        this.paisdeorigen = paisdeorigen;
    }

}  


    

