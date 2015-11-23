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
public class ProductoRefrigerado extends Producto {
    private int CodigoSupervisionAlimentaria;
    private double TempMantenimientoRecomendada;

    public ProductoRefrigerado() {
    }

    //public void imprimirDatos(){
        //imprimirInfo();
        //System.out.println("Codigo de Supervision Alimentaria: " + getCodigoSupervisionAlimentaria());
    //CodigoSupervisionAlimentaria = "Desconocido";
        //TempMantenimientoRecomendada = 0;

    public ProductoRefrigerado(int CodigoSupervisionAlimentaria, double TempMantenimientoRecomendada, String fechaenvasado, String fechacaducidad, int numerolote, String paisdeorigen) {
        super(fechaenvasado, fechacaducidad, numerolote, paisdeorigen);
        this.CodigoSupervisionAlimentaria = CodigoSupervisionAlimentaria;
        this.TempMantenimientoRecomendada = TempMantenimientoRecomendada;
    }

    public int getCodigoSupervisionAlimentaria() {
        return CodigoSupervisionAlimentaria;
    }

    public void setCodigoSupervisionAlimentaria(int CodigoSupervisionAlimentaria) {
        this.CodigoSupervisionAlimentaria = CodigoSupervisionAlimentaria;
    }

    public double getTempMantenimientoRecomendada() {
        return TempMantenimientoRecomendada;
    }

    public void setTempMantenimientoRecomendada(double TempMantenimientoRecomendada) {
        this.TempMantenimientoRecomendada = TempMantenimientoRecomendada;
    }
    
}

 


    

