package modelo;

import javax.swing.table.DefaultTableModel;

abstract class Persona {

    private String nombres;
    private String apellidos;
    private String direccion;
    private String telefono;
    private String fechaNac;

    //Metodo constructor vacio
    public Persona() {

    }

    //Metodo constructor con parametros
    public Persona(String nombres, String apellidos, String direccion, String telefono, String fechaNac) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.telefono = telefono;
        this.fechaNac = fechaNac;
    }

    //Getters and Setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(String fechaNac) {
        this.fechaNac = fechaNac;
    }
    
    // CRUD
    public void Agregar(){
    }
    public DefaultTableModel Leer(){
        return null;
    }
    public void Actualizar(){
    }
    public void Eliminar(){
    }
    

}
