package DataTypes;

import java.util.Date;
import java.util.List;

public class DataEstudiante extends DataUsuario{
    
    List<String> inscripcionEdiciones;
    List<String> inscripcionProgramas;

    public DataEstudiante(String nick, String nombre, String apellido, String email, Date fechaNacimiento) {
        super(nick, nombre, apellido, email, fechaNacimiento);
    }

    public DataEstudiante(List<String> inscripcionEdiciones, List<String> inscripcionProgramas, String nick, String nombre, String apellido, String email, Date fechaNacimiento) {
        super(nick, nombre, apellido, email, fechaNacimiento);
        this.inscripcionEdiciones = inscripcionEdiciones;
        this.inscripcionProgramas = inscripcionProgramas;
    }

    public List<String> getInscripcionEdiciones() {
        return inscripcionEdiciones;
    }

    public List<String> getInscripcionProgramas() {
        return inscripcionProgramas;
    }
    
}
