package n2ejercicio1;

// Clase principal que utiliza el patrón Abstract Factory
class GestorAgenda {
    private final DireccionFactory AgendaDireccion;
    private final TelefonoFactory AgendaTelefono;

    public GestorAgenda(DireccionFactory direccionFactory, TelefonoFactory telefonoFactory) {
        this.AgendaDireccion = direccionFactory;
        this.AgendaTelefono = telefonoFactory;
    }

    public void añadirContacto() {
        Direccion direccion = AgendaDireccion.crearDireccion();
        Telefono telefono = AgendaTelefono.crearTelefono();

        // Lógica para añadir el contacto a la agenda
        System.out.println("Contacto añadido:");
        System.out.println("Dirección: " + direccion.calle() + ", " + direccion.ciudad() + ", " + direccion.codigoPostal());
        System.out.println("Teléfono: " + telefono.codigoPais() + " " + telefono.codigoArea() + " " + telefono.numero());
    }
}

// Implementación concreta de DireccionFactory para direcciones internacionales
class DireccionInternacionalFactory implements DireccionFactory {
    @Override
    public Direccion crearDireccion() {
        // Lógica para crear una dirección internacional
        return new Direccion("Calle Internacional", "Ciudad Internacional", "12345");
    }
}

// Implementación concreta de TelefonoFactory para números de teléfono internacionales
class TelefonoInternacionalFactory implements TelefonoFactory {
    @Override
    public Telefono crearTelefono() {
        // Lógica para crear un número de teléfono internacional
        return new Telefono("+1", "123", "4567890");
    }
}

// Implementación concreta de DireccionFactory para direcciones nacionales
class DireccionNacionalFactory implements DireccionFactory {
    @Override
    public Direccion crearDireccion() {
        // Lógica para crear una dirección nacional
        return new Direccion("Calle Nacional", "Ciudad Nacional", "67890");
    }
}

// Implementación concreta de TelefonoFactory para números de teléfono nacionales
class TelefonoNacionalFactory implements TelefonoFactory {
    @Override
    public Telefono crearTelefono() {
        // Lógica para crear un número de teléfono nacional
        return new Telefono("+34", "91", "1234567");
    }
}

