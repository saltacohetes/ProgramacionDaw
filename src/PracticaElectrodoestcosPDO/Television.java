package PracticaElectrodoestcosPDO;

public class Television extends Electrodomesticos{
    private double resolucion = 20;
    private boolean netflix = false;

    public Television(double precioBase, Color color, String consumoEnergetico, double peso, double resolucion, boolean netflix) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public Television(double resolucion, boolean netflix) {
        this.resolucion = resolucion;
        this.netflix = netflix;
    }

    public double getResolucion() {
        return resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isNetflix() {
        return netflix;
    }

    public void setNetflix(boolean netflix) {
        this.netflix = netflix;
    }

    @Override
    public String toString() {
        return "Television{" +
                "resolucion=" + resolucion +
                ", netflix=" + netflix +
                ", precioBase=" + precioBase +
                ", color=" + color +
                ", consumoEnergetico='" + consumoEnergetico + '\'' +
                ", peso=" + peso +
                '}';
    }

    @Override
    public double precioFinal() {
        double precio_final = this.precioBase;
        if(resolucion > 20){
            precio_final = precioBase * 1.3;
        }

        switch (this.consumoEnergetico) {
            case "A+":
                precio_final = precio_final + 120;
                break;
            case "A":
                precio_final = precio_final + 100;
                break;
            case "B":
                precio_final = precio_final + 80;
                break;
            case "C":
                precio_final = precio_final + 60;
                break;
            case "D":
                precio_final = precio_final + 50;
                break;
            case "E":
                precio_final = precio_final + 30;
                break;
            case "F":
                precio_final = precio_final + 10;
                break;
        }

        if (this.peso >= 0 && this.peso <= 19) {
            precio_final = precio_final + 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precio_final = precio_final + 30;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precio_final = precio_final + 50;
        } else if (this.peso >= 80) {
            precio_final = precio_final + 100;
        }

        if(netflix != false){
            precio_final = precio_final + 60;
        }
        return precio_final;
    }
}
