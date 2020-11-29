package Entidades;

import DataTypes.DataEdicion;
import DataTypes.DataEstudiante;
import DataTypes.DataInscripcionEdicion;
import DataTypes.DataProgramaFormacion;
import DataTypes.DataUsuario;
import DataTypes.DataValoracion;
import DataTypes.EstadoInscripcion;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.OneToMany;

@Entity
public class Estudiante extends Usuario {

    @OneToMany
    private List<InscripcionEdicion> inscripcionEdiciones;
    @OneToMany
    private List<InscripcionPrograma> inscripcionProgramas;
    @OneToMany
    private List<Valoracion> valoraciones;

    public Estudiante() {
    }

    public Estudiante(String nick, String nombre, String apellido, String email, Date fechaNacimiento, String contrasenia, byte[] imagen) {
        super(nick, nombre, apellido, email, fechaNacimiento, contrasenia, imagen);
        inscripcionEdiciones = new ArrayList();
        inscripcionProgramas = new ArrayList();
    }

    public List getInscripcionEdiciones() {
        return inscripcionEdiciones;
    }

    public void setInscripcionEdiciones(List inscripcionEdiciones) {
        this.inscripcionEdiciones = inscripcionEdiciones;
    }

    public List getInscripcionProgramas() {
        return inscripcionProgramas;
    }

    public void setInscripcionProgramas(List inscripcionProgramas) {
        this.inscripcionProgramas = inscripcionProgramas;
    }

    public boolean estaInscripto(String edicion) {
        for (InscripcionEdicion aux : inscripcionEdiciones) {
            if (aux.getEdicion().getNombreEdicion() == edicion) {
                return true;
            }
        }
        return false;
    }

    public DataInscripcionEdicion darDatosInscripcionEdicion(String curso, String edicion) {
        for (InscripcionEdicion ie : this.inscripcionEdiciones) {
            if (ie.getEdicion().getNombreEdicion().equals(edicion) && ie.getEdicion().getCurso().getNombre().equals(curso)) {
                return ie.darDatos();
            }
        }
        return null;
    }

    public InscripcionEdicion darInscripcionEdicion(String edicion, String curso) {
        for (InscripcionEdicion ie : this.inscripcionEdiciones) {
            if (ie.getEdicion().getNombreEdicion().equals(edicion) && ie.getEdicion().getCurso().getNombre().equals(curso)) {
                return ie;
            }
        }
        return null;
    }

    public InscripcionPrograma darInscripcionPrograma(String programa) {
        for (InscripcionPrograma aux : inscripcionProgramas) {
            if (aux.getPrograma().getNombre() == programa) {
                return aux;
            }
        }
        return null;
    }

    public InscripcionEdicion inscribirseAUnaEdicion(Edicion edicion, Date fecha, String urlVideo) {
        InscripcionEdicion inscripcion = this.darInscripcionEdicion(edicion.getNombreEdicion(), edicion.getCurso().getNombre());
        if (inscripcion != null) {
            if (inscripcion.getEstado() == EstadoInscripcion.RECHASADO) {
                inscripcion.setEstado(EstadoInscripcion.INSCRIPTO);
                inscripcion.setInscripcionesPrevias(inscripcion.getInscripcionesPrevias() + 1);
            }
            inscripcion.setUrlVideo(urlVideo);
            inscripcion.setFecha(fecha);
        } else {
            inscripcion = new InscripcionEdicion(fecha, edicion, this, urlVideo);
            inscripcionEdiciones.add(inscripcion);
        }
        return inscripcion;
    }

    public InscripcionPrograma inscribirseAUnPrograma(ProgramaFormacion programa, Date fecha) {
        InscripcionPrograma inscripcion = this.darInscripcionPrograma(programa.getNombre());
        if (inscripcion == null) {
            inscripcion = new InscripcionPrograma(fecha, programa, this);
            inscripcionProgramas.add(inscripcion);
        }
        return inscripcion;
    }

    @Override
    public DataUsuario darDatos() {
        List<DataInscripcionEdicion> eds = new ArrayList();
        for (InscripcionEdicion ie : inscripcionEdiciones) {
            if (ie != null) {
                DataInscripcionEdicion die = ie.darDatos();
                eds.add(die);
            }
        }
        List<DataProgramaFormacion> progs = new ArrayList();
        for (InscripcionPrograma ip : inscripcionProgramas) {
            if (ip.getPrograma() != null) {
                DataProgramaFormacion dpf = ip.getPrograma().darDatos();
                progs.add(dpf);
            }
        }
        return new DataEstudiante(eds, progs, super.getNick(), super.getNombre(), super.getApellido(), super.getEmail(), super.getFechaNacimiento(),
                super.getContrasenia(), super.getimagen());
    }

    public void cancelarInscripcionEdicion(String edicion, String curso, EntityManager em) {
        InscripcionEdicion inscripcion = this.darInscripcionEdicion(edicion, curso);
        if (inscripcion != null) {
            if (inscripcion.getEstado() == EstadoInscripcion.INSCRIPTO) {
                inscripcion.getEdicion().cancelarInscripcionEstudiante(inscripcion);
                this.inscripcionEdiciones.remove(inscripcion);
                em.remove(inscripcion);
                inscripcion.setEdicion(null);
                inscripcion.setEstudiante(null);
                inscripcion = null;
            }
        }
    }

    public List<DataEdicion> darInscripcionesActivasEdicion() {
        List<DataEdicion> result = new ArrayList();
        for (InscripcionEdicion inscripcion : inscripcionEdiciones) {
            if (inscripcion.getEstado() == EstadoInscripcion.ACEPTADO) {
                result.add(inscripcion.getEdicion().darDatos());
            }
        }
        return result;
    }

    // Valoraciones
    public void valorarCurso(Curso curso, Double valoracion, EntityManager em) {
        Valoracion val = this.darValoracion(curso.getNombre());
        if (val != null) {
            val.setValoracion(valoracion);
        } else {
            val = new Valoracion(this, valoracion, curso);
            this.valoraciones.add(val);
            curso.agregarValoracion(val);
            em.persist(val);
        }
    }

    public List<String> darInscripcionesActivasCurso() {
        List<String> result = new ArrayList();
        for (InscripcionEdicion inscripcion : inscripcionEdiciones) {
            if (inscripcion.getEstado() == EstadoInscripcion.ACEPTADO) {
                if (!result.contains(inscripcion.getEdicion().getCurso().getNombre())) {
                    result.add(inscripcion.getEdicion().getCurso().getNombre());
                }
            }
        }
        return result;
    }

    public Valoracion darValoracion(String curso) {
        for (Valoracion val : this.valoraciones) {
            if (val.getCurso().getNombre().equals(curso)) {
                return val;
            }
        }
        return null;
    }

    public DataValoracion darDatosValoracion(String curso) {
        Valoracion val = this.darValoracion(curso);
        if (val != null) {
            return val.darDatos();
        }
        return null;
    }
    
    public void calificar(String curso, String edicion, float calificacion){
        InscripcionEdicion inscripcion = this.darInscripcionEdicion(edicion, curso);
        if(inscripcion != null){
            inscripcion.setCalificacion(calificacion);
        }
    }
}
