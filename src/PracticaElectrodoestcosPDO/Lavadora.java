package PracticaElectrodoestcosPDO;

public class Lavadora extends Electrodomesticos{
    private double carga = 5;

    public Lavadora(double precioBase, Color color, String consumoEnergetico, double peso, double carga) {
        super(precioBase, color, consumoEnergetico, peso);
        this.carga = carga;
    }

    public double getCarga() {
        return carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public String toString() {
        return "Lavadora{" +
                "precioBase=" + precioBase +
                ", color='" + color + '\'' +
                ", consumoEnergetico='" + consumoEnergetico + '\'' +
                ", peso=" + peso +
                ", carga=" + carga +
                '}';
    }

    @Override
    public double precioFinal() {
        double precioConCarga = super.precioFinal();
        if(carga >= 6){
          precioConCarga = precioConCarga + 50;
        }
        return precioConCarga;
    }
}