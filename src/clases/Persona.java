package clases;

import javax.swing.JOptionPane;

public class Persona {

    private String numeroDeDNI;
    private String nombre;
    private String apellido;
    private String fechaDeNacimiento;
    private String direccion;
    private String ciudadDeProcedencia;

    public void registrarDatos() {
        numeroDeDNI = JOptionPane.showInputDialog("Ingrese número del documento");
        while (numeroDeDNI == null || numeroDeDNI.trim().equals("")) {
            numeroDeDNI = JOptionPane.showInputDialog("Documento inválido. Ingrese nuevamente:");
        }

        nombre = JOptionPane.showInputDialog("Ingrese nombre");
        apellido = JOptionPane.showInputDialog("Ingrese apellido");
        fechaDeNacimiento = JOptionPane.showInputDialog("Ingrese fecha de nacimiento (dd/mm/aaaa)");
        direccion = JOptionPane.showInputDialog("Ingrese dirección");
        ciudadDeProcedencia = JOptionPane.showInputDialog("Ingrese ciudad de procedencia");
    }

    public void imprimirDatosPersona(String datos) {
        datos += "Documento: " + numeroDeDNI + "\n";
        datos += "Nombre: " + nombre + "\n";
        datos += "Apellido: " + apellido + "\n";
        datos += "Fecha de nacimiento: " + fechaDeNacimiento + "\n";
        datos += "Dirección: " + direccion + "\n";
        datos += "Ciudad de procedencia: " + ciudadDeProcedencia + "\n";
        System.out.println(datos);
    }

    public String getNumeroDeDNI() {
        return numeroDeDNI;
    }

    public String getNombre() {
        return nombre;
    }
    
    @Override
    public String toString() {
        return "Documento: " + numeroDeDNI +
               ", Nombre: " + nombre +
               ", Apellido: " + apellido +
               ", Fecha de nacimiento: " + fechaDeNacimiento +
               ", Dirección: " + direccion +
               ", Ciudad: " + ciudadDeProcedencia;
    }
}
