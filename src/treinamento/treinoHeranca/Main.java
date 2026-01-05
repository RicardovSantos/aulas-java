package treinamento.treinoHeranca;

public class Main {
    static void main(String[] args) {

    Carro c1 = new Carro();
    c1.setNome("Fox");
    c1.setMarca("VW");
    System.out.println(" motor "+c1.isMotor()+" e arbags "+ c1.isAirbag());
    System.out.print(c1.getMarca()+" "+c1.getNome()+" ");c1.motorVirarChave();c1.statusArbags();
    c1.acelerar();
    c1.acelerar();
    c1.acelerar();
    c1.motorVirarChave();
    System.out.print(c1.getMarca()+" "+c1.getNome()+" velocidade atual "+c1.getAceleracao()+"Kms ");
    c1.motorVirarChave();
        c1.desacelerar();
        c1.desacelerar();
        c1.desacelerar();
    System.out.print(c1.getMarca()+" "+c1.getNome()+" velocidade atual "+c1.getAceleracao()+"Kms ");
    c1.motorVirarChave();
    c1.motorVirarChave();
    c1.acelerar();
    c1.motorVirarChave();
    c1.motorVirarChave();

    }
}
