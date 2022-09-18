package test;

import beans.identificacion;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;

public class OperacionesBD {

    public static void main(String[] args) {

          //listaridentificacion ();
        actualizaridentificacion(4, "n");
    }

    public static void actualizaridentificacion(int id_identi, String nombre) {

        DBConnection con = new DBConnection();
        String sql = "UPDATE identificacion SET nombre= '" + nombre + "'where id_identi = " + id_identi;

        try {

            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {

            con.desconectar();
        }

    }

    public static void listaridentificacion() {

        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM identificacion; ";

        try {

            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                int id_identi = rs.getInt("id_identi");
                String nombre = rs.getString("nombre");

                identificacion identificacion = new identificacion(id_identi, nombre);
                System.out.println(identificacion.toString());

            }

            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        } finally {
            con.desconectar();
        }

    }

}
