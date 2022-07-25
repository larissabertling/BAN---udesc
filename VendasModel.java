
package vendas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;

public class VendasModel {


    public static void create(VendasBean vb, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO vendas (id_venda, datavenda, qntdvenda, codigoprod, codEmpresa, cnpj) VALUES (?,?,?,?,?,?)");
            st.setInt(1, vb.getId_Venda());
            st.setString(2, vb.getDatavenda());
            st.setInt(3, vb.getQntdvenda());
            st.setInt(4, vb.getCodigoprod());
            st.setInt(5, vb.getCodEmpresa());
            st.setInt(6, vb.getCnpj());
            st.execute();
            st.close();  
    }

    static HashSet listarVendas(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT id_venda, datavenda, qntdvenda, codigoprod, codEmpresa, cnpj";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new VendasBean(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), result.getInt(5), result.getInt(6)));
            }
        return list;
    }
}
