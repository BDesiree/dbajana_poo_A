package ec.edu.intsuperior.modelo;

import static com.sun.scenario.Settings.set;

public class Docente {

    String ci;
    String nombre;
    String apellido;
    String direccion;
    String especialidad;
    public enum TipoGenero {
        MASCULINO, FEMENINO
    }
    TipoGenero genero;

    public Docente() {
    }

    public Docente(String ci, String nombre, String apellido, String direccion, String especialidad, TipoGenero genero) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.especialidad = especialidad;
        this.genero = genero;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setCi(String ci) {
        this.ci=ci;
    }
    public void setDireccion(String direccion) {
        this.direccion= direccion;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setGenero(TipoGenero genero) {
        this.genero = genero;
    }

    public String getEspecialidad() {
        return especialidad;
    }
     
    public String getCi() {
        return ci;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public String getApellido() {
        return apellido;
    }

    public TipoGenero getGenero() {
        return genero;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return"Los datos del docente solicitada es :\n"
            + "Cedula:  " +getCi() + "\n"
                + "Nombre y apellido: " +getNombre() +"\n"
                       + "genero: "+getGenero();
                
    }
    
}