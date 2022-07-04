import java.util.Scanner;

public class atividade04{
public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        float sal = (float)10.25;
        Integer hrs;
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        hrs = scan.nextInt();
        sal *= hrs;
        System.out.println("O salário foi de R$" + sal);
} 
}
}