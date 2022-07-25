package supermercado;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class SupermercadoController {
    
    public void createSupermercado(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a criar um novo Supermercado: ");
        System.out.print("cnpj: ");
        int cnpj = input.nextInt();
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("lotacaoMax: ");
        int lotacaoMax = input.nextInt();
        System.out.print("rua: ");
        String rua = input.nextLine();
        System.out.print("num: ");
        int num = input.nextInt();
        System.out.print("bairro: ");
        String bairro = input.nextLine();
        SupermercadoBean sb = new SupermercadoBean(cnpj, nome, lotacaoMax, rua, num, bairro);
        SupermercadoModel.create(sb, con);
        System.out.println("Supermercado criado com sucesso!!");
    }

    void listarSupermercado(Connection con) throws SQLException {
        HashSet all = SupermercadoModel.listarSupermercado(con);
        Iterator<SupermercadoBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
