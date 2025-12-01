package PracticaElectrodoestcosPDO;

import javax.swing.*;

public class Electrodomesticos {

    public enum Color
    {
        Blanco, Negro, Plateado, Rojo, Azul, Gris
    }

    //Valores a tener en cuenta del objeto
    protected double precioBase;
    // A+, A, B, C, D, E, F
    protected Color color;
    protected String consumoEnergetico;
    protected double peso;

    //Valores que van por defecto en el objeto
    private static final double precioDef = 100;
    private static final Color colorDef = Color.Blanco;
    private static final String consumoDef = "A";
    private static final double pesoDef = 10;

    //COnstructor del objeto sin valores por defecto
    public Electrodomesticos () {
        this.precioBase = precioDef;
        this.color = colorDef;
        this.consumoEnergetico = consumoDef;
        this.peso = pesoDef;
    }

    //Constructor con parametros
    public Electrodomesticos (double precioBase, Color color, String consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        this.color = color;
        //Haces esto para qque en el metodo que haces abajo compruebe que lo que le mandas es correcto a la hora de crear el objeto y si no que te devuelva el por defecto.
        this.consumoEnergetico = consumoEnergetico;
        this.consumoEnergetico = comprobarConsumoEnergetico(this.consumoEnergetico);
        this.peso = peso;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(String consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }


    private String comprobarConsumoEnergetico(String letra){
        //Por la tabla de valores true & false debo recordar que si algo aqui no es valido (un false) es realente el valor que estoy buscando y si el valor es true realmente no es el valor que busco.
        /*
            False || False -> False
            True || False -> True
            False || True -> True
            True || True -> True
         */
        if (!(letra == "A+" || letra == "A" || letra == "B" || letra == "C" || letra == "D" || letra == "E" || letra == "F")) {
            return consumoDef;
            //si letra no es alguna d estas devolver A si es alguna de estas no hago nada.
        }
        // como la letra seria correcta devuelvo la letra para que letra en si no devuelva vacio o basura
        else {
            return letra;
        }
    }

    @Override
    public String toString(){
        return (this.precioBase) + " " + this.consumoEnergetico + " " + (this.peso) + " " + (this.color);
    }

    public double precioFinal() {
        double precioConsumoPeso = this.precioBase;
        switch (this.consumoEnergetico) {
            case "A+":
                precioConsumoPeso = precioConsumoPeso + 120;
                break;
            case "A":
                precioConsumoPeso = precioConsumoPeso + 100;
                break;
            case "B":
                precioConsumoPeso = precioConsumoPeso + 80;
                break;
            case "C":
                precioConsumoPeso = precioConsumoPeso + 60;
                break;
            case "D":
                precioConsumoPeso = precioConsumoPeso + 50;
                break;
            case "E":
                precioConsumoPeso = precioConsumoPeso + 30;
                break;
            case "F":
                precioConsumoPeso = precioConsumoPeso + 10;
                break;
        }

        if (this.peso >= 0 && this.peso <= 19) {
            precioConsumoPeso = precioConsumoPeso + 10;
        } else if (this.peso >= 20 && this.peso <= 49) {
            precioConsumoPeso = precioConsumoPeso + 30;
        } else if (this.peso >= 50 && this.peso <= 79) {
            precioConsumoPeso = precioConsumoPeso + 50;
        } else if (this.peso >= 80) {
            precioConsumoPeso = precioConsumoPeso + 100;
        }
        return precioConsumoPeso;
    }
}