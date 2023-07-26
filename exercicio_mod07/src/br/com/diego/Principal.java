package br.com.diego;


import javax.print.attribute.standard.Media;
public class Principal { // Classe principal para execução do método de cálculo dá média aritmetica

    public int soma(int num1, int num2) {
        return num1 + num2;
    }

    /**
     *
     * @param args
     */
    public static void main(String args[]) {

        MediaAritmetica resultado = new MediaAritmetica();
        System.out.println("A média aritmética é: " + resultado.calculoMediaAritmetica(10, 7, 8));
        Principal soma = new Principal();
        System.out.println(soma.soma(10, 20));
    }
}
