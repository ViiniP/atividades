import java.util.Scanner;
import javax.swing.*;

public class atividade05{
public static void main(String[] args) {
    try (Scanner scan = new Scanner(System.in)) {
        String nome = "ronaldo";
        float sal = (float)10.25;
        Integer hrs;
        System.out.print("Digite a quantidade de horas trabalhadas: ");
        hrs = scan.nextInt();
        sal *= hrs;
        System.out.println("O salário foi de R$" + sal);
    
        if (sal < 15.00){    
        JOptionPane.showMessageDialog(null,"Atencao! Dirija-se a direção do hotel. TMJ" + nome );
    }
} 
}
}