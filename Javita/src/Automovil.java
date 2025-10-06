import javax.swing.*;

public class Automovil {
    /**Declaracion de las propiedades*/
    String marca;
    String modelo;
    String color = "Blanco";
    double cilindraje;
    double inyeccion;
/**Declaracion de lso constructores y destructores*/
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
    /**Uso combinado de scan y showMessage*/
    public String detalle(String marca){
        String c;
       /* String modelo="AUDI";
        System.out.println("marca:" +this.marca);
        System.out.println("modelo:"  +this.modelo);
        System.out.println("color:" +this.color);
        System.out.println("cilindraje:" +this.cilindraje);
        JOptionPane.showMessageDialog(null,"Marca: "+this.marca);*/
        /*JOptionPane.showMessageDialog(null, "Marca\n" +marca);
        JOptionPane.showMessageDialog(null, "Modelo\n" +modelo);
        JOptionPane.showMessageDialog(null, "Color\n" +color);
        JOptionPane.showMessageDialog(null, "Cilindraje\n" +cilindraje);*/
        JOptionPane.showMessageDialog(null, "Marca\n " +marca);
        c=marca +"Evolution";
        return c;
    }
}

