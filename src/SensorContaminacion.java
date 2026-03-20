public class SensorContaminacion extends DispositivoIoT implements Mantenible {
    // Atributos
    private double nivelCO2;

    // Constructor
    public SensorContaminacion(String id, String ubicacion, double nivelCO2) {
        super(id, ubicacion);
        this.nivelCO2 = nivelCO2;
    }

    // Getters y Setters
    public double getNivelCO2() {
        return nivelCO2;
    }

    public void setNivelCO2(double nivelCO2) {
        this.nivelCO2 = nivelCO2;
    }

    // Métodos
    @Override
    public void procesarDatos() {
        System.out.println("Sensor en " + getUbicacion() + " mide CO2: " + nivelCO2);
    }

    @Override
    public double calcularCosteMantenimiento() {
        return 50;
    }

    @Override
    public void realizarMantenimiento() {
        System.out.println("Mantenimiento realizado al sensor " + getId());
    }
}
