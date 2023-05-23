import java.util.ArrayList;

public class ProdutoTeste {
    public static void main(String[] args) {

        ArrayList<Produto> carrinho = new ArrayList<>();

        Mouse mouse1 = new Mouse("Mouse optico, Saida USB. 1.600 dpi", "Optico");
        mouse1.setNomeLoja("Loja A");
        mouse1.setPreco(29.99);
        carrinho.add(mouse1);

        Mouse mouse2 = new Mouse("Mouse Multilaser com fio, USB. M00225", "Laser ergonomico");
        mouse2.setNomeLoja("Loja B");
        mouse2.setPreco(20.89);
        carrinho.add(mouse2);

        Mouse mouse3 = new Mouse("Mouse Gamer 3200DPI Combo Mouse Pad 6 Botoes Multilaser", "Gamer");
        mouse3.setNomeLoja("Loja C");
        mouse3.setPreco(54.00);
        carrinho.add(mouse3);

        Livro livro1 = new Livro("Jogos Vorazes, 2008", "Suzanne Collins");
        livro1.setNomeLoja("Loja D");
        livro1.setPreco(32.99);
        carrinho.add(livro1);

        Livro livro2 = new Livro("Os Miseráveis, 1862", "Victor Hugo");
        livro2.setNomeLoja("Loja E");
        livro2.setPreco(112.17);
        carrinho.add(livro2);

        Livro livro3 = new Livro("O Codigo Da Vinci, 2004", "Dan Brown");
        livro3.setNomeLoja("Loja F");
        livro3.setPreco(40.40);
        carrinho.add(livro3);

        Livro livro4 = new Livro("Um estudo em vermelho, 1887", "Arthur Conan Doyle");
        livro4.setNomeLoja("Loja G");
        livro4.setPreco(57.99);
        carrinho.add(livro4);

        for(Produto produto : carrinho) {
            System.out.println(produto.getDescricao());
            System.out.println("Nome da loja: " + produto.getNomeLoja());
            System.out.println("Preco: R$" + produto.getPreco());
        }

    }
}
