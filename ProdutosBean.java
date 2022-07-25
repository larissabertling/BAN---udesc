package produtos;

public class ProdutosBean {
    private int codigoProd;
    private String nome;
    private int qntd;
    private float valorUnit;
    
    public ProdutosBean(int codigoProd, String nome, int qntd, float valorUnit) {
        this.codigoProd= codigoProd;
        this.nome = nome;
        this.qntd = qntd;
        this.valorUnit = valorUnit;
    }
 
     public int getCodigoProd() {
         return codigoProd;
     }
 
     public void setCodigoProd(int codigoProd) {
         this.codigoProd = codigoProd;
     }
 
     public String getNome() {
         return nome;
     }

     public void setNome(String nome) {
         this.nome = nome;
     }

     public int getQntd() {
         return qntd;
     }

     public void setQntd(int qntd) {
         this.qntd = qntd;
     }

     public float getValorUnit() {
        return valorUnit;
    }

    public void setValorUnit(float valorUnit) {
        this.valorUnit = valorUnit;
    }
    
    /**
     *
     * @return
     */
    @Override
     public String toString(){
         return "codigoProd: "+codigoProd+" nome: "+nome+" qntd: "+qntd+ "valorUnit: " + valorUnit;
     }
 }