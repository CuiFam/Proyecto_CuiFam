/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author CenterSalud
 */
public class usuario {
    
    private int id_identi;
    private int id_usuario;
    private String nombre;
    private String apellidos;
    private int edad;
    private String sexo;
    private int telefono;
    private String direccion;

    public usuario(int id_identi, int id_usuario, String nombre, String apellidos, int edad, String sexo, int telefono, String direccion) {
        this.id_identi = id_identi;
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getId_identi() {
        return id_identi;
    }

    public void setId_identi(int id_identi) {
        this.id_identi = id_identi;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "usuario{" + "id_identi=" + id_identi + ", id_usuario=" + id_usuario + ", nombre=" + nombre + ", apellidos=" + apellidos + ", edad=" + edad + ", sexo=" + sexo + ", telefono=" + telefono + ", direccion=" + direccion + '}';
    }
    
    
    
    
    
}
