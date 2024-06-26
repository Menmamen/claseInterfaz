package supermercado;

import java.time.LocalDate;

public class Vino implements EsAlimento, EsLiquido, ConDescuento{
    private String marca;
    private String tipoDeVino;
    private double grados;
    private double precio;
    private double descuento = 0.0;
    private double precioDescuento = precio - descuento;
    private int calorias;
    private LocalDate fechaCaducidad;
    private double volumen = 0.0;
    private String tipoEnvase = "";

    public Vino(String marca, String tipoDeVino, double grados, double precio) {
        this.marca = marca;
        this.tipoDeVino = tipoDeVino;
        this.grados = grados;
        this.precio = precio;
        calorias = (int)(grados*10);

    }

    //getters y setters
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getTipoDeVino() {
        return tipoDeVino;
    }
    public void setTipoDeVino(String tipoDeVino) {
        this.tipoDeVino = tipoDeVino;
    }
    public double getGrados() {
        return grados;
    }
    public void setGrados(double grados) {
        this.grados = grados;
    }
    public double getPrecio() {
        return precio;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
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

    //EsLiquido
    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }
    public double getVolumen() {
        return volumen;
    }
    public void setTipoEnvase(String tipoEnvase) {
        this.tipoEnvase = tipoEnvase;
    }
    public String getTipoEnvase() {
        return tipoEnvase;
    }

    //ConDescuento
    public void setDescuento(double descuento) {
        this.descuento = descuento;
        precioDescuento = precio - precio*descuento/100;
    }
    public double getDescuento() {
        return descuento;
    }
    public double getPrecioDescuento() {
        return precioDescuento;
    }

    @Override
    public String toString() {
        return "Vino{" +
                "marca='" + marca + '\'' +
                ", tipoDeVino='" + tipoDeVino + '\'' +
                ", grados=" + grados +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", precioDescuento=" + precioDescuento +
                ", calorias=" + calorias +
                ", fechaCaducidad=" + fechaCaducidad +
                ", volumen=" + volumen +
                ", tipoEnvase='" + tipoEnvase + '\'' +
                '}';
    }
}
