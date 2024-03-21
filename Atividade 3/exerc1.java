import java.sql.SQLOutput;
import java.util.Scanner;

public class exerc1 {
    public static void main(String[] arguments){
        System.out.println("Insira valor entre 0 e 1000: ");
        Scanner scan=new Scanner(System.in);
        int num=scan.nextInt();

        for (int i = 0; i < num; i++) {
            if(i%2==1){
                System.out.println(i);
            }
        }
    }
}
