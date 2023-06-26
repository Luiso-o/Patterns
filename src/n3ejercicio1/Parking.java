package n3ejercicio1;

import java.util.ArrayList;

public class Parking {

    public static void main(String[] args) {

        ArrayList<Vehiculo> misVehiculos = new ArrayList<>();

     Vehiculo coche = new Vehiculo("coche");
     Vehiculo bicicleta = new Vehiculo("bicicleta");
     Vehiculo avion = new Vehiculo("Avión");
     Vehiculo barco = new Vehiculo("Barco");

     misVehiculos.add(coche);
     misVehiculos.add(bicicleta);
     misVehiculos.add(avion);
     misVehiculos.add(barco);

        misVehiculos.forEach(vehiculo -> {
            vehiculo.execute();
            System.out.println();
        });

    }

}
