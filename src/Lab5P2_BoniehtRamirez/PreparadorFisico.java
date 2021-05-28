package Lab5P2_BoniehtRamirez;

public class PreparadorFisico extends Persona {
    private int duracionContrato;
    private String especialidad, nombreTitulo;

    public PreparadorFisico(int duracionContrato, String especialidad, String nombreTitulo, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.duracionContrato = duracionContrato;
        this.especialidad = especialidad;
        this.nombreTitulo = nombreTitulo;
    }

    public int getDuracionContrato() {
        return duracionContrato;
    }
    public void setDuracionContrato(int duracionContrato) {
        this.duracionContrato = duracionContrato;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public String getNombreTitulo() {
        return nombreTitulo;
    }
    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }
       
}