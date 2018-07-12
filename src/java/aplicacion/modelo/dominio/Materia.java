/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dominio;

/**
 *
 * @author quint
 */
public class Materia {
    private String codigo;
    private String denominacion;
    private String carrera;
    private int añoCursado;

    public Materia() {
    }

    public Materia(String codigo, String denominacion, String carrera, int añoCursado) {
        this.codigo = codigo;
        this.denominacion = denominacion;
        this.carrera = carrera;
        this.añoCursado = añoCursado;
    }
    
    @Override
    public boolean equals(Object other){
        return(other instanceof Materia) && (codigo!=null)? codigo.equals(((Materia) other).codigo):(other==this);
    }
    
    @Override
    public int hashCode(){
        return(codigo!=null)? (this.getClass().hashCode()+codigo.hashCode()):super.hashCode();
    }
    
    @Override
    public String toString(){
        return String.format("%s",denominacion);
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the denominacion
     */
    public String getDenominacion() {
        return denominacion;
    }

    /**
     * @param denominacion the denominacion to set
     */
    public void setDenominacion(String denominacion) {
        this.denominacion = denominacion;
    }

    /**
     * @return the carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * @param carrera the carrera to set
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * @return the añoCursado
     */
    public int getAñoCursado() {
        return añoCursado;
    }

    /**
     * @param añoCursado the añoCursado to set
     */
    public void setAñoCursado(int añoCursado) {
        this.añoCursado = añoCursado;
    }
    
    
}
