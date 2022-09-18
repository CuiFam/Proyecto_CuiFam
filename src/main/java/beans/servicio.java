/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import java.sql.Date;


/*
 *
 * @author CenterSalud
 */
public class servicio {
    private int id_servicio;
    private String nombre;
    private String observaciones;
    private Date fecha_ini;
    private Date fecha_fin;
    private String medi_ordenado;
    private int id_medi;
    private int id_usuario;

    public servicio(int id_servicio, String nombre, String observaciones, Date fecha_ini, Date fecha_fin, String medi_ordenado, int id_medi, int id_usuario) {
        this.id_servicio = id_servicio;
        this.nombre = nombre;
        this.observaciones = observaciones;
        this.fecha_ini = fecha_ini;
        this.fecha_fin = fecha_fin;
        this.medi_ordenado = medi_ordenado;
        this.id_medi = id_medi;
        this.id_usuario = id_usuario;
    }

    public int getId_servicio() {
        return id_servicio;
    }

    public void setId_servicio(int id_servicio) {
        this.id_servicio = id_servicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Date getFecha_ini() {
        return fecha_ini;
    }

    public void setFecha_ini(Date fecha_ini) {
        this.fecha_ini = fecha_ini;
    }

    public Date getFecha_fin() {
        return fecha_fin;
    }

    public void setFecha_fin(Date fecha_fin) {
        this.fecha_fin = fecha_fin;
    }

    public String getMedi_ordenado() {
        return medi_ordenado;
    }

    public void setMedi_ordenado(String medi_ordenado) {
        this.medi_ordenado = medi_ordenado;
    }

    public int getId_medi() {
        return id_medi;
    }

    public void setId_medi(int id_medi) {
        this.id_medi = id_medi;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    @Override
    public String toString() {
        return "servicio{" + "id_servicio=" + id_servicio + ", nombre=" + nombre + ", observaciones=" + observaciones + ", fecha_ini=" + fecha_ini + ", fecha_fin=" + fecha_fin + ", medi_ordenado=" + medi_ordenado + ", id_medi=" + id_medi + ", id_usuario=" + id_usuario + '}';
    }

    
    
}
