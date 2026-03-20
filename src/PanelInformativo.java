public class PanelInformativo extends DispositivoIoT implements ControlableRemotamente {
    // Atributos
    private String textoMostrado;

    // Constructor
    public PanelInformativo(String id, String ubicacion, String textoMostrado) {
        super(id, ubicacion);
        this.textoMostrado = textoMostrado;
    }

    // Getters y Setters
    public String getTextoMostrado() {
        return textoMostrado;
    }

    public void setTextoMostrado(String textoMostrado) {
        this.textoMostrado = textoMostrado;
    }

    // Métodos
    @Override
    public void procesarDatos() {
        System.out.println("Panel en " + getUbicacion() + ": " + textoMostrado);
    }

    @Override
    public boolean conectarWifi() {
        System.out.println("Panel " + getId() + " conectado al Wi-Fi.");
        return true;
    }

    @Override
    public void reiniciarDispositivo() {
        System.out.println("Panel " + getId() + " reiniciado.");
    }
}