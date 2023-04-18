package javaapplication45;

import java.util.Scanner;

/**
 *
 * @author Vinícius
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        int num1 = input.nextInt();
        System.out.print("Digite o segundo número: ");
        int num2 = input.nextInt();
        System.out.println("Escolha uma operação (digite 1, 2, 3 ou 4):");
        System.out.println("1 - Adição");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        int op = input.nextInt();
        switch (op) {
            case 1:
                System.out.println("A soma é: " + (num1 + num2));
                break;
            case 2:
                System.out.println("A subtração é: " + (num1 - num2));
                break;
            case 3:
                System.out.println("A multiplicação é: " + (num1 * num2));
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Não é possível dividir por zero!");
                } else {
                    System.out.println("A divisão é: " + (num1 / num2));
                }
                break;
            default:
                System.out.println("Operação inválida. Tente novamente!");
                break;
        }
    }
}
