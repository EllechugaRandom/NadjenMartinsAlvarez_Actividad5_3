public class SemaforoInteligente extends DispositivoIoT implements Mantenible,ControlableRemotamente {
    // Atributos
    private String estadoActual;

    // Constructor
    public SemaforoInteligente(String id, String ubicacion, String estadoActual) {
        super(id, ubicacion);
        this.estadoActual = estadoActual;
    }

    // Getters y Setters
    public String getEstadoActual() {
        return estadoActual;
    }

    public void setEstadoActual(String estadoActual) {
        this.estadoActual = estadoActual;
    }

    // Métodos
    @Override
    public void procesarDatos() {
        System.out.println("Semáforo en " + getUbicacion() + " está en " + estadoActual);
    }

    @Override
    public double calcularCosteMantenimiento() {
        return 150;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento realizado al semáforo " + getId());
    }

    @Override
    public boolean conectarWifi() {
        System.out.println("Semáforo " + getId() + " conectado al Wi-Fi.");
        return true;
    }

    @Override
    public void reiniciarDispositivo() {
        System.out.println("Semáforo " + getId() + " reiniciado.");
    }
}
