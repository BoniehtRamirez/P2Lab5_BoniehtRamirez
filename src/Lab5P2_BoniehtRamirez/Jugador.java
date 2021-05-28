package Lab5P2_BoniehtRamirez;

public class Jugador extends Persona{
    private int numero, partidosJugados=0, copasGanadas=0, tarjetasAmarillas=0, tarjetasRojas=0, duracionContrato;

    public Jugador(int numero, int duracionContrato, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.numero = numero;
        this.duracionContrato = duracionContrato;
    }
    
    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }
    public int getPartidosJugados() {
        return partidosJugados;
    }
    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }
    public int getCopasGanadas() {
        return copasGanadas;
    }
    public void setCopasGanadas(int copasGanadas) {
        this.copasGanadas = copasGanadas;
    }
    public int getTarjetasAmarillas() {
        return tarjetasAmarillas;
    }
    public void setTarjetasAmarillas(int tarjetasAmarillas) {
        this.tarjetasAmarillas = tarjetasAmarillas;
    }
    public int getTarjetasRojas() {
        return tarjetasRojas;
    }
    public void setTarjetasRojas(int tarjetasRojas) {
        this.tarjetasRojas = tarjetasRojas;
    }
    public int getDuracionContrato() {
        return duracionContrato;
    }
    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }
    
}