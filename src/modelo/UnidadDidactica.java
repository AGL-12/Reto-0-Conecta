/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
import utilidades.Utilidades;

import java.util.Map;
/**
 *
 * @author 2dam
 */
public class UnidadDidactica {
    
    private int id;
    private String acronimo;
    private String titulo;
    private String evaluacion;
    private String descripcion;
    private Map<Integer,Enunciado> enunciados;
    
    public UnidadDidactica(){
        
    }
    
    public UnidadDidactica(int id,String acronimo,String titulo,String evaluacion,String descripcion,Map<Integer,Enunciado> enunciados){
        this.id= id;
        this.acronimo=acronimo;
        this.titulo=titulo;
        this.evaluacion=evaluacion;
        this.descripcion=descripcion;
        this.enunciados=enunciados;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAcronimo() {
        return acronimo;
    }

    public void setAcronimo(String acronimo) {
        this.acronimo = acronimo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getEvaluacion() {
        return evaluacion;
    }

    public void setEvaluacion(String evaluacion) {
        this.evaluacion = evaluacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Map<Integer, Enunciado> getEnunciados() {
        return enunciados;
    }

    public void setEnunciados(Map<Integer, Enunciado> enunciados) {
        this.enunciados = enunciados;
    }

    @Override
    public String toString() {
        return "UnidadDidactica{" + "id=" + id + ", acronimo=" + acronimo + ", titulo=" + titulo + ", evaluacion=" + evaluacion + ", descripcion=" + descripcion + ", enunciados=" + enunciados + '}';
    }

   
}
