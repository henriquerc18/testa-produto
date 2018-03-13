public class TestaProduto {
    public static void main (String args[]) {
        Produto p = new Produto();
        p.setCodigo(args[0]);
        p.setDescricao(args[1]);
        p.setCusto(Double.parseDouble(args[2]));
        p.setValor(Double.parseDouble(args[3]));
        p.mostraProduto();
        Produto p = new Produto();
        p.verificaMargem();
        if(!this.verificaMargem()){
            throw new IllegalArgumentException("Margem inferior à 20%");
        }
    }
}
