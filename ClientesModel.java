package clientes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import compras.ComprasBean;


public class ClientesModel {

    static void create(ClientesBean c, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO clientes (id, nome, cpf"
                    + "VALUES (?,?,?)");
            st.setInt(1, c.getId());
            st.setString(2, c.getNome());
            st.setInt(3, c.getCpf());
            st.execute();
            st.close();
    }

    static HashSet listarClientes(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT id, nome, cpf";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new ClientesBean(result.getInt(1), result.getString(2), result.getInt(3)));
            }
        return list;
    }    

    public static HashSet listarClientesComCompras(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
        st = con.createStatement();
        String sql = "SELECT id, nome, cpf, qntdCompra, formaPag, idcompra, dataCompra FROM clientes NATURAL JOIN compras";
        ResultSet result = st.executeQuery(sql);
        while(result.next()) {
            ClientesBean cb = new ClientesBean(result.getInt(1), result.getString(2), result.getInt(3));
            ComprasBean co = new ComprasBean(result.getInt(4), result.getString(5), result.getString(6), result.getInt(6), result.getInt(6), result.getInt(7));
            cb.setId_Compra(co);
            list.add(cb);
        }
        return list;
    }
    
}
