/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vendas;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


/**
 *
 * @author User
 */
public class VendasController {
    
    public void createVenda(Connection con) throws SQLException {
        Scanner input = new Scanner(System.in);
        System.out.println("Insira os seguintes dados para cadastrar uma nova venda: ");
        System.out.print("id da venda: ");
        int id_venda = input.nextInt();
        System.out.print("data da venda: ");
        String datavenda = input.nextLine();
        System.out.print("qntd de venda: ");
        int qntdvenda = input.nextInt();
        System.out.print("codigo do produto vendido: ");
        int codigoprod = input.nextInt();
        System.out.print("codigo da empresa fornecedora: ");
        int codEmpresa = input.nextInt();
        System.out.print("cnpj do supermercado: ");
        int cnpj = input.nextInt();
        
        VendasBean vb = new VendasBean(id_venda, datavenda, qntdvenda, codigoprod, codEmpresa, cnpj);
        VendasModel.create(vb, con);
        System.out.println("Venda cadastrada com sucesso!!");
    }

    void listarVendas(Connection con) throws SQLException {
        HashSet all = VendasModel.listarVendas(con);
        Iterator<VendasBean> it = all.iterator();
        while(it.hasNext()) {
            System.out.println(it.next().toString());
        }
    }
}

