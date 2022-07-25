
package vendas;

public class VendasBean {
    
    private int id_venda;
    private String datavenda;
    private int qntdvenda;
    private int codigoprod;
    private int codEmpresa;
    private int cnpj;

    public VendasBean(int id_venda, String datavenda, int qntdvenda, int codigoprod, int codEmpresa, int cnpj) {
        this.id_venda= id_venda;
        this.datavenda = datavenda;
        this.qntdvenda = qntdvenda;
        this.codigoprod= codigoprod;
        this.codEmpresa = codEmpresa;
        this.cnpj = cnpj;
    }
 
     public int getId_Venda() {
         return id_venda;
     }
 
     public void SetId_venda(int id_venda) {
         this.id_venda = id_venda;
     }
 
     public String getDatavenda() {
         return datavenda;
     }
 
     public void setDatavenda(String datavenda) {
         this.datavenda = datavenda;
     }

     public int getQntdvenda() {
        return qntdvenda;
    }

    public void setQntdvenda(int qntdvenda) {
        this.qntdvenda = qntdvenda;
    }

    public int getCodigoprod() {
        return codigoprod;
    }

    public void setCodigoprod(int codigoprod) {
        this.codigoprod = codigoprod;
    }
    
    public int getCodEmpresa() {
        return codEmpresa;
    }

    public void setCodEmpresa(int codEmpresa) {
        this.codEmpresa = codEmpresa;
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
         return "id venda: "+id_venda+" Data da venda: "+datavenda+"qntd de venda: " + qntdvenda
                 + "codigo do produto: " + codigoprod + "codigo do fornecedor: " + codEmpresa + "cnpj do supermercado" + cnpj;
     }
 }