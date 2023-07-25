package br.com.diego;


import javax.print.attribute.standard.Media;
public class Principal { // Classe principal para execução do método de cálculo dá média aritmetica

    /**
     *
     * @param args
     */
    public static void main(String args[]) {

        MediaAritmetica resultado = new MediaAritmetica();
        System.out.println("A média aritmética é: " + resultado.calculoMediaAritmetica(10, 7, 8));
    }
}
