import java.sql.Connection;
import java.sql.SQLException;
import java.util.Scanner;
import produtos.ProdutosController;
import fornecedores.FornecedoresController;
import clientes.ClientesController;
import vendas.VendasController;
import compras.ComprasController;

public class Menu {
    public static void main(String[] args) throws SQLException {
        Conexao c = new Conexao();
        try (Connection con = c.getConnection()) {
            int op = 0;
            
            do{
                op = menu();
                try {
                    switch (op) {
                        case 1: new ProdutosController().createProduto(con);
                        break;
                        case 2: new FornecedoresController().createFornecedor(con);
                        break;
                        case 3: new ClientesController().createCliente(con);
                        break;
                        case 4: new ComprasController().createCompra(con);
                        break;
                        case 5: new VendasController().createVenda(con);
                        break;
                        case 6: new ProdutosController().listarProdutos(con);
                        break;
                        case 7: new FornecedoresController().listarFornecedores(con);
                        break;
                        case 8: new ClientesController().listarClientesComCompras(con);
                        
                    }
                    
                }catch(SQLException ex) {
                    System.out.println(ex.getMessage());
                }
            } while(op>0 && op<8);
        }
    }    

    private static int menu() {
        System.out.println("");
        System.out.println("Informe o número da opção que desejas executar: ");
        System.out.println("1 - Inserir um novo produto");
        System.out.println("2 - Inserir um novo fornecedor");
        System.out.println("3 - Inserir um novo cliente");
        System.out.println("4 - Inserir uma nova venda");
        System.out.println("5 - Inserir uma nova compra");
        System.out.println("6 - Exibir todos os produtos");
        System.out.println("7 - Exibir todos os forncedores");
        System.out.println("8 - Exibir o cliente e sua respectiva compra");
        System.out.println("Digite qualquer outro valor para sair");
        System.out.print("Sua opção: ");
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
}

