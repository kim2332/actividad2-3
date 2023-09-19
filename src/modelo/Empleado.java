package modelo;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kimbe
 */
public class Empleado extends Persona {

    Conexion cn;
    private String codigo;
    private int id, idPuesto;

    public Empleado() {

    }

    public Empleado(String codigo, int id, int idPuesto, String nombres, String apellidos, String direccion, String telefono, String fechaNac) {
        super(nombres, apellidos, direccion, telefono, fechaNac);
        this.codigo = codigo;
        this.id = id;
        this.idPuesto = idPuesto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdPuesto() {
        return idPuesto;
    }

    public void setIdPuesto(int idPuesto) {
        this.idPuesto = idPuesto;
    }

    // CRUD
    @Override
    public void Agregar() {
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrirConexion();
            String query;
            query = "INSERT INTO empleados (Codigo, Nombres, Apellidos, Direccion, Telefono, Fecha_Nacimiento, Id_puesto) values (?,?,?,?,?,?,?);";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getCodigo());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, this.getFechaNac());
            parametro.setInt(7, this.getIdPuesto());
            int executar = parametro.executeUpdate();
            System.out.println(" Se inserto :" + Integer.toString(executar) + " Registro");
            cn.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println("Error:" + ex.getMessage());

        }
    }

    @Override
    public DefaultTableModel Leer() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.abrirConexion();
            String query;
            query = "SELECT e.Id_empleado as id ,e.Codigo ,e.Nombres ,e.Apellidos ,e.Direccion ,e.Telefono ,e.Fecha_Nacimiento ,concat(p.Id_puesto,') ',p.Puesto) as puesto FROM  empleados as e inner join puestos as p on e.Id_puesto = p.Id_puesto ;";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
            String encabezado[] = {"Id", "Codigo", "Nombres", "Apellidos", "Direccion", "Telefono", "Fecha_Nac", "Puesto"};
            tabla.setColumnIdentifiers(encabezado);
            String datos[] = new String[8];
            while (consulta.next()) {
                datos[0] = consulta.getString("id");
                datos[1] = consulta.getString("Codigo");
                datos[2] = consulta.getString("Nombres");
                datos[3] = consulta.getString("Apellidos");
                datos[4] = consulta.getString("Direccion");
                datos[5] = consulta.getString("Telefono");
                datos[6] = consulta.getString("Fecha_nacimiento");
                datos[7] = consulta.getString("Puesto");
                tabla.addRow(datos);
            }
            cn.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());

        }
        return tabla;
    }

    public DefaultComboBoxModel leer_puesto() {
        DefaultComboBoxModel combo = new DefaultComboBoxModel();
        try {
            cn = new Conexion();
            cn.abrirConexion();
            String query;
            query = "SELECT Id_puesto as id, Puesto FROM puestos";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(query);
            //combo.addElement("0) Elija Puesto");
            combo.addElement("0) Elija Puesto");
            while (consulta.next()) {
                combo.addElement(consulta.getString("id") + ") " + consulta.getString("Puesto"));
            }
            cn.cerrarConexion();

        } catch (SQLException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
        return combo;
    }

    @Override
    public void Actualizar() {
        try {
            PreparedStatement parametro;
            cn = new Conexion();
            cn.abrirConexion();
            String query;
            query = "UPDATE empleados set Codigo=?,Nombres=?,Apellidos=?,Direccion=?,Telefono=?,Fecha_Nacimiento=?,Id_puesto=? WHERE Id_empleado = ?;";
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
            parametro.setString(1, getCodigo());
            parametro.setString(2, getNombres());
            parametro.setString(3, getApellidos());
            parametro.setString(4, getDireccion());
            parametro.setString(5, getTelefono());
            parametro.setString(6, this.getFechaNac());
            parametro.setInt(7, this.getIdPuesto());
            parametro.setInt(8, getId());
            int executar = parametro.executeUpdate();
            System.out.println(" Se Actualizo :" + Integer.toString(executar) + " Registro");
            cn.cerrarConexion();
        } catch (SQLException ex) {
            System.out.println("Error:" + ex.getMessage());

        }
    }
    
    @Override
     public void Eliminar(){
      try{
          PreparedStatement parametro;
          cn = new Conexion ();
          cn.abrirConexion();
          String query;
          query = "DELETE FROM empleados where Id_empleado = ?;";
          parametro = (PreparedStatement) cn.conexionBD.prepareStatement(query);
          parametro.setInt(1, getId());
          int executar = parametro.executeUpdate();
          System.out.println(" Se Elimino :" + Integer.toString(executar) + " Registro" );
          cn.cerrarConexion();
      }catch(SQLException ex){
          System.out.println("Error:" + ex.getMessage());
      
      }
  }  

}
