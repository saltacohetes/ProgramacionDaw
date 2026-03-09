package Ejercicio2;

import java.util.*;

public class Parking {
    private Map<String, Vehiculo> mapaVehiculos;

    public Parking() {
        this.mapaVehiculos = new HashMap<>();
    }

    public boolean agregarVehiculo(Vehiculo v) {
        if (mapaVehiculos.containsKey(v.getMatricula())) {
            return false;
        }
        mapaVehiculos.put(v.getMatricula(), v);
        return true;
    }

    public boolean pagarVehiculo(String matricula) {
        if (mapaVehiculos.containsKey(matricula)) {
            mapaVehiculos.get(matricula).setPagado(true);
            return true;
        }
        return false;
    }

    public void listarPendientes() {
        System.out.println("\n--- VEHÍCULOS PENDIENTES DE PAGO ---");
        mapaVehiculos.values().stream()
                .filter(v -> !v.isPagado())
                .sorted(Comparator.comparingInt(Vehiculo::getPlaza))
                .forEach(System.out::println);
    }

    public void listarPagados() {
        System.out.println("\n--- VEHÍCULOS PAGADOS ---");
        mapaVehiculos.values().stream()
                .filter(Vehiculo::isPagado)
                .sorted(Comparator.comparing(Vehiculo::getPropietario))
                .forEach(System.out::println);
    }

    public boolean borrarVehiculo(String matricula) {
        return mapaVehiculos.remove(matricula) != null;
    }
}