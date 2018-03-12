// teste
public class Produto{
    private String codigo = "";
    private String descricao = "";
    private double custo = 0.00; 
    private double valor = 0.00;

        public String getCodigo(){
            return codigo;
        }           
        public void setCodigo(String codigo){
            this.codigo = codigo;
        }        
        public String getDescricao(){
            return descricao;
        }
        public void setDescricao(String descricao){
            this.descricao = descricao;
        }
        public double getCusto(){
            return custo;
        } 
        public void setCusto(double custo){
            this.custo = custo;
        }        
        public double getValor(){
            return valor;
        }
        public void setValor(double valor){
            this.valor = valor;
        }  
        public void verificaaMargem(){
            double valorMargem = (120 * this.custo)/100;
            System.out.println("Valor margem: " + valorMargem);            
            if (this.valor >= valorMargem){
                System.out.println("Margem de 20%");
            } 
            else{
                System.out.println("Margem inferior à 20%");
            }
        }
        public boolean verificaMargem(){

            double valorMargem = (120 * this.custo)/100;

            if (this.valor >= valorMargem){
                return true;
            }else{
               return false;
            }
        }
        public void mostraProduto(){
            System.out.println("Dados do produto");
            System.out.println("Código: " + this.codigo);
            System.out.println("Descrição: " + this.descricao);
            System.out.println("Custo: " + this.custo);
            System.out.println("Valor: " + this.valor);
        }
}
