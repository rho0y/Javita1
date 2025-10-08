import javax.swing.*;

public class Proveedor {
    /**Declaracion de atributos*/
    private String RUC;
    private String razonSocial;
    private String direccion;
    private String Phono;
    private float pesoProductos;

    public Proveedor() {

    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPhono() {
        return Phono;
    }

    public void setPhono(String phono) {
        Phono = phono;
    }

    public float getPesoProductos() {
        return pesoProductos;
    }

    public void setPesoProductos(float pesoProductos) {
        this.pesoProductos = pesoProductos;
    }

    /**Creacion de Metodos de JAVA*/


    public void detalle(){
        JOptionPane.showMessageDialog(null, "El proovedor del RUC es: " +this.RUC);
    }
    public void detalle2(){
        System.out.println();
        System.out.println("RUC Proveedor : " +this.RUC);
        System.out.println();
        System.out.println("RUC Proveedor: " +this.getRUC());
    }

    /*public String imprimirDatos(String RUC){
        String pass1;
        JOptionPane.showMessageDialog(null,"El RUC es\n"+RUC);
        pass1=RUC+"SRI";

        return pass1;
    }*/


}
