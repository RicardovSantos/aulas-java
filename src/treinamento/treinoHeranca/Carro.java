package treinamento.treinoHeranca;

public class Carro extends Automovel {
    private boolean airbag = false;

    public void statusArbags() {
        airbag = ! airbag;
        if (airbag) {System.out.println(" Arbags acionados");}
        else { System.out.println("Airbags não ativos, por segurança ligue-os!");}
    }

    public boolean isAirbag() {return  airbag;}
    public void setAirbag(boolean airbag) {this.airbag = airbag;}

}
