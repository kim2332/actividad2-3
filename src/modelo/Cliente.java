package modelo;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;

/**
 *
 * @author kimbe
 */
public class Cliente extends Persona {

    private int id;
    private String nit;
    Conexion cn;

    public Cliente() {

    }

    public Cliente(int id, String nit, String nombres, String apellidos, String direccion, String telefono, String fechaNac) {
        super(nombres, apellidos, direccion, telefono, fechaNac);
        this.nit = nit;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public void Agregar() {
        try {
            PreparedStatement parametro;
            String querty = "";
            querty = "INSERT INTO clientes(Nit, Nombres, Apellidos, Direccion, Telefono, Fecha_Nacimiento) VALUES(?,?,?,?,?,?)";
            cn = new Conexion();
            cn.abrirConexion();
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setString(1, this.getNit());
            parametro.setString(2, this.getNombres());
            parametro.setString(3, this.getApellidos());
            parametro.setString(4, this.getDireccion());
            parametro.setString(5, this.getTelefono());
            parametro.setString(6, this.getFechaNac());

            int ejecutar = parametro.executeUpdate();
            cn.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Total de Registros " + Integer.toString(ejecutar), "Agregar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el registro a la base de datos" + e.getMessage());
        }
    }

    @Override
    public DefaultTableModel Leer() {
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            cn = new Conexion();
            cn.abrirConexion();
            String querty = "";
            querty = "SELECT Id_Cliente, Nit, Nombres, Apellidos, Direccion, Telefono, Fecha_Nacimiento FROM clientes";
            ResultSet consulta = cn.conexionBD.createStatement().executeQuery(querty);
            //Construir tabla
            String campos[] = {"Id", "Nit", "Nombres", "Apellidos", "Direccion", "Telefono", "Fecha_Nac"};
            tabla.setColumnIdentifiers(campos);

            //registros
            String registros[] = new String[7];
            while (consulta.next()) {
                registros[0] = consulta.getString("Id_Cliente");
                registros[1] = consulta.getString("Nit");
                registros[2] = consulta.getString("Nombres");
                registros[3] = consulta.getString("Apellidos");
                registros[4] = consulta.getString("Direccion");
                registros[5] = consulta.getString("Telefono");
                registros[6] = consulta.getString("Fecha_Nacimiento");
                tabla.addRow(registros);
            }
            cn.cerrarConexion();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se realizo la consulta" + e.getMessage());
        }
        return tabla;
    }

    @Override
    public void Actualizar() {
        try {
            PreparedStatement parametro;
            String querty = "";
            querty = "UPDATE clientes SET Nit = ?, Nombres = ?, Apellidos = ?, Direccion = ?, Telefono = ?, Fecha_Nacimiento = ?"
                    + "WHERE Id_cliente = ?";
            cn = new Conexion();
            cn.abrirConexion();
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setString(1, this.getNit());
            parametro.setString(2, this.getNombres());
            parametro.setString(3, this.getApellidos());
            parametro.setString(4, this.getDireccion());
            parametro.setString(5, this.getTelefono());
            parametro.setString(6, this.getFechaNac());
            parametro.setInt(7, this.getId());

            int ejecutar = parametro.executeUpdate();
            cn.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Se Actualizo" + Integer.toString(ejecutar) + " Registro", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el registro a la base de datos" + e.getMessage());
        }
    }

    @Override
    public void Eliminar() {
        try {
            PreparedStatement parametro;
            String querty = "";
            querty = "DELETE FROM clientes WHERE Id_cliente = ? ";

            cn = new Conexion();
            cn.abrirConexion();
            parametro = (PreparedStatement) cn.conexionBD.prepareStatement(querty);
            parametro.setInt(1, this.getId());

            int ejecutar = parametro.executeUpdate();
            cn.cerrarConexion();
            JOptionPane.showMessageDialog(null, "Se Elimino " + Integer.toString(ejecutar) + " Registro", "Actualizar", JOptionPane.INFORMATION_MESSAGE);
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al agregar el registro a la base de datos" + e.getMessage());
        }
    }

}
