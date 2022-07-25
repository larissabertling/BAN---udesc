package clientes;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


public class ClientesController {
    
    public void createCliente(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para cadastrar um novo Cliente: ");
        System.out.print("id: ");
        int id = input.nextInt();
        System.out.print("nome: ");
        String nome = input.nextLine();
        System.out.print("cpf: ");
        int cpf = input.nextInt();
        ClientesBean cb = new ClientesBean(id, nome, cpf);
        ClientesModel.create(cb, con);
        System.out.println("Cliente cadastrado com sucesso!!");
    }

    /**
     *
     * @param con
     * @throws SQLException
     */
    public void listarClientes(Connection con) throws SQLException {
        HashSet all = ClientesModel.listarClientes(con);
        Iterator<ClientesBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}
