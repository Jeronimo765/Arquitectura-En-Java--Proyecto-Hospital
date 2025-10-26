import clases.*;
import clases1.empleado.*;
import java.util.Scanner;

public class Procesos {

    private ModeloDatos modelo = new ModeloDatos();
    private Scanner sc = new Scanner(System.in);

    public void iniciar() {
        int opc;
        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1. Registrar Paciente");
            System.out.println("2. Registrar Empleado Eventual");
            System.out.println("3. Registrar Empleado Planilla");
            System.out.println("4. Registrar Médico");
            System.out.println("5. Listar Pacientes");
            System.out.println("6. Listar Empleados Eventuales");
            System.out.println("7. Listar Empleados por Planilla");
            System.out.println("8. Listar Médicos");
            System.out.println("9. Buscar por documento");
            System.out.println("10. Salir");
            System.out.print("Seleccione una opción: ");
            opc = sc.nextInt();
            sc.nextLine(); 

            switch (opc) {
                case 1 -> {
                    Paciente p = new Paciente();
                    p.registrarDatos();
                    modelo.registrarPersona(p);
                }
                case 2 -> {
                    EmpleadoEventual e = new EmpleadoEventual();
                    e.registrarDatos();
                    modelo.registrarPersona(e);
                }
                case 3 -> {
                    EmpleadoPlanilla e = new EmpleadoPlanilla();
                    e.registrarDatos();
                    modelo.registrarPersona(e);
                }
                case 4 -> {
                    Medico m = new Medico();
                    m.registrarDatos();
                    modelo.registrarPersona(m);
                }
                case 5 -> modelo.imprimirPacientes();
                case 6 -> modelo.imprimirEmpleadosEventuales();
                case 7 -> modelo.imprimirEmpleadosPorPlanilla();
                case 8 -> modelo.imprimirMedicos();
                case 9 -> buscarPorDocumento();
                case 10 -> System.out.println("Saliendo...");
                default -> System.out.println("Opción inválida");
            }
        } while (opc != 10);
    }

    private void buscarPorDocumento() {
        System.out.print("Ingrese documento: ");
        String doc = sc.nextLine();

        Paciente p = modelo.consultarPacientePorDocumento(doc);
        EmpleadoEventual ee = modelo.consultarEmpleadoEventualPorDocumento(doc);
        EmpleadoPlanilla ep = modelo.consultarEmpleadoPlanillaPorDocumento(doc);
        Medico m = modelo.consultarMedicoPorDocumento(doc);

        if (p != null) {
            System.out.println("Paciente encontrado:");
            p.imprimirDatosPersona("");
        } else if (ee != null) {
            System.out.println("Empleado eventual encontrado:");
            ee.imprimirDatosPersona("");
        } else if (ep != null) {
            System.out.println("Empleado planilla encontrado:");
            ep.imprimirDatosPersona("");
        } else if (m != null) {
            System.out.println("Médico encontrado:");
            m.imprimirDatosPersona("");
        } else {
            System.out.println("No se encontró ninguna persona con ese documento.");
        }
    }

    public static void main(String[] args) {
        new Procesos().iniciar();
    }
}
