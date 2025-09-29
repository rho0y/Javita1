public class Automovil {
    String marca;
    String modelo;
    String color = "Blanco";
    double cilindraje;

    public Automovil() {
    }

    public Automovil(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public Automovil(String marca, String modelo, String color, double cilindraje) {
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.cilindraje = cilindraje;
    }

    //System.out.println("Info del metodo")
    public void detalle(){
        String modelo="AUDI";
        System.out.println("marca:" +this.marca);
        System.out.println("modelo:"  +this.modelo);
        System.out.println("color:" +this.color);
        System.out.println("cilindraje:" +this.cilindraje);
    }
}

