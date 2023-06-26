package n3ejercicio1;

public class Vehiculo implements Ejecutar {

    private final String Tipo;

    public Vehiculo(String tipo) {
        Tipo = tipo;
    }

    public void arrancar(){
        System.out.println("El " + Tipo + " está arrancando");
    }

    public void acelerar(){
        System.out.println("El " + Tipo + " está acelerando");
    }

    public void frenar(){
        System.out.println("El " + Tipo + " está frenando");
    }

    //@FunctionalInterface Ejecutar
    @Override
    public void execute() {
        this.arrancar();
        this.acelerar();
        this.frenar();
    }

}
