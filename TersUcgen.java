import java.util.Scanner;
public class TersUcgen {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number;
        System.out.println("Basamak sayısını giriniz: ");
        number=input.nextInt();

        int i,j;
        for(i=0;i<=number;i++){
            for(j=number;j>=i;j--){
                System.out.print("*");


            }
            System.out.println(" ");

        }
    }
}
