package supermercado;

public class SupermercadoBean {
    private int cnpj;
    private String nome;
    private int lotacaoMax;
    private String rua;
    private int num;
    private String bairro;
    
    public SupermercadoBean(int cnpj, String nome, int lotacaoMax, String rua, int num, String bairro) {
        this.cnpj= cnpj;
        this.nome = nome;
        this.lotacaoMax = lotacaoMax;
        this.rua = rua;
        this.num =  num;
        this.bairro = bairro;
    }
 
     public int getCnpj() {
         return cnpj;
     }
 
     public void setCnpj(int cnpj) {
         this.cnpj = cnpj;
     }
 
     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }
 
     public int getLotacaoMax() {
         return lotacaoMax;
     }
 
     public void setLotacaoMax(int lotacaoMax) {
         this.lotacaoMax = lotacaoMax;
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

    /**
     *
     * @return
     */
    @Override
     public String toString(){
         return "cnpj: "+cnpj+" nome: "+nome+" lotacaoMax: "+lotacaoMax + "endereço:" + rua+num+bairro;
     }
 }