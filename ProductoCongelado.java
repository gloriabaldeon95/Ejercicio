/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prog02;
import java.time.Clock;
import java.util.Date;


/**
 *
 * @author USUARIO1
 */
public class ProductoCongelado extends Producto{
    private double TempMantenimiento;

    public ProductoCongelado() {
    }

    public ProductoCongelado(double TempMantenimiento) {
        this.TempMantenimiento = TempMantenimiento;
    }

    public ProductoCongelado(String fechaenvasado, String fechacaducidad, int numerolote, String paisdeorigen) {
        super(fechaenvasado, fechacaducidad, numerolote, paisdeorigen);
    }

    public double getTempMantenimiento() {
        return TempMantenimiento;
    }

    public void setTempMantenimiento(double TempMantenimiento) {
        this.TempMantenimiento = TempMantenimiento;
    }

    //public void imprimirDatos(){
        //imprimirInfo();
        //System.out.println("Temperatura Mantenimiento: " + getTempMantenimiento() + "\n");
    public void CongeladosAire(){
        System.out.print("Composicion de aire ");
        System.out.print(" % Nitrogeno \n"+" 78% \n"+"Oxigeno \n"+"21%"+"Dioxido de Carbono \n"+"1% \n");
    }

    public void CongeladosAgua(){
        System.out.println("Informacion de salinidad \n"+"  (30-40) Gramos por Litro de Agua\n");
        
    }
     public void CongeladosNitrogeno(){
         System.out.println("*****Nitrogeno / Metodo de Congelacion  \n");
         System.out.println("Metodo de Evaporacion 480 SEG\n"+"Metodo de compresion 600 SEG \n");
         }
     public void separador(){
         System.out.println("_________________________________________");
     }
}

    


    

    

    

