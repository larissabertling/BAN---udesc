package supermercado;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;


public class SupermercadoModel {

    public static void create(SupermercadoBean s, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO supermercado (cnpj, nome, lotacaoMax, rua, num, bairro ) VALUES (?,?,?,?,?,?)");
            st.setInt(1, s.getCnpj());
            st.setString(2, s.getNome());
            st.setInt(3, s.getLotacaoMax());
            st.setString(4, s.getRua());
            st.setInt(5, s.getNum());
            st.setString(6, s.getBairro());
            st.execute();
            st.close();  
    }

    static HashSet listarSupermercado(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT cnpj, nome, lotacaoMax, rua, num, bairro FROM supermercado";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new SupermercadoBean(result.getInt(1), result.getString(2), result.getInt(3), result.getString(4), result.getInt(5), result.getString(6)));
            }
        return list;
    }
}
