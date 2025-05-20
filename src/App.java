import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        try (Scanner scanner = new Scanner(System.in)){
            int n = scanner.nextInt(); //Lea n  
            int m = scanner.nextInt(); //Lea m
            
            if (n%2==0 && m%2==0){
                System.out.println("n y m son pares"); //Muestre "n y m son pares"
                }  else if (n%2!=0 && m%2==0){
                   System.out.println("solo m es par");
                } else if (n%2==0 && m%2!=0){ 
                    System.out.println("solo n es par");
                } else{
                    System.out.println("n y m son impares"); 
                }
         }
    }
}
