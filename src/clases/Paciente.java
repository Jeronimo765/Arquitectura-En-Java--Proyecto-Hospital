package clases;

import javax.swing.JOptionPane;

public class Paciente extends Persona {

    private int numeroHistoriaClinica;

    @Override
    public void registrarDatos() {
        super.registrarDatos();
        boolean valido = false;
        while (!valido) {
            try {
                numeroHistoriaClinica = Integer.parseInt(
                        JOptionPane.showInputDialog("Ingrese número de Historia Clínica")
                );
                if (numeroHistoriaClinica <= 0) {
                    throw new Exception("Debe ingresar un número positivo.");
                }
                valido = true;
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "Error: Debe ingresar un número válido.");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }

    public int getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    @Override
    public void imprimirDatosPersona(String datos) {
        super.imprimirDatosPersona(datos);
        System.out.println("Número Historia Clínica: " + numeroHistoriaClinica);
    }

    @Override
    public String toString() {
        return super.toString() + ", Historia Clínica: " + numeroHistoriaClinica;
    }
}
