package clases1.empleado;

import javax.swing.JOptionPane;

public class EmpleadoEventual extends Empleado {

    private double honorariosPorHora;
    private String fechaTerminoContrato;

    @Override
    public void registrarDatos() {
        super.registrarDatos();
        boolean valido = false;
        while (!valido) {
            try {
                honorariosPorHora = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese honorarios por hora")
                );
                if (honorariosPorHora <= 0) throw new Exception("Honorarios deben ser positivos");
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
        fechaTerminoContrato = JOptionPane.showInputDialog("Ingrese fecha de término del contrato (dd/mm/aaaa)");
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);
        System.out.println("Honorarios por hora: " + honorariosPorHora);
        System.out.println("Fecha término del contrato: " + fechaTerminoContrato);
    }
}
