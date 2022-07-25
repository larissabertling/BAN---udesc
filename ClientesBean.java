package clientes;

import compras.ComprasBean;

public class ClientesBean {
    private int id;
    private String nome;
    private int cpf; 


    public ClientesBean(int id, String nome, int cpf) {
        this.nome= nome;
        this.cpf = cpf;
        this.id=id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    /**
     *
     * @return
     */
    @Override
    public String toString(){
        StringBuffer cb = new StringBuffer();
        cb.append("id+" + id+ "nome: "+ nome + "cpf: "+cpf);
        return cb.toString();
    }      

    void setId_Compra(ComprasBean co) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}

