package heranca;

import java.text.NumberFormat;
import java.util.Locale;

public class Main {

    static void main(String[] args) {
        Locale brasil = new Locale("pt","BR");
        NumberFormat formatar = NumberFormat.getCurrencyInstance(brasil);
      // Locale brasil = new Locale("pt","BR");
      // NumberFormat formatar = NumberFormat.getCurrencyInstance(brasil);



// intanciação dos objetos (criação).
   Funcionario  f1 = new Funcionario();
   Aluno a1 = new Aluno();
   Professor p1 = new Professor();

   // Funcionario
   f1.setNome("Ricardo Santos");
   f1.setIdade(35);
   f1.setSetor("Segurança");
   f1.fazerAniversario();

   System.out.print(f1.getSetor()+ " " +f1.getNome()+" " +f1.getIdade()+" anos"); f1.statusTrabalhando();
   System.out.print("\n"+f1.getSetor()+ " " +f1.getNome()+" " +f1.getIdade()+" anos"); f1.statusTrabalhando();


   // Professor
    p1.setNome("prof. Galdino de Assis");
    p1.setIdade(57);
    p1.setEspecialidade("Ciências da computação");

    System.out.println("  -  -  -  -  -  -  -  -  -  - - - -  -  -  -  -    -   -   -   -   -   -   -  - \n ");
     System.out.println(p1.getNome()+" "+p1.getIdade()+" anos, especialista em "+p1.getEspecialidade()+" Salario: "+ formatar.format(p1.getSalario()));

     p1.receberAumento();
     p1.receberAumento();
     p1.receberAumento();

     System.out.println(p1.getNome()+" "+p1.getIdade()+" anos, especialista em "+p1.getEspecialidade()+" Salario: "+ formatar.format(p1.getSalario()));

    System.out.println("  -  -  -  -  -  -  -  -  -  - - - -  -  -  -  -    -   -   -   -   -   -   -  - \n ");
    a1.setNome("Lucas Mourão");
    a1.setIdade(18);
    a1.setCurso("Recursos Humanos");

    System.out.println(" Aluno: "+a1.getNome()+" "+a1.getIdade()+" anos, faz Graduação de "+a1.getCurso());
    System.out.print(" Status da 'Matricula:' "); a1.cancelarMatricula();




    }

}
