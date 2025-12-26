package aulas;

import javax.swing.*;

public class exercicio1 {
    static void main(String[] args) {
        var nome = "Ricardo";
        var sal1 = JOptionPane.showInputDialog("Digite o Primeiro Salario: ");
        var sal2 = JOptionPane.showInputDialog("Digite o Primeiro Salario: ");
        var sal3 = JOptionPane.showInputDialog("Digite o Primeiro Salario: ");

        Double salario1 = Double.parseDouble(sal1);
        Double salario2 = Double.parseDouble(sal2);
        Double salario3 = Double.parseDouble(sal3);

        double media = (salario1+salario2+salario3)/3;

        System.out.printf(Double.toString(media).replace(".",","), media);


    }
}
