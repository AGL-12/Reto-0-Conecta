/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.time.LocalDate;
import java.util.Date;
import utilidades.Utilidades;

/**
 *
 * @author 2dam
 */
public class ConvocatoriaExamen {
    private int id;
    private String descripcion;
    private Date fecha;
    private String curso;
   

    public ConvocatoriaExamen() {
    }

    public ConvocatoriaExamen(int id, String descripcion, Date fecha, String curso) {
        this.id = id;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.curso = curso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "ConvocatoriaExamen{" + "id=" + id + ", descripcion=" + descripcion + ", fecha=" + fecha + ", curso=" + curso + '}';
    }
    
    
    
}
