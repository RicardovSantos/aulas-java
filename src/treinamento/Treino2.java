package treinamento;

public class Treino2 {

    public static class Produto{
        String nome;
        double preco;
        int quantidadeEstoque;

        public Produto(String nome,double preco) {
            this.nome = nome;
            this.preco = preco;
            this.quantidadeEstoque = 0;
        }

        void adicionarEstoque(int qtd){
            this.quantidadeEstoque += qtd;
            System.out.println("Adicionado "+qtd+" "+this.nome+" ao estoque.");
        }
        void vendaProduto(int qtd){
          if (this.quantidadeEstoque>=qtd){
              this.quantidadeEstoque -= qtd;
              System.out.println(" "+qtd+" unidades vendidas do "+this.nome);

          }else {
              System.out.println(" Estoque insulficiente: "+this.quantidadeEstoque+"\n !!Operação cancelada!!");
          }
        }
        double calcularValorTotal(){
            double valorTotal = this.quantidadeEstoque * this.preco;
            return valorTotal;
        }
        void patrimonio(){
            System.out.println(" Nome: "+this.nome+"\n QTD: "+this.quantidadeEstoque+"\n Valor do estoque: "+this.calcularValorTotal());
        }
    }

    static void main(String[] args) {

        System.out.println("------------------- Criado ------------------------");
        Produto produto1 = new Produto("Notebook intel i5",3.500);

        System.out.println(" Nome: "+produto1.nome+"\n Preço: "+produto1.preco+"\n QTD: "+produto1.quantidadeEstoque);

        System.out.println("\n\n ------------------- Adicionando ------------------------");
        produto1.adicionarEstoque(10);

        System.out.println("\n\n ------------------- Patrimônio ------------------------");
        produto1.patrimonio();

        System.out.println("\n\n ------------------- Venda ------------------------");
        produto1.vendaProduto(5);

        System.out.println("\n\n ------------------- erro ------------------------");
        produto1.vendaProduto(10);

        System.out.println("\n\n ------------------- venda ------------------------");
        produto1.vendaProduto(2);

        System.out.println("\n\n ------------------- Patrimônio ------------------------");
        produto1.patrimonio();
    }
}
