public class Zapatos {
    
    protected String marca;
    protected String modelo;
    protected double talla;
    protected double precio;

    public Zapatos() {
    }

    public Zapatos(String marca, String modelo, double talla, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.talla = talla;
        this.precio = precio;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTalla() {
        return this.talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Modelo: " + getModelo() + "; " +
            "Talla: " + getTalla() + "; " +
            "Precio: " + getPrecio();
    }

}
