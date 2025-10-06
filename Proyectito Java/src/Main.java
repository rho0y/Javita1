import javax.swing.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args){
        /**Declaracion de objetos*/
        Proveedor vendor1= new Proveedor();
        Scanner sc= new Scanner(System.in);

        /**Lectura de datos*/
        String dp, ruc, rs, dir;
        System.out.println("Proveedor RUC: ");
        ruc= sc.nextLine();
        System.out.println("Proveedor de Razon social: ");
        rs= sc.nextLine();
        System.out.println("Proveedor Direccion: ");
        dir= sc.nextLine();
        String ll;
        ll=vendor1.imprimirDatos(vendor1.RUC);
        //JOptionPane.showMessageDialog(null,"Proveedor de RUC\n"+ruc);

        dp= vendor1.detalleProveedor(ruc,rs,dir);

        //System.out.println("Los datos del proveedor: "+dp);



    }
}