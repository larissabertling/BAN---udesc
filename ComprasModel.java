
package compras;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class ComprasModel {


    public static void create(ComprasBean cob, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO compras (id_compra, data compra, formapag, qntdcompra, id_cliente, codigoprod) VALUES (?,?,?,?,?,?)");
            st.setInt(1, cob.getId_Compra());
            st.setString(2, cob.getDatacompra());
            st.setString(3, cob.getFormapag());
            st.setInt(4, cob.getQntdcompra());
            st.setInt(5, cob.getId_cliente());
            st.setInt(6, cob.getCodigoprod());
            st.execute();
            st.close();  
    }

    static HashSet listarCompras(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codEmpresa, rua, num, bairro, cidade, nome, cnpj FROM fornecedores";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new ComprasBean(result.getInt(1), result.getString(2), result.getString(3), result.getInt(4), result.getInt(5), result.getInt(6)));
            }
        return list;
    }
}
