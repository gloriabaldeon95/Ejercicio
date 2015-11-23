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
public class Herencia {
    
    public static void main(String[]args){
       ProductoCongelado m = new ProductoCongelado("12/05/2014","12/04/2015",45,"Ecuador");
       System.out.print("Producto Congelado \n "+"Fecha de Envasado \n"+m.getFechaenvasado()+
                "\n Fecha de Caducidad \n"+m.getFechacaducidad()+"\n Numero de Lote \n"
                +m.getNumerolote()+"\n Pais de Origen \n"+m.getPaisdeorigen()+"\n");
        ProductoCongelado c=new ProductoCongelado(4);
        System.out.print("Temperatura de mantenimiento "+c.getTempMantenimiento()+"Â°C\n");
      
       
       c.separador();
       
       ProductoFresco e =new  ProductoFresco("6/05/2015","12/12/2015",3,"Venezuela");
       c.separador();
       System.out.print("Producto Fresco \n "+"Fecha de Envasado \n"+e.getFechaenvasado()+
               "\n Fecha de Caducidad \n"+e.getFechacaducidad()+"\n Numero de Lote \n"
               +e.getNumerolote()+"\n Pais de Origen \n"+e.getPaisdeorigen()+"\n");
       
        
        c.separador();
      
       ProductoRefrigerado i = new ProductoRefrigerado(85,10,"10/02/2014","10/02/2015",13,"Colombia");
       c.separador();
        System.out.print("Producto Refrigerado \n Codigo Supervision Alimentaria \n "+i.getCodigoSupervisionAlimentaria()+
                "\nTemperatura de Mantenimiento Recomendada\n"+i.getTempMantenimientoRecomendada()+"Â°C \n"+"\n Fecha de Envasado \n"
                +i.getFechaenvasado()+
               "\n Fecha de Caducidad \n"+i.getFechacaducidad()+"\n Numero de Lote \n"
               +i.getNumerolote()+"\n Pais de Origen \n"+i.getPaisdeorigen()+"\n");
       
       c.separador();
    }

}
