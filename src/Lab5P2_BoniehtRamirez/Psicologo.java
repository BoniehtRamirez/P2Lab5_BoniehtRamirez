package Lab5P2_BoniehtRamirez;

public class Psicologo extends Persona{
    private String tituloUniversitario, especialidad;
    private int ID, informesGenerados=0, jugadoresAtendidos=0;

    public Psicologo(String tituloUniversitario, String especialidad, int ID, String nombre, String apellido, String nacionalidad, int edad) {
        super(nombre, apellido, nacionalidad, edad);
        this.tituloUniversitario = tituloUniversitario;
        this.especialidad = especialidad;
        this.ID = ID;
    }

    public String getTituloUniversitario() {
        return tituloUniversitario;
    }
    public void setTituloUniversitario(String tituloUniversitario) {
        this.tituloUniversitario = tituloUniversitario;
    }
    public String getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    public int getID() {
        return ID;
    }
    public void setID(int ID) {
        this.ID = ID;
    }
    public int getInformesGenerados() {
        return informesGenerados;
    }
    public void setInformesGenerados(int informesGenerados) {
        this.informesGenerados = informesGenerados;
    }
    public int getJugadoresAtendidos() {
        return jugadoresAtendidos;
    }
    public void setJugadoresAtendidos(int jugadoresAtendidos) {
        this.jugadoresAtendidos = jugadoresAtendidos;
    }
       
}