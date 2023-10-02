/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofinal;
import proyectofinal.accesoADatos.ComidaData;
import proyectofinal.entidades.Comida;

public class ProyectoFinal {

    
    public static void main(String[] args) {
        ComidaData asd=new ComidaData();
//        Comida comida=new Comida("guiso","un espectacular guisazo de lentejas en plena primavera",560);
//        
//        asd.insertarComida(comida);
//        System.out.println("nueva comida agregada correctamente a la base de datos");
//        Comida comida1=new Comida("Pizza","Pizza Napolitana",600);
//        asd.insertarComida(comida1);
//        System.out.println("Nueva comida ingresada correctamente");
        asd.eliminarComida(3);
        System.out.println("La comida ha sido eliminada correctamente");
        
        
    }
    
}
