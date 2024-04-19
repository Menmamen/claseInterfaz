package supermercado;

import java.time.LocalDate;

public class Cereales implements EsAlimento{
    private String marca;
    private double precio;
    private String tipoCereal;
    private LocalDate fechaCaducidad;
    private int calorias = 15;

    public Cereales(String marca, double precio, String tipoCereal) {
        this.marca = marca;
        this.precio = precio;
        this.tipoCereal = tipoCereal;
        if(tipoCereal == "espelta"){
            calorias = 5;
        } else if (tipoCereal == "maiz") {
            calorias = 8;
        } else if (tipoCereal == "trigo") {
            calorias = 12;
        }
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public String getTipoCereal() {
        return tipoCereal;
    }
    public void setTipoCereal(String tipoCereal) {
        this.tipoCereal = tipoCereal;
    }

    //EsAlimento
    public LocalDate getCaducidad() {
        return fechaCaducidad;
    }
    public void setCaducidad(LocalDate fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }
    public int getCalorias() {
        return calorias;
    }

    @Override
    public String toString() {
        return "Cereales{" +
                "marca='" + marca + '\'' +
                ", precio=" + precio +
                ", tipoCereal='" + tipoCereal + '\'' +
                ", fechaCaducidad=" + fechaCaducidad +
                ", calorias=" + calorias +
                '}';
    }
}
