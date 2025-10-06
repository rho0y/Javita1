import javax.swing.*;

public class Proveedor {
    /**Declaracion de atributos*/
    String RUC;
    String razonSocial;
    String direccion;

    public Proveedor() {
    }

    public Proveedor(String razonSocial, String RUC) {
        this.razonSocial = razonSocial;
        this.RUC = RUC;
    }

    public Proveedor(String RUC, String razonSocial, String direccion) {
        this.RUC = RUC;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
    }

    /**Metods propios de JAVA*/
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

    /**Metodos del programador*/
    public String detalleProveedor(String ruc, String rs, String dir){
        String detcon;
        detcon= "El RUC del proveedor es: " +ruc + "\n"+
                "Razon Social: " +rs + "\n"+
                "Direccion: " +dir ;
        return detcon;
    }
    public String imprimirDatos(String RUC){
        String pass1;
        JOptionPane.showMessageDialog(null,"El RUC es\n"+RUC);
        pass1=RUC+"SRI";

        return pass1;
    }

}
