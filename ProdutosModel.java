package produtos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutosModel {

    public static void create(ProdutosBean p, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO produtos (codigoProd, nome, qntd, valorUnit) VALUES (?,?,?,?)");
            st.setInt(1, p.getCodigoProd());
            st.setString(2, p.getNome());
            st.setInt(3, p.getQntd());
            st.setFloat(4, p.getValorUnit());
            st.execute();
            st.close();  
    }

    static HashSet listarProdutos(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codigoProd, nome, qntd, valorUnit FROM produtos";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new ProdutosBean(result.getInt(1), result.getString(2), result.getInt(3), result.getFloat(4)));
            }
        return list;
    }
}
