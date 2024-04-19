package supermercado;

public class Detergente implements ConDescuento, EsLiquido{
    private String marca;
    private double precio;
    private double descuento = 0.0;
    private double precioDescuento;
    private double volumen = 0.0;
    private String tipoEnvase = "";

    public Detergente(String marca, double precio) {
        this.marca = marca;
        this.precio = precio;
    }

    //Getters y setters
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

    @Override
    public String toString() {
        return "Detergente: " + marca + ", " + precio + ", " + descuento + "%," + volumen + ", " + tipoEnvase;
    }
}
