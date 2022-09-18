/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

/**
 *
 * @author CenterSalud
 */
public class medicamento {
    
    private int id;
    private String nombre;
    private  String via_admin;
    private String miligramo;

    public medicamento(int id, String nombre, String via_admin, String miligramo) {
        this.id = id;
        this.nombre = nombre;
        this.via_admin = via_admin;
        this.miligramo = miligramo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVia_admin() {
        return via_admin;
    }

    public void setVia_admin(String via_admin) {
        this.via_admin = via_admin;
    }

    public String getMiligramo() {
        return miligramo;
    }

    public void setMiligramo(String miligramo) {
        this.miligramo = miligramo;
    }

    @Override
    public String toString() {
        return "medicamento{" + "id=" + id + ", nombre=" + nombre + ", via_admin=" + via_admin + ", miligramo=" + miligramo + '}';
    }
    
    
}
