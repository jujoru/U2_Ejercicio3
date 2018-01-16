package es.jujoru.u2_ejercicio3;

/**
 * Created by Nino Ruano on 16/01/2018.
 */

public class Coche {
     String marca;
     String modelo;
     String imagen;
     int precio;

    public Coche(String marca, String modelo, String imagen, int precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.imagen = imagen;
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
