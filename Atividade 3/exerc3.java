import java.sql.SQLOutput;
import java.util.Scanner;

public class exerc3 {
    public static void mostra(int totalcobaias, int cobras, int sapos, int ratos){
        System.out.println("Total de cobaias: "+totalcobaias);
        System.out.println("Cobras: "+cobras);
        System.out.println("Sapos: "+sapos);
        System.out.println("Ratos: "+ratos);

        float porcentcobras=((float)cobras/(float)totalcobaias)*100;
        float porcentratos=((float)ratos/(float)totalcobaias)*100;
        float porcentsapos=((float)sapos/(float)totalcobaias)*100;

        System.out.println("Porcentagem de Cobras: "+porcentcobras+"%");
        System.out.println("Porcentagem de ratos: "+porcentratos+"%");
        System.out.println("Porcentagem de Sapos: "+porcentsapos+"%");
    }

    public static void main(String[] arguments){
        int menu;
        int totalcobaias=0;
        int cobras = 0,sapos=0,ratos=0;
        do {
            System.out.println("1-Inserir cobaia \n2-Mostrar cobaias \n3-Sair \nSelecione opcão: ");
            Scanner scan = new Scanner(System.in);
            menu = scan.nextInt();

            if(menu==1){
                System.out.println("Informe o animal cobaia: ");
                scan.nextLine();
                String animal=scan.nextLine();
                System.out.println(animal);

                if(animal.equalsIgnoreCase("c")){
                    System.out.println("Informe a quantidade: ");
                    int quant= scan.nextInt();
                    cobras+=quant;
                    totalcobaias+=quant;
                }

                if(animal.equalsIgnoreCase("s")){
                    System.out.println("Informe a quantidade: ");
                    int quant= scan.nextInt();
                    sapos+=quant;
                    totalcobaias+=quant;
                }

                if(animal.equalsIgnoreCase("r")){
                    System.out.println("Informe a quantidade: ");
                    int quant= scan.nextInt();
                    ratos+=quant;
                    totalcobaias+=quant;
                }
            }
            if(menu==2){
                mostra(totalcobaias,cobras,sapos,ratos);
            }
        }while (menu!=3);
    }
}
