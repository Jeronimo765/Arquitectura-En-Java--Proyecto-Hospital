package clases;

import clases1.empleado.*;
import java.util.HashMap;

public class ModeloDatos {

    private HashMap<String, Paciente> pacientesMap = new HashMap<>();
    private HashMap<String, EmpleadoPlanilla> empleadosPlanillaMap = new HashMap<>();
    private HashMap<String, EmpleadoEventual> empleadosEventualMap = new HashMap<>();
    private HashMap<String, Medico> medicosMap = new HashMap<>();


    public void registrarPersona(Paciente p) {
        if (pacientesMap.containsKey(p.getNumeroDeDNI())) {
            System.out.println(" Ya existe un paciente con ese documento");
        } else {
            pacientesMap.put(p.getNumeroDeDNI(), p);
            System.out.println(" Paciente registrado correctamente");
        }
    }

    public void registrarPersona(EmpleadoPlanilla e) {
        if (empleadosPlanillaMap.containsKey(e.getNumeroDeDNI())) {
            System.out.println(" Ya existe un empleado de planilla con ese documento");
        } else {
            empleadosPlanillaMap.put(e.getNumeroDeDNI(), e);
            System.out.println(" Empleado de planilla registrado correctamente");
        }
    }

    public void registrarPersona(EmpleadoEventual e) {
        if (empleadosEventualMap.containsKey(e.getNumeroDeDNI())) {
            System.out.println(" Ya existe un empleado eventual con ese documento");
        } else {
            empleadosEventualMap.put(e.getNumeroDeDNI(), e);
            System.out.println(" Empleado eventual registrado correctamente");
        }
    }

    public void registrarPersona(Medico m) {
        if (medicosMap.containsKey(m.getNumeroDeDNI())) {
            System.out.println(" Ya existe un médico con ese documento");
        } else {
            medicosMap.put(m.getNumeroDeDNI(), m);
            System.out.println(" Médico registrado correctamente");
        }
    }


    public void imprimirPacientes() {
        if (pacientesMap.isEmpty()) {
            System.out.println("⚠ No hay pacientes registrados");
            return;
        }
        pacientesMap.values().forEach(p -> p.imprimirDatosPersona(""));
    }

    public void imprimirEmpleadosEventuales() {
        if (empleadosEventualMap.isEmpty()) {
            System.out.println("⚠ No hay empleados eventuales registrados");
            return;
        }
        empleadosEventualMap.values().forEach(e -> e.imprimirDatosPersona(""));
    }

    public void imprimirEmpleadosPorPlanilla() {
        if (empleadosPlanillaMap.isEmpty() && medicosMap.isEmpty()) {
            System.out.println(" No hay empleados por planilla registrados");
            return;
        }
        System.out.println(" EMPLEADOS POR PLANILLA");
        empleadosPlanillaMap.values().forEach(e -> e.imprimirDatosPersona(""));

        System.out.println("\n MÉDICOS (Como empleados de planilla)");
        medicosMap.values().forEach(m -> m.imprimirDatosPersona(""));
    }

    public void imprimirMedicos() {
        if (medicosMap.isEmpty()) {
            System.out.println(" No hay médicos registrados");
            return;
        }
        medicosMap.values().forEach(m -> m.imprimirDatosPersona(""));
    }

    
    public Paciente consultarPacientePorDocumento(String doc) {
        return pacientesMap.get(doc);
    }

    public EmpleadoEventual consultarEmpleadoEventualPorDocumento(String doc) {
        return empleadosEventualMap.get(doc);
    }

    public EmpleadoPlanilla consultarEmpleadoPlanillaPorDocumento(String doc) {
        return empleadosPlanillaMap.get(doc);
    }

    public Medico consultarMedicoPorDocumento(String doc) {
        return medicosMap.get(doc);
    }
}
