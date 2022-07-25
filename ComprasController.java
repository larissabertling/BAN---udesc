
package compras;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ComprasController {
    
    public void createCompra(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para cadastrar uma nova compra: ");
        System.out.print("id da compra: ");
        int id_compra = input.nextInt();
        System.out.print("data da compra: ");
        String datacompra = input.nextLine();
        System.out.print("forma de pagamento: ");
        String formapag = input.nextLine();
        System.out.print("qntd de compra: ");
        int qntdcompra = input.nextInt();
        System.out.print("codigo do produto comprado: ");
        int codigoprod = input.nextInt();
        System.out.print("id do cliente que comprou: ");
        int id_cliente = input.nextInt();
        
        ComprasBean cob = new ComprasBean(id_compra, datacompra, formapag, qntdcompra, codigoprod, id_cliente);
        ComprasModel.create(cob, con);
        System.out.println("Compra cadastrada com sucesso!!");
    }

    void listarCompras(Connection con) throws SQLException {
        HashSet all = ComprasModel.listarCompras(con);
        Iterator<ComprasBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

