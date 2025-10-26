package clases1.empleado;

import javax.swing.JOptionPane;

public class EmpleadoPlanilla extends Empleado {

    private double salarioMensual;
    private double porcentajeAdicionalPorHoraExtra;

    @Override
    public void registrarDatos() {
        super.registrarDatos();
        boolean valido = false;
        while (!valido) {
            try {
                salarioMensual = Double.parseDouble(JOptionPane.showInputDialog("Ingrese salario mensual"));
                porcentajeAdicionalPorHoraExtra = Double.parseDouble(
                        JOptionPane.showInputDialog("Ingrese porcentaje adicional por hora extra")
                );
                if (salarioMensual <= 0 || porcentajeAdicionalPorHoraExtra < 0)
                    throw new Exception("Valores inválidos");
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);
        System.out.println("Salario mensual: " + salarioMensual);
        System.out.println("Porcentaje adicional por hora extra: " + porcentajeAdicionalPorHoraExtra);
    }
}
