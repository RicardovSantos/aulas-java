package treinamento.treinoHeranca;

public class Main {
    static void main(String[] args) {

                     // CARRO criação, declaração de atributos e chamar metodos de (Veiculo)-->(Carro)
    Carro c1 = new Carro(); // criação noco carro
    c1.setNome("Fox"); // atributos
    c1.setMarca("VW");

    System.out.println("\n    Motor --> "+c1.isMotor()+" e Arbags --> "+ c1.isAirbag()); // mostrando que estão desligados e desativados
    System.out.print(c1.getMarca()+" "+c1.getNome()+" ");c1.motorVirarChave();c1.statusArbags(); // ligando motor e arbags
    c1.acelerar();  // acelerando
    c1.motorVirarChave(); // test. tentando desligar,
    System.out.print(c1.getMarca()+" "+c1.getNome()+" velocidade atual "+c1.getAceleracao()+"Kms ");
    c1.motorVirarChave();
    c1.desacelerar();
    System.out.print(c1.getMarca()+" "+c1.getNome()+" velocidade atual "+c1.getAceleracao()+"Kms ");
    c1.motorVirarChave();

                   // MOTO criação, declaração de atributos e chamar metodos de (Veiculo)-->(moto)
    System.out.println("--------------------------- MOTO ----------------------------------");
    Moto moto1 = new Moto();
    moto1.setNome("Fazer");
    moto1.setMarca("Yamaha");
    moto1.colocarCapacete();

        System.out.println(moto1.getMarca()+" "+moto1.getNome()+" velocidade atual "+moto1.getAceleracao()+"Kms ");
        moto1.acelerar();
        moto1.motorVirarChave();
        moto1.acelerar();
        moto1.desacelerar();
        moto1.motorVirarChave();
        moto1.colocarCapacete();
        moto1.motorVirarChave();
        moto1.acelerar();
    }
}
