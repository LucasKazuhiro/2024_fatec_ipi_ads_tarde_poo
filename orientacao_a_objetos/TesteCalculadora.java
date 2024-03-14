import java.util.Scanner;

public class TesteCalculadora{

     public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Calculadora calc = new Calculadora();

        System.out.printf("Digite um valor: ");
        double valor1 = scan.nextDouble();
        System.out.printf("Digite outra valor: ");
        double valor2 = scan.nextDouble();

        int operacao;
        System.out.println("1 - Soma\n2 - Subtracao\n3 - Multiplicacao\n4 - Divisao");
        System.out.printf("\nDigite o numero da operacao: ");
        operacao = scan.nextInt();

        double result;

        switch(operacao)
            {
            case 1:
                result =  calc.somar(valor1,valor2);
                break;

            case 2:
                result = calc.subtrair(valor1, valor2);
                break;

            case 3:
                result = calc.multiplicar(valor1, valor2);
                break;

            case 4:
                result = calc.dividir(valor1, valor2);
                break;
            default:
                result = 0;
                break;
            }


        System.out.printf("O resultado equivale a: %.2f", result);
        

        System.out.println("\nAte mais!!");


        scan.close();
    }
}