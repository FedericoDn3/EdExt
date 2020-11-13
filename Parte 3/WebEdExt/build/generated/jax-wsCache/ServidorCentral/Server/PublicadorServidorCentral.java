
package Server;

import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Action;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebService(name = "PublicadorServidorCentral", targetNamespace = "http://Servidor/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface PublicadorServidorCentral {


    /**
     * 
     * @param arg0
     * @return
     *     returns Server.DataProgramaFormacion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "darProgramaFormacion", targetNamespace = "http://Servidor/", className = "Server.DarProgramaFormacion")
    @ResponseWrapper(localName = "darProgramaFormacionResponse", targetNamespace = "http://Servidor/", className = "Server.DarProgramaFormacionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/darProgramaFormacionRequest", output = "http://Servidor/PublicadorServidorCentral/darProgramaFormacionResponse")
    public DataProgramaFormacion darProgramaFormacion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "altaProgramaFormacion", targetNamespace = "http://Servidor/", className = "Server.AltaProgramaFormacion")
    @ResponseWrapper(localName = "altaProgramaFormacionResponse", targetNamespace = "http://Servidor/", className = "Server.AltaProgramaFormacionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/altaProgramaFormacionRequest", output = "http://Servidor/PublicadorServidorCentral/altaProgramaFormacionResponse")
    public void altaProgramaFormacion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        XMLGregorianCalendar arg3);

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarProfesoresInstituto", targetNamespace = "http://Servidor/", className = "Server.ListarProfesoresInstituto")
    @ResponseWrapper(localName = "listarProfesoresInstitutoResponse", targetNamespace = "http://Servidor/", className = "Server.ListarProfesoresInstitutoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarProfesoresInstitutoRequest", output = "http://Servidor/PublicadorServidorCentral/listarProfesoresInstitutoResponse")
    public Lista listarProfesoresInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "aceptarInscripciones", targetNamespace = "http://Servidor/", className = "Server.AceptarInscripciones")
    @ResponseWrapper(localName = "aceptarInscripcionesResponse", targetNamespace = "http://Servidor/", className = "Server.AceptarInscripcionesResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/aceptarInscripcionesRequest", output = "http://Servidor/PublicadorServidorCentral/aceptarInscripcionesResponse")
    public void aceptarInscripciones(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        List<Object> arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns java.lang.Boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarNombreCategoria", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreCategoria")
    @ResponseWrapper(localName = "validarNombreCategoriaResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreCategoriaResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarNombreCategoriaRequest", output = "http://Servidor/PublicadorServidorCentral/validarNombreCategoriaResponse")
    public Boolean validarNombreCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCursosInstituto", targetNamespace = "http://Servidor/", className = "Server.ListarCursosInstituto")
    @ResponseWrapper(localName = "listarCursosInstitutoResponse", targetNamespace = "http://Servidor/", className = "Server.ListarCursosInstitutoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarCursosInstitutoRequest", output = "http://Servidor/PublicadorServidorCentral/listarCursosInstitutoResponse")
    public Lista listarCursosInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarNombreEdicion", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreEdicion")
    @ResponseWrapper(localName = "validarNombreEdicionResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreEdicionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarNombreEdicionRequest", output = "http://Servidor/PublicadorServidorCentral/validarNombreEdicionResponse")
    public boolean validarNombreEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarNombrePrograma", targetNamespace = "http://Servidor/", className = "Server.ValidarNombrePrograma")
    @ResponseWrapper(localName = "validarNombreProgramaResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreProgramaResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarNombreProgramaRequest", output = "http://Servidor/PublicadorServidorCentral/validarNombreProgramaResponse")
    public boolean validarNombrePrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarInscriptosAEdicion", targetNamespace = "http://Servidor/", className = "Server.ListarInscriptosAEdicion")
    @ResponseWrapper(localName = "listarInscriptosAEdicionResponse", targetNamespace = "http://Servidor/", className = "Server.ListarInscriptosAEdicionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarInscriptosAEdicionRequest", output = "http://Servidor/PublicadorServidorCentral/listarInscriptosAEdicionResponse")
    public Lista listarInscriptosAEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarAceptadosAEdicion", targetNamespace = "http://Servidor/", className = "Server.ListarAceptadosAEdicion")
    @ResponseWrapper(localName = "listarAceptadosAEdicionResponse", targetNamespace = "http://Servidor/", className = "Server.ListarAceptadosAEdicionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarAceptadosAEdicionRequest", output = "http://Servidor/PublicadorServidorCentral/listarAceptadosAEdicionResponse")
    public Lista listarAceptadosAEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "inscripcionAPrograma", targetNamespace = "http://Servidor/", className = "Server.InscripcionAPrograma")
    @ResponseWrapper(localName = "inscripcionAProgramaResponse", targetNamespace = "http://Servidor/", className = "Server.InscripcionAProgramaResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/inscripcionAProgramaRequest", output = "http://Servidor/PublicadorServidorCentral/inscripcionAProgramaResponse")
    public void inscripcionAPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarNombreInstituto", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreInstituto")
    @ResponseWrapper(localName = "validarNombreInstitutoResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreInstitutoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarNombreInstitutoRequest", output = "http://Servidor/PublicadorServidorCentral/validarNombreInstitutoResponse")
    public boolean validarNombreInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "agregarCursoAPrograma", targetNamespace = "http://Servidor/", className = "Server.AgregarCursoAPrograma")
    @ResponseWrapper(localName = "agregarCursoAProgramaResponse", targetNamespace = "http://Servidor/", className = "Server.AgregarCursoAProgramaResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/agregarCursoAProgramaRequest", output = "http://Servidor/PublicadorServidorCentral/agregarCursoAProgramaResponse")
    public void agregarCursoAPrograma(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCursosCategoria", targetNamespace = "http://Servidor/", className = "Server.ListarCursosCategoria")
    @ResponseWrapper(localName = "listarCursosCategoriaResponse", targetNamespace = "http://Servidor/", className = "Server.ListarCursosCategoriaResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarCursosCategoriaRequest", output = "http://Servidor/PublicadorServidorCentral/listarCursosCategoriaResponse")
    public Lista listarCursosCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarNick", targetNamespace = "http://Servidor/", className = "Server.ValidarNick")
    @ResponseWrapper(localName = "validarNickResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarNickResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarNickRequest", output = "http://Servidor/PublicadorServidorCentral/validarNickResponse")
    public boolean validarNick(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCursos", targetNamespace = "http://Servidor/", className = "Server.ListarCursos")
    @ResponseWrapper(localName = "listarCursosResponse", targetNamespace = "http://Servidor/", className = "Server.ListarCursosResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarCursosRequest", output = "http://Servidor/PublicadorServidorCentral/listarCursosResponse")
    public Lista listarCursos();

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.DataEdicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "darEdicionActual", targetNamespace = "http://Servidor/", className = "Server.DarEdicionActual")
    @ResponseWrapper(localName = "darEdicionActualResponse", targetNamespace = "http://Servidor/", className = "Server.DarEdicionActualResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/darEdicionActualRequest", output = "http://Servidor/PublicadorServidorCentral/darEdicionActualResponse")
    public DataEdicion darEdicionActual(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.DataUsuario
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "darDatosUsuario", targetNamespace = "http://Servidor/", className = "Server.DarDatosUsuario")
    @ResponseWrapper(localName = "darDatosUsuarioResponse", targetNamespace = "http://Servidor/", className = "Server.DarDatosUsuarioResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/darDatosUsuarioRequest", output = "http://Servidor/PublicadorServidorCentral/darDatosUsuarioResponse")
    public DataUsuario darDatosUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "inscripcionEdicion", targetNamespace = "http://Servidor/", className = "Server.InscripcionEdicion")
    @ResponseWrapper(localName = "inscripcionEdicionResponse", targetNamespace = "http://Servidor/", className = "Server.InscripcionEdicionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/inscripcionEdicionRequest", output = "http://Servidor/PublicadorServidorCentral/inscripcionEdicionResponse")
    public void inscripcionEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2);

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarUsuarios", targetNamespace = "http://Servidor/", className = "Server.ListarUsuarios")
    @ResponseWrapper(localName = "listarUsuariosResponse", targetNamespace = "http://Servidor/", className = "Server.ListarUsuariosResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarUsuariosRequest", output = "http://Servidor/PublicadorServidorCentral/listarUsuariosResponse")
    public Lista listarUsuarios();

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarEdiciones", targetNamespace = "http://Servidor/", className = "Server.ListarEdiciones")
    @ResponseWrapper(localName = "listarEdicionesResponse", targetNamespace = "http://Servidor/", className = "Server.ListarEdicionesResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarEdicionesRequest", output = "http://Servidor/PublicadorServidorCentral/listarEdicionesResponse")
    public Lista listarEdiciones(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "altaInstituto", targetNamespace = "http://Servidor/", className = "Server.AltaInstituto")
    @ResponseWrapper(localName = "altaInstitutoResponse", targetNamespace = "http://Servidor/", className = "Server.AltaInstitutoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/altaInstitutoRequest", output = "http://Servidor/PublicadorServidorCentral/altaInstitutoResponse")
    public void altaInstituto(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     */
    @WebMethod
    @RequestWrapper(localName = "modificarUsuario", targetNamespace = "http://Servidor/", className = "Server.ModificarUsuario")
    @ResponseWrapper(localName = "modificarUsuarioResponse", targetNamespace = "http://Servidor/", className = "Server.ModificarUsuarioResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/modificarUsuarioRequest", output = "http://Servidor/PublicadorServidorCentral/modificarUsuarioResponse")
    public void modificarUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        XMLGregorianCalendar arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        String arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     * @param arg9
     * @param arg8
     */
    @WebMethod
    @RequestWrapper(localName = "altaCurso", targetNamespace = "http://Servidor/", className = "Server.AltaCurso")
    @ResponseWrapper(localName = "altaCursoResponse", targetNamespace = "http://Servidor/", className = "Server.AltaCursoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/altaCursoRequest", output = "http://Servidor/PublicadorServidorCentral/altaCursoResponse")
    public void altaCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        int arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        int arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        XMLGregorianCalendar arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        List<Object> arg7,
        @WebParam(name = "arg8", targetNamespace = "")
        List<Object> arg8,
        @WebParam(name = "arg9", targetNamespace = "")
        String arg9);

    /**
     * 
     * @param arg0
     * @return
     *     returns Server.DataCurso
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "darDatosCurso", targetNamespace = "http://Servidor/", className = "Server.DarDatosCurso")
    @ResponseWrapper(localName = "darDatosCursoResponse", targetNamespace = "http://Servidor/", className = "Server.DarDatosCursoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/darDatosCursoRequest", output = "http://Servidor/PublicadorServidorCentral/darDatosCursoResponse")
    public DataCurso darDatosCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg6
     */
    @WebMethod
    @RequestWrapper(localName = "altaEdicionCurso", targetNamespace = "http://Servidor/", className = "Server.AltaEdicionCurso")
    @ResponseWrapper(localName = "altaEdicionCursoResponse", targetNamespace = "http://Servidor/", className = "Server.AltaEdicionCursoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/altaEdicionCursoRequest", output = "http://Servidor/PublicadorServidorCentral/altaEdicionCursoResponse")
    public void altaEdicionCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        XMLGregorianCalendar arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        XMLGregorianCalendar arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        int arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        XMLGregorianCalendar arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        List<Object> arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6);

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarInstitutos", targetNamespace = "http://Servidor/", className = "Server.ListarInstitutos")
    @ResponseWrapper(localName = "listarInstitutosResponse", targetNamespace = "http://Servidor/", className = "Server.ListarInstitutosResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarInstitutosRequest", output = "http://Servidor/PublicadorServidorCentral/listarInstitutosResponse")
    public Lista listarInstitutos();

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarNombreCurso", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreCurso")
    @ResponseWrapper(localName = "validarNombreCursoResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarNombreCursoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarNombreCursoRequest", output = "http://Servidor/PublicadorServidorCentral/validarNombreCursoResponse")
    public boolean validarNombreCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "validarEmail", targetNamespace = "http://Servidor/", className = "Server.ValidarEmail")
    @ResponseWrapper(localName = "validarEmailResponse", targetNamespace = "http://Servidor/", className = "Server.ValidarEmailResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/validarEmailRequest", output = "http://Servidor/PublicadorServidorCentral/validarEmailResponse")
    public boolean validarEmail(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarEstudiantes", targetNamespace = "http://Servidor/", className = "Server.ListarEstudiantes")
    @ResponseWrapper(localName = "listarEstudiantesResponse", targetNamespace = "http://Servidor/", className = "Server.ListarEstudiantesResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarEstudiantesRequest", output = "http://Servidor/PublicadorServidorCentral/listarEstudiantesResponse")
    public Lista listarEstudiantes();

    /**
     * 
     * @param arg3
     * @param arg2
     * @param arg5
     * @param arg4
     * @param arg1
     * @param arg0
     * @param arg7
     * @param arg6
     */
    @WebMethod
    @RequestWrapper(localName = "altaUsuario", targetNamespace = "http://Servidor/", className = "Server.AltaUsuario")
    @ResponseWrapper(localName = "altaUsuarioResponse", targetNamespace = "http://Servidor/", className = "Server.AltaUsuarioResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/altaUsuarioRequest", output = "http://Servidor/PublicadorServidorCentral/altaUsuarioResponse")
    public void altaUsuario(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        String arg2,
        @WebParam(name = "arg3", targetNamespace = "")
        String arg3,
        @WebParam(name = "arg4", targetNamespace = "")
        String arg4,
        @WebParam(name = "arg5", targetNamespace = "")
        XMLGregorianCalendar arg5,
        @WebParam(name = "arg6", targetNamespace = "")
        String arg6,
        @WebParam(name = "arg7", targetNamespace = "")
        String arg7);

    /**
     * 
     * @param arg0
     */
    @WebMethod
    @RequestWrapper(localName = "altaCategoria", targetNamespace = "http://Servidor/", className = "Server.AltaCategoria")
    @ResponseWrapper(localName = "altaCategoriaResponse", targetNamespace = "http://Servidor/", className = "Server.AltaCategoriaResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/altaCategoriaRequest", output = "http://Servidor/PublicadorServidorCentral/altaCategoriaResponse")
    public void altaCategoria(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0);

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarCategorias", targetNamespace = "http://Servidor/", className = "Server.ListarCategorias")
    @ResponseWrapper(localName = "listarCategoriasResponse", targetNamespace = "http://Servidor/", className = "Server.ListarCategoriasResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarCategoriasRequest", output = "http://Servidor/PublicadorServidorCentral/listarCategoriasResponse")
    public Lista listarCategorias();

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarProgramas", targetNamespace = "http://Servidor/", className = "Server.ListarProgramas")
    @ResponseWrapper(localName = "listarProgramasResponse", targetNamespace = "http://Servidor/", className = "Server.ListarProgramasResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarProgramasRequest", output = "http://Servidor/PublicadorServidorCentral/listarProgramasResponse")
    public Lista listarProgramas();

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns Server.DataEdicion
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "darDatosEdicion", targetNamespace = "http://Servidor/", className = "Server.DarDatosEdicion")
    @ResponseWrapper(localName = "darDatosEdicionResponse", targetNamespace = "http://Servidor/", className = "Server.DarDatosEdicionResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/darDatosEdicionRequest", output = "http://Servidor/PublicadorServidorCentral/darDatosEdicionResponse")
    public DataEdicion darDatosEdicion(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "conteneCurso", targetNamespace = "http://Servidor/", className = "Server.ConteneCurso")
    @ResponseWrapper(localName = "conteneCursoResponse", targetNamespace = "http://Servidor/", className = "Server.ConteneCursoResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/conteneCursoRequest", output = "http://Servidor/PublicadorServidorCentral/conteneCursoResponse")
    public boolean conteneCurso(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @return
     *     returns Server.Lista
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "listarProfesores", targetNamespace = "http://Servidor/", className = "Server.ListarProfesores")
    @ResponseWrapper(localName = "listarProfesoresResponse", targetNamespace = "http://Servidor/", className = "Server.ListarProfesoresResponse")
    @Action(input = "http://Servidor/PublicadorServidorCentral/listarProfesoresRequest", output = "http://Servidor/PublicadorServidorCentral/listarProfesoresResponse")
    public Lista listarProfesores();

}
