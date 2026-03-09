public class Producto {
    private String codigo;
    private String nombre;
    private double precio;
    private int stock;
    private boolean disponible;

    public Producto(String codigo, String nombre, double precio, int stock, boolean disponible) {
        this.codigo = codigo;
        this.disponible = disponible;
        this.stock = stock;
        this.precio = precio;
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString(){
        return codigo + " " +
                nombre + " " +
                precio + " " +
                stock + " " +
                disponible;
    }
}
