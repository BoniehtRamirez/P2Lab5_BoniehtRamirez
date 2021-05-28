package Lab5P2_BoniehtRamirez;

public class Entrenador extends Persona{
    private int duracionContrato, copasGanadas;

    public Entrenador(int duracionContrato, int copasGanadas, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.duracionContrato = duracionContrato;
        this.copasGanadas = copasGanadas;
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }

    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }

    public int getCopasGanadas() {
        return copasGanadas;
    }

    public void setCopasGanadas(int copasGanadas) {
        this.copasGanadas = copasGanadas;
    }
    
}