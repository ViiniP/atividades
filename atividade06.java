import java.util.Scanner;
public class atividade06 {
    public static void main(String[] args) {
    try (Scanner sc1 = new Scanner(System.in)){
    float peso = 454;
    String resp;

    System.out.println("CONVERTER PARA KG OU PARA LIRBAS ('K' OU 'L') ");
    resp = sc1.nextLine();
    resp = resp.toUpperCase();

    if (resp.equals("K")){

    System.out.println("Digite a quantidade de moedas de libras: ");
    float libras = sc1.nextFloat();

    peso = peso * libras;
    float kg = peso / 1000;
    System.out.println(libras + " libras tem: " + kg + "Kg");
    }

    if (resp.equals("L")){
        System.out.println("Digite a quantidade de kilos: ");
        float kg = sc1.nextFloat();

    peso = kg / peso;
    float libras = peso;
    System.out.println(kg + " kilos equivalem a: " + libras + " libras");
    }
    }
}
}
