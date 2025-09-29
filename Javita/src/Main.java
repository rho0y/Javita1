//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Creacion de objetos
        Automovil auto1=new Automovil();  //Constructor:Separa memoria para el objeto creado, //Destructor: Elimina la memoria que no se usa
        Automovil auto2=new Automovil("BMV", "i320","",3.2 );
        //Asignar valores a los atributos
        auto1.marca= "BMW";
        auto1.modelo= "i320";
        auto1.color= "Negro";
        auto1.cilindraje= 3.2;

        //Uso de metodos
        auto2.detalle();

        //Desplegar el valor de los objetos
        System.out.println("Info del Main:");
        System.out.println("auto1.marca:" +auto1.marca);
        System.out.println("auto1.marca:"  +auto1.modelo);
        System.out.println("auto1.marca:" +auto1.color);
        System.out.println("auto1.marca:" +auto1.cilindraje);

        //Creacion de objeto
        Automovil formula1=new Automovil();

        // Asignar valores a atributos

        formula1.marca= "Mercedes";
        formula1.modelo= "J26";
        formula1.color= "Blanco";
        formula1.cilindraje= 4.1;
    }
}

