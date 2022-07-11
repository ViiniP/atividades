public class atividade02_primos {
   public static void main(String[] args) {
      int x, y = 0;

      for (x = 0; x <= 125; x++) {
         if ((x % 2 != 0) && (x % 3 != 0)) {
            System.out.println(x);
            y += 1;

         }

      }
      System.out.println("Quantidade de numeros primos: " + y);
   }
}