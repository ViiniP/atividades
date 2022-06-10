import java.util.Scanner;

public class atividade02 {
    public static void main(String[] args) {
    Scanner sc1 = new Scanner(System.in);


    Float h,b,B,a;

    System.out.println("Digite a altura: ");
    h = sc1.nextFloat();
    System.out.println("Digite a base menor: ");
    b = sc1.nextFloat();
    System.out.println("Digite a base maior: ");
    B = sc1.nextFloat();

    while (b < B) {
        System.out.println("Digite a altura: ");
        h = sc1.nextFloat();
        System.out.println("Digite a base menor: ");
        b = sc1.nextFloat();
        System.out.println("Digite a base: ");
        B = sc1.nextFloat();
        }

    a = (h * (b + B))/2;
    System.out.println("O valor é: " + a); 
    System.out.println("O valor arredondado é: " + Math.round(a));
        
    }
}