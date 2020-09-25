package Entidades;

import DataTypes.DataEdicion;
import DataTypes.DataEstudiante;
import DataTypes.DataUsuario;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.MapKey;
import javax.persistence.OneToMany;

@Entity
public class Estudiante extends Usuario {

    @OneToMany
    @MapKey(name = "id")
    private Map<String, InscripcionEdicion> inscripcionEdiciones;
    @OneToMany
    @MapKey(name = "id")
    private Map<String, InscripcionPrograma> inscripcionProgramas;

    public Estudiante() {
    }

    public Estudiante(String nick, String nombre, String apellido, String email, Date fechaNacimiento, String contrasenia) {
        super(nick, nombre, apellido, email, fechaNacimiento,contrasenia);
        inscripcionEdiciones = new HashMap();
        inscripcionProgramas = new HashMap();
    }

    public Map getInscripcionEdiciones() {
        return inscripcionEdiciones;
    }

    public void setInscripcionEdiciones(Map inscripcionEdiciones) {
        this.inscripcionEdiciones = inscripcionEdiciones;
    }

    public Map getInscripcionProgramas() {
        return inscripcionProgramas;
    }

    public void setInscripcionProgramas(Map inscripcionProgramas) {
        this.inscripcionProgramas = inscripcionProgramas;
    }
    
    public void inscribirEdicion(Edicion e, Date fecha, EntityManager em){
        InscripcionEdicion ie = new InscripcionEdicion(fecha, e);
        inscripcionEdiciones.put(e.getNombreEdicion(), ie);
        em.persist(ie);
    }
    
    @Override
    public DataUsuario darDatos() {
        List<DataEdicion> eds = new ArrayList();
        for (InscripcionEdicion ie : inscripcionEdiciones.values()) {
            if(ie.getEdicion() != null){
                eds.add(ie.getEdicion().darDatos());
            }
        }
        List<String> progs = new ArrayList();
        for (String s : inscripcionProgramas.keySet()) {
            progs.add(s);
        }
        return new DataEstudiante(eds, progs, super.getNick(), super.getNombre(), super.getApellido(), super.getEmail(), super.getFechaNacimiento(), super.getContrasenia());
    }
}
