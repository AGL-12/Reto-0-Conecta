/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Map;
import utilidades.Utilidades;

/**
 *
 * @author 2dam
 */
public class Enunciado {
    private int id;
    private String descripcion;
    private Nivel nivel;
    private boolean disponible;
    private String ruta;
    private Map <Integer,UnidadDidactica>unidadesDidacticas;

    public Enunciado() {
    }

    public Enunciado(int id, String descripcion, Nivel nivel, boolean disponible, String ruta,Map <Integer,UnidadDidactica>unidadesDidacticas) {
        this.id = id;
        this.descripcion = descripcion;
        this.nivel = nivel;
        this.disponible = disponible;
        this.ruta = ruta;
        this.unidadesDidacticas=unidadesDidacticas;
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

    public Nivel getNivel() {
        return nivel;
    }

    public void setNivel(Nivel nivel) {
        this.nivel = nivel;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public Map<Integer, UnidadDidactica> getUnidadesDidacticas() {
        return unidadesDidacticas;
    }

    public void setUnidadesDidacticas(Map<Integer, UnidadDidactica> unidadesDidacticas) {
        this.unidadesDidacticas = unidadesDidacticas;
    }

    @Override
    public String toString() {
        return "Enunciado{" + "id=" + id + ", descripcion=" + descripcion + ", nivel=" + nivel + ", disponible=" + disponible + ", ruta=" + ruta + ", unidadesDidacticas=" + unidadesDidacticas + '}';
    }

    
    
    
}
