package clases1.empleado;

import javax.swing.JOptionPane;
import clases.Persona;

public class Empleado extends Persona {

    private String codigoDeEmpleado;
    private int numeroDeHorasExtras;
    private String fechaDeIngreso;
    private String area;
    private String cargo;

    @Override
    public void registrarDatos() {
        super.registrarDatos();
        codigoDeEmpleado = JOptionPane.showInputDialog("Ingrese el código del empleado");
        boolean valido = false;
        while (!valido) {
            try {
                numeroDeHorasExtras = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese el número de horas extras")
                );
                if (numeroDeHorasExtras < 0) throw new Exception("Horas extras no pueden ser negativas");
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        fechaDeIngreso = JOptionPane.showInputDialog("Ingrese la fecha de ingreso (dd/mm/aaaa)");
        area = JOptionPane.showInputDialog("Ingrese el área");
        cargo = JOptionPane.showInputDialog("Ingrese el cargo");
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);
        System.out.println("Código: " + codigoDeEmpleado);
        System.out.println("Horas Extras: " + numeroDeHorasExtras);
        System.out.println("Fecha de Ingreso: " + fechaDeIngreso);
        System.out.println("Área: " + area);
        System.out.println("Cargo: " + cargo);
    }
}
