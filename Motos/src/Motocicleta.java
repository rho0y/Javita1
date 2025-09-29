public class Motocicleta {
    String marca;
    String motor;
    String color;
    double inyeccion;
    //System.out.println("Info del metodo")
    public void detalle(){
        System.out.println("moto1.marca:" +marca);
        System.out.println("moto1.color:" +color);
        System.out.println("moto1.motor:" +motor);
        System.out.println("moto1.inyeccion:" +inyeccion);
        System.out.println();
    }
    public void detalles1(){
        System.out.println("moto2.marca:" +this.marca);
        System.out.println("moto2.color:" +this.color);
        System.out.println("moto2.motor:" +this.motor);
        System.out.println("moto2.inyeccion:" +this.inyeccion);
        System.out.println();
    }
}
