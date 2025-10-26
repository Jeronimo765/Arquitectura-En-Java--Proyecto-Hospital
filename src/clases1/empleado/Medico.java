package clases1.empleado;

import javax.swing.JOptionPane;

public class Medico extends EmpleadoPlanilla {

    private String especialidad;
    private int numeroDeConsultorio;

    @Override
    public void registrarDatos() {
        super.registrarDatos();
        especialidad = JOptionPane.showInputDialog("Ingrese su especialidad");
        boolean valido = false;
        while (!valido) {
            try {
                numeroDeConsultorio = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese número de consultorio")
                );
                if (numeroDeConsultorio <= 0) throw new Exception("Número de consultorio inválido");
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
        System.out.println("Especialidad: " + especialidad);
        System.out.println("Número de consultorio: " + numeroDeConsultorio);
    }
}
