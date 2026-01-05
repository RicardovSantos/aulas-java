package heranca;

public class Professor extends Pessoa {

    private String especialidade;
    private double salario = 7000.0;

    public Professor() {}

    public void receberAumento() {
        this.salario += 500.0;
        System.out.println("aumento de 500,00 'novo Salario:' "+this.salario);
    }

    public String getEspecialidade() {return especialidade;}
    public void setEspecialidade(String especialidade) {this.especialidade=especialidade;}

    public double getSalario() {return  salario;}
    public void setSalario(float salario) {this.salario=salario;}

}
