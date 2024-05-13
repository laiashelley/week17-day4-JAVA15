public class Elegantes extends Zapatos {
    
    private boolean tieneCordones; 

    public Elegantes(String marca, String modelo, double talla, double precio, boolean tieneCordones){
        super (marca, modelo, talla, precio);
        this.tieneCordones = tieneCordones;
    }

    public Elegantes() {
    }

    public boolean isTieneCordones() {
        return this.tieneCordones;
    }

    public boolean getTieneCordones() {
        return this.tieneCordones;
    }

    public void setTieneCordones(boolean tieneCordones) {
        this.tieneCordones = tieneCordones;
    }

    @Override
    public String toString() {
        return "Marca: " + getMarca() + "; " +
            "Modelo: " + getModelo() + "; " +
            "Talla: " + getTalla() + "; " +
            "Precio: " + getPrecio() + "Tiene cordones?" + isTieneCordones();
    }

    public boolean tieneCordones() {
        return this.tieneCordones;
    }
}

