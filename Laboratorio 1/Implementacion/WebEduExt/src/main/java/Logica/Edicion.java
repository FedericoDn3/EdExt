/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import DataTypes.DataEdicion;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Agustin
 */
public class Edicion extends HttpServlet {

    private Fabrica fab = Fabrica.getInstance();
    private ISistema is = fab.getISistema();

    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/plain");
        PrintWriter out = response.getWriter();

        String action = request.getParameter("action");
        if (action != null) {
            if (action.equals("validarNombreEdicion")) {
                String nombre = request.getParameter("nombre");
                if (nombre != null) {
                    String curso = request.getParameter("curso");
                    if (curso != null) {
                        Boolean valido = is.validarNombreEdicion(curso, nombre);
                        out.println(valido);
                    }
                }
            }
        }
        
        String consultarEdicion = request.getParameter("consultarEdicion");
        if(consultarEdicion != null){
            String nombre = null;
            String curso = null;
            String[] datos = null;
            try {
                datos = consultarEdicion.split(",");
                curso = datos[0];
                nombre = datos[1];
            } catch (Exception e) {
            }
            if(nombre != null && curso != null){
                DataEdicion de = is.darDatosEdicion(curso, nombre);
                request.setAttribute("datosEdicion", de);
                request.getRequestDispatcher("mostrarInfoEdicion.jsp").forward(request, response);
            }
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String accion = request.getParameter("accion");
        if (accion != null && accion.equals("altaEdicion")) {
            String instituto = request.getParameter("instituto");
            if (instituto != null) {
                String curso = request.getParameter("curso");
                if (curso != null) {
                    String nombre = request.getParameter("nombre");
                    if (nombre != null && is.validarNombreEdicion(curso, nombre)) {
                        String cupo = request.getParameter("cupos");
                        int cupos = 0;
                        if (!cupo.equals("")) {
                            cupos = Integer.parseInt(cupo);
                        }

                        String fecha1 = request.getParameter("fechaini");
                        String fecha2 = request.getParameter("fechafin");
                        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
                        Date fechaIni = null;
                        Date fechaFin = null;
                        try {
                            fechaIni = formato.parse(fecha1);
                            fechaFin = formato.parse(fecha2);
                        } catch (Exception e) {
                        }

                        String[] profs = request.getParameterValues("profesores");
                        List<String> profesores = new ArrayList();
                        if (profs != null) {
                            profesores = Arrays.asList(profs);
                        }

                        DataEdicion de = new DataEdicion(nombre, fechaIni, fechaFin, cupos, new Date(), profesores);
                        is.altaEdicionCurso(de, curso);
                    }
                }
            }
            response.sendRedirect("altaEdicion.jsp");
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
