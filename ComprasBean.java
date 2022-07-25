package compras;

public class ComprasBean {
    
    private int id_compra;
    private String datacompra;
    private String formapag;
    private int qntdcompra;
    private int codigoprod;
    private int id_cliente;
   
    /**
     *
     * @param id_compra
     * @param datacompra
     * @param formapag
     * @param qntdcompra
     * @param codigoprod
     * @param id_cliente
     */
    public ComprasBean(int id_compra, String datacompra, String formapag, int qntdcompra, int codigoprod, int id_cliente) {
        this.id_compra= id_compra;
        this.datacompra = datacompra;
        this.formapag = formapag;
        this.qntdcompra= qntdcompra;
        this.codigoprod = codigoprod;
        this.id_cliente = id_cliente;
    }
 
     public int getId_Compra() {
         return id_compra;
     }
 
     public void setId_Compra(int id_compra) {
         this.id_compra = id_compra;
     }
 
     public String getDatacompra() {
         return datacompra;
     }
 
     public void setDatacompra(String datacompra) {
         this.datacompra = datacompra;
     }
 
     public String getFormapag() {
         return formapag;
     }
 
     public void setFormapag(String formapag) {
         this.formapag = formapag;
     }

     public int getQntdcompra() {
        return qntdcompra;
    }

    public void setQntdcompra(int qntdcompra) {
        this.qntdcompra = qntdcompra;
    }

    public int getCodigoprod() {
        return codigoprod;
    }

    public void setCodigoprod(int codigoprod) {
        this.codigoprod = codigoprod;
    }
    
    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

 
    /**
     *
     * @return
     */
    @Override
     public String toString(){
         return "id compra: "+id_compra+" Data da Compra: "+datacompra+" Forma de Pagamento: "+formapag+ 
                 "qntd de compra: " + qntdcompra + "qcodigo do produto: " + codigoprod + "id do cliente: " + id_cliente;
     }
 }