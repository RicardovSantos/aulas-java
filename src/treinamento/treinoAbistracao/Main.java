package treinamento.treinoAbistracao;

public class Main {

    static void main(String[] args) {

        System.out.println("-------------------- Marinho --------------------------");
        Marinho m1 = new Marinho();
        m1.setNome("Golfinho");
        m1.respirar();
        m1.setNadadeiras(3);
        m1.movimentar();
        System.out.print("Animal Marinho "+m1.getNome()+" tem "+m1.getNadadeiras()+" nadadeiras e respira ");m1.respirar();

        System.out.println("-------------------- Terrestre --------------------------");

        Terrestre t1 = new Terrestre();
        t1.setNome("Leão da Africa");
        t1.setPatas(4);
        t1.movimentar();
        t1.respirar();
        System.out.print("Animal Terrestre "+t1.getNome()+" tem "+t1.getPatas()+" patas e respira ");t1.respirar();



    }
}
