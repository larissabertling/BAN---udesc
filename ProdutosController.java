package produtos;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ProdutosController {
    
    public void createProduto(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para a cadastrar um novo Produto: ");
        System.out.print("codigoProd: ");
        int codigoProd = input.nextInt();
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("qntd: ");
        int qntd = input.nextInt();
        System.out.print("valorUnit: ");
        float valorUnit = input.nextFloat();
        ProdutosBean pb = new ProdutosBean(codigoProd, nome, qntd, valorUnit);
        ProdutosModel.create(pb, con);
        System.out.println("Produto cadastrado com sucesso!!");
    }

    public void listarProdutos(Connection con) throws SQLException {
        HashSet all = ProdutosModel.listarProdutos(con);
        Iterator<ProdutosBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
