import java.util.Scanner;
import javax.swing.JOptionPane;

    public class emanuel {
    public static void main(String[] args) {
    try (Scanner sc1 = new Scanner(System.in)) {
    
    int idade;

    System.out.println("Digite sua idade: ");
    idade = sc1.nextInt();

    if ((idade >= 0) && (idade <3)){
    JOptionPane.showMessageDialog(null,"BEBÊ");
    } 

    if ((idade >= 3) && (idade < 12)){
        JOptionPane.showMessageDialog(null,"CRIANCA");
        }

    if ((idade >= 12) && (idade <20)){
        JOptionPane.showMessageDialog(null,"ADOLESCENTE, A DOR, ELE SENTE");
        }
        
    if ((idade >= 20) && (idade <30)){
        JOptionPane.showMessageDialog(null,"JOVI");
        }

    if ((idade >= 31) && (idade <60)){
        JOptionPane.showMessageDialog(null,"ADULTO");
        }    
        
    if  (idade >= 60){
        JOptionPane.showMessageDialog(null,"VEIO");
        }    

    }
    }
}
