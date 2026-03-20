public abstract class DispositivoIoT {

    // Atributos
    private String id;
    private String ubicacion;
    private boolean encendido;

    // Constructor
    public DispositivoIoT(String id, String ubicacion) {
        this.id = id;
        this.ubicacion = ubicacion;
        this.encendido = false;
    }

    // Getters y Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean isEncendido() {
        return encendido;
    }

    public void setEncendido(boolean encendido) {
        this.encendido = encendido;
    }

    // Métodos
    public void encender() {
        encendido = true;
        System.out.println(id + " encendido.");
    }

    public void apagar() {
        encendido = false;
        System.out.println(id + " apagado.");
    }

    // Método abstracto
    public abstract void procesarDatos();
}