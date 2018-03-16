public class TestaProduto {
    public static void main (String args[]) {
        Produto p1 = new Produto();
        p1.mostraProduto();

        Produto p2 = new Produto(args[0],args[1]) ;
        p2.mostraProduto();

        Produto p3 = new Produto(args[0], args[1], Double.parseDouble(args[2]), Double.parseDouble(args[3]));
        p3.mostraProduto();
    }
}
