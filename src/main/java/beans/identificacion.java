/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author CenterSalud
 */
public class identificacion {
    
    private int id_identi;
    private String nombre;

    public identificacion(int id_identi, String nombre) {
        this.id_identi = id_identi;
        this.nombre = nombre;
    }

    public int getId_identi() {
        return id_identi;
    }

    public void setId_identi(int id_identi) {
        this.id_identi = id_identi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "identificacion{" + "id_identi=" + id_identi + ", nombre=" + nombre + '}';
    }
    
    
    
}
