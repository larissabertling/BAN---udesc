package fornecedores;

public class FornecedoresBean {
    private int codEmpresa;
    private String rua;
    private int num;
    private String bairro;
    private String cidade;
    private String nome;
    private int cnpj;
    
    public FornecedoresBean(int codEmpresa, String rua, int num, String bairro, String cidade, String nome, int cnpj) {
        this.codEmpresa= codEmpresa;
        this.rua = rua;
        this.num = num;
        this.bairro= bairro;
        this.cidade = cidade;
        this.nome = nome;
        this.cnpj = cnpj;
    }
 
     public int getCodEmpresa() {
         return codEmpresa;
     }
 
     public void setCodEmpresa(int codEmpresa) {
         this.codEmpresa = codEmpresa;
     }
 
     public String getRua() {
         return rua;
     }
 
     public void setRua(String rua) {
         this.rua = rua;
     }
 
     public int getNum() {
         return num;
     }
 
     public void setNum(int num) {
         this.num = num;
     }

     public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCnpj() {
        return cnpj;
    }

    public void setCnpj(int cnpj) {
        this.cnpj = cnpj;
    }

    /**
     *
     * @return
     */
    @Override
     public String toString(){
         return "Nome: "+nome+" codEmpresa: "+codEmpresa+" endereço: "+rua+num+bairro+cidade+ "cnpj: " + cnpj;
     }
 }