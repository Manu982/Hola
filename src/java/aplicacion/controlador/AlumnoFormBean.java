/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.controlador;

import aplicacion.modelo.dato.ListaAlumno;
import aplicacion.modelo.dominio.Alumno;
import aplicacion.modelo.dominio.Materia;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author quint
 */
@ManagedBean
@ViewScoped
public class AlumnoFormBean {
private Alumno unAlumno;
    private ListaAlumno listaAlumnos;
    private int dni;
    private int telefono;
    private String nombre;
    private String apellido;
    private String domicilio;
    private Date fechaNacimiento;
    private Materia unaMateria;
    private ArrayList <Materia> listaMaterias;

    public AlumnoFormBean() {
        listaAlumnos=new ListaAlumno();
        listaMaterias=new ArrayList();
        listaMaterias.add(new Materia("123","Matematica","APU",3));
        listaMaterias.add(new Materia("132","Ingles","APU",2));
        listaMaterias.add(new Materia("322","LSO I","APU",1));
    }
    
    public void cargarAlumno() throws ParseException{
    setUnAlumno(new Alumno(getDni(), getTelefono(), getApellido(), getNombre(), getFechaNacimiento(), getDomicilio(), getUnaMateria()));
    getListaAlumnos().getListaAlumno().add(getUnAlumno());
    FacesMessage message=new FacesMessage("El alumno "+getUnAlumno().getApellido()+" fue agregado exitosamente");
        FacesContext.getCurrentInstance().addMessage(null, message);
    }
    
    public void establecerAlumno(Alumno unAlumno){
        setUnAlumno(unAlumno);
}
 
    public void modificarAlumno(){
        getListaAlumnos().modificarAlumnos(getUnAlumno());
    }
    
    public void eliminarAlumno(){
        getListaAlumnos().eliminarAlumnos(getUnAlumno());
    }

    /**
     * @return the unAlumno
     */
    public Alumno getUnAlumno() {
        return unAlumno;
    }

    /**
     * @param unAlumno the unAlumno to set
     */
    public void setUnAlumno(Alumno unAlumno) {
        this.unAlumno = unAlumno;
    }

    /**
     * @return the listaAlumnos
     */
    public ListaAlumno getListaAlumnos() {
        return listaAlumnos;
    }

    /**
     * @param listaAlumnos the listaAlumnos to set
     */
    public void setListaAlumnos(ListaAlumno listaAlumnos) {
        this.listaAlumnos = listaAlumnos;
    }

    /**
     * @return the dni
     */
    public int getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(int dni) {
        this.dni = dni;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the fechaNacimiento
     */
    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the unaMateria
     */
    public Materia getUnaMateria() {
        return unaMateria;
    }

    /**
     * @param unaMateria the unaMateria to set
     */
    public void setUnaMateria(Materia unaMateria) {
        this.unaMateria = unaMateria;
    }

    /**
     * @return the listaMaterias
     */
    public ArrayList <Materia> getListaMaterias() {
        return listaMaterias;
    }

    /**
     * @param listaMaterias the listaMaterias to set
     */
    public void setListaMaterias(ArrayList <Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
    
}
