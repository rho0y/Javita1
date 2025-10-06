import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.module.InvalidModuleDescriptorException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        //Creacion de objetos
        Automovil auto1=new Automovil();  //Constructor:Separa memoria para el objeto creado, //Destructor: Elimina la memoria que no se usa
        Automovil auto2=new Automovil("BMV", "i320","",3.2 );
        Scanner sc= new Scanner(System.in);
        //Asignar valores a los atributos
        /*auto1.marca= "BMW";
        auto1.modelo= "i320";
        auto1.color= "Negro";
        auto1.cilindraje= 4.2;
        auto1.inyeccion= 2.1;*/
        System.out.println("Ingrese la marca del auto: ");
        auto1.marca= sc.nextLine();
        String cc;
        cc=auto1.detalle(auto1.marca);
        JOptionPane.showMessageDialog(null, "Nueva Marca\n "+cc);

        /*System.out.println("Ingrese la marca del auto : ");
        auto1.marca=sc.nextLine();
        auto2.detalle();*/


        /*BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ingrese el nombre de la marca: ");
        auto1.marca= br.readLine();
        System.out.println("El nombre del modelo es :" + auto1.modelo);
        System.out.println("");

        auto1.marca= JOptionPane.showInputDialog("Ingrese el nombre de la marca:");
        JOptionPane.showMessageDialog(null,"El modelo del vehiculo es:" +auto1.modelo);*/


        //Uso de metodos


        //Desplegar el valor de los objetos
        /*System.out.println("Info del Main:");
        System.out.println("auto1.marca:" +auto1.marca);
        System.out.println("auto1.marca:"  +auto1.modelo);
        System.out.println("auto1.marca:" +auto1.color);
        System.out.println("auto1.marca:" +auto1.cilindraje);*/

        //Creacion de objeto
        /*Automovil formula1=new Automovil();

        // Asignar valores a atributos

        formula1.marca= "Mercedes";
        formula1.modelo= "J26";
        formula1.color= "Blanco";
        formula1.cilindraje= 4.1;*/
    }
}
