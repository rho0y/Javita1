//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion objetos
        Motocicleta moto1=new Motocicleta();

        // Asignar valores a atributos
        moto1.marca= "Kawasaki";
        moto1.color= "Verde";
        moto1.motor= "J500";
        moto1.inyeccion= 150;

        System.out.println("moto1.marca:" +moto1.marca);
        System.out.println("moto1.color:" +moto1.color);
        System.out.println("moto1.motor:" +moto1.motor);
        System.out.println("moto1.inyeccion:" +moto1.inyeccion);
        System.out.println();

        //Creacion objetos

        Motocicleta moto2=new Motocicleta();
        // Asignar valores a atributos
        moto2.marca= "KTM";
        moto2.color= "Negro";
        moto2.motor= "V200";
        moto2.inyeccion= 100;

        System.out.println("moto2.marca:" +moto2.marca);
        System.out.println("moto2.color:" +moto2.color);
        System.out.println("moto2.motor:" +moto2.motor);
        System.out.println("moto2.inyeccion:" +moto2.inyeccion);
        System.out.println();

        //Creacion objetos

        Motocicleta moto3=new Motocicleta();

        moto3.marca= "Royal Enfield";
        moto3.color= "Azuk";
        moto3.motor= "P580";
        moto3.inyeccion= 200;

        System.out.println("moto3.marca:" +moto3.marca);
        System.out.println("moto3.color:" +moto3.color);
        System.out.println("moto3.motor:" +moto3.motor);
        System.out.println("moto3.inyeccion:" +moto3.inyeccion);



    }
}