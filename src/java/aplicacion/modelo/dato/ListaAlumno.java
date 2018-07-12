/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.modelo.dato;

import aplicacion.modelo.dominio.Alumno;
import java.util.ArrayList;

/**
 *
 * @author quint
 */
public class ListaAlumno {
    private ArrayList <Alumno> listaAlumno;

    public ListaAlumno(ArrayList<Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }

    public ListaAlumno() {
        listaAlumno=new ArrayList();
    }
    
     public void modificarAlumnos(Alumno unAlumno){
        for (Alumno a: listaAlumno){
            if (a.getDni()== unAlumno.getDni()){
                getListaAlumno().set(listaAlumno.indexOf(a), unAlumno);
                break;
            }
            
        }
    }
    
    public void eliminarAlumnos(Alumno unAuto){
        for(Alumno a:listaAlumno){
            if(a.getDni()==unAuto.getDni()){
                listaAlumno.remove(listaAlumno.indexOf(a));
                break;
            }
        }
    }

    /**
     * @return the listaAlumno
     */
    public ArrayList <Alumno> getListaAlumno() {
        return listaAlumno;
    }

    /**
     * @param listaAlumno the listaAlumno to set
     */
    public void setListaAlumno(ArrayList <Alumno> listaAlumno) {
        this.listaAlumno = listaAlumno;
    }
}
