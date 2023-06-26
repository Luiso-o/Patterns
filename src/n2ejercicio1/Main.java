package n2ejercicio1;

public class Main {

    public static void main(String[] args) {
        // Crear instancia del GestorAgenda con las fábricas correspondientes
        GestorAgenda Directotio1 = new GestorAgenda(new DireccionInternacionalFactory(), new TelefonoInternacionalFactory());
        GestorAgenda Directorio2 = new GestorAgenda(new DireccionNacionalFactory(), new TelefonoNacionalFactory());

        // Añadir un contacto a la agenda
        Directotio1.añadirContacto();
        Directorio2.añadirContacto();
    }

}
