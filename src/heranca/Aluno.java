package heranca;

public class Aluno extends Pessoa{

    private String curso;
    private boolean matricula;

// metodo estado da matricula
    public void cancelarMatricula() {
        this.matricula = ! matricula;
        if (this.matricula) { System.out.println("Ativa");}
        else {System.out.println("Cancelada");}
    }
// Get & Set
    public String getCurso() {return curso;}
    public void setCurso(String curso) {this.curso=curso;}

    public boolean isMatricula() {return matricula;}
    public void setMatricula(boolean matricula) {this.matricula=matricula;}

}
