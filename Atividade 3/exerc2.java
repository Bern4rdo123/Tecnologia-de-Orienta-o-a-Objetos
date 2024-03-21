import java.util.Scanner;

public class exerc2 {
    public static void main(String[] arguments){
        System.out.println("Insira valor 1 de intervalo 0 e 1000: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();
        System.out.println("Insira valor 2 de intervalo maior que "+ num + " : ");
        int num2= scan.nextInt();

        int soma=0;
        for (int i = num; i < num2; i++) {
            if(i%2==1){
                soma+=i;
            }
        }
        System.out.println(soma);
    }
}
