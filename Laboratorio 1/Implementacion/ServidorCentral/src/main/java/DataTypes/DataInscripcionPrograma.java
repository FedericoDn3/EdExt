
package DataTypes;

import java.util.Date;

public class DataInscripcionPrograma {
    private Long id;
    private Date fecha;
    private String programa;
    private DataUsuario estudiante;

    public DataInscripcionPrograma(Long id, Date fecha, String programa, DataUsuario estudiante) {
        this.id = id;
        this.fecha = fecha;
        this.programa = programa;
        this.estudiante = estudiante;
    }

    public Long getId() {
        return id;
    }

    public Date getFecha() {
        return fecha;
    }

    public String getPrograma() {
        return programa;
    }

    public DataUsuario getEstudiante() {
        return estudiante;
    }
    
}
