package aulas;

import javax.swing.*;
import javax.swing.JOptionPane;
public class aula4 {

    static void main(String[] args) {

        Integer number = 1000; //usando integer
        System.out.println(number.toString().length());
        int number2 = 20000; //usnado primitivos
        System.out.println(Integer.toString(number2).length());

        // de String para numero
        // utilizando janela do java
        String n1 = JOptionPane.showInputDialog("Digite o primeiro Numero:");
        String n2 = JOptionPane.showInputDialog("Segundo numero:");
        System.out.println(n1+n2);

        //transformando a string em inteiros para a soma funcionar
        Integer nm1 = Integer.parseInt(n1);
        Integer nm2 = Integer.parseInt(n2);

        System.out.println(nm1+nm2);



    }

}
