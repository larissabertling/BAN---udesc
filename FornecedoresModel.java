package fornecedores;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;


public class FornecedoresModel {

    public static void create(FornecedoresBean f, Connection con) throws SQLException {
        PreparedStatement st;
            st = con.prepareStatement("INSERT INTO fornecedores (codEmpresa, rua, num, bairro, cidade, nome, cnpj) VALUES (?,?,?,?,?,?,?)");
            st.setInt(1, f.getCodEmpresa());
            st.setString(2, f.getRua());
            st.setInt(3, f.getNum());
            st.setString(4, f.getBairro());
            st.setString(5, f.getCidade());
            st.setString(6, f.getNome());
            st.setInt(7, f.getCnpj());
            st.execute();
            st.close();  
    }

    static HashSet listarFornecedor(Connection con) throws SQLException {
        Statement st;
        HashSet list = new HashSet();
            st = con.createStatement();
            String sql = "SELECT codEmpresa, rua, num, bairro, cidade, nome, cnpj FROM fornecedores";
            ResultSet result = st.executeQuery(sql);
            while(result.next()) {
                list.add(new FornecedoresBean(result.getInt(1), result.getString(2), result.getInt(3), result.getString(4), result.getString(5), result.getString(6), result.getInt(7)));
            }
        return list;
    }
}
