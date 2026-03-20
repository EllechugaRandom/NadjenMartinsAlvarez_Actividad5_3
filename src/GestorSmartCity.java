import java.util.ArrayList;
import java.util.Scanner;

public class GestorSmartCity {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<DispositivoIoT> redDispositivos = new ArrayList<>();

        int opcion;

        do {
            System.out.println("1. Añadir dispositivo");
            System.out.println("2. Mostrar estado");
            System.out.println("3. Mantenimiento global");
            System.out.println("4. Reinicio remoto");
            System.out.println("5. Salir");
            System.out.print("Opción: ");

            opcion = sc.nextInt();
            sc.nextLine();

            switch (opcion) {

                case 1:
                    System.out.println("1. Semáforo");
                    System.out.println("2. Sensor");
                    System.out.println("3. Panel");
                    int tipo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("ID: ");
                    String id = sc.nextLine();

                    System.out.print("Ubicación: ");
                    String ubicacion = sc.nextLine();

                    if (tipo == 1) {
                        System.out.print("Estado (Verde/Ámbar/Rojo): ");
                        String estado = sc.nextLine();
                        redDispositivos.add(new SemaforoInteligente(id, ubicacion, estado));
                    } else if (tipo == 2) {
                        System.out.print("Nivel CO2: ");
                        double co2 = sc.nextDouble();
                        redDispositivos.add(new SensorContaminacion(id, ubicacion, co2));
                    } else if (tipo == 3) {
                        System.out.print("Texto: ");
                        String texto = sc.nextLine();
                        redDispositivos.add(new PanelInformativo(id, ubicacion, texto));
                    }
                    break;

                case 2:
                    for (DispositivoIoT d : redDispositivos) {
                        d.procesarDatos();
                    }
                    break;

                case 3:
                    double total = 0;

                    for (DispositivoIoT d : redDispositivos) {
                        if (d instanceof Mantenible) {
                            Mantenible m = (Mantenible) d;
                            m.realizarMantenimiento();
                            total += m.calcularCosteMantenimiento();
                        }
                    }

                    System.out.println("Coste total: " + total + "€");
                    break;

                case 4:
                    for (DispositivoIoT d : redDispositivos) {
                        if (d instanceof ControlableRemotamente) {
                            ControlableRemotamente c = (ControlableRemotamente) d;
                            if (c.conectarWifi()) {
                                c.reiniciarDispositivo();
                            }
                        }
                    }
                    break;
            }

        } while (opcion != 5);

        sc.close();
    }
}