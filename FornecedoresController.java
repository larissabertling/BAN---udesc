package fornecedores;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class FornecedoresController {
    
    public void createFornecedor(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para cadastrar um novo Fornecedor: ");
        System.out.print("codEmpresa: ");
        int codEmpresa = input.nextInt();
        System.out.print("rua: ");
        String rua = input.nextLine();
        System.out.print("num: ");
        int num = input.nextInt();
        System.out.print("bairro: ");
        String bairro = input.nextLine();
        System.out.print("cidade: ");
        String cidade = input.nextLine();
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("cnpj: ");
        int cnpj = input.nextInt();
        FornecedoresBean ab = new FornecedoresBean(codEmpresa, rua, num, bairro, cidade, nome, cnpj);
        FornecedoresModel.create(ab, con);
        System.out.println("Fornecedor criado com sucesso!!");
    }

    public void listarFornecedores(Connection con) throws SQLException {
        HashSet all = FornecedoresModel.listarFornecedor(con);
        Iterator<FornecedoresBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
