import java.util.Scanner;

  public class Carro{
  
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
      int repetir;
      int totalKm = 0;
      int totalGas = 0;
      double total;
      
      System.out.print("Quilometragem percorrida. Digite -1 para terminar");
      int km = entrada.nextInt();
      
      while (km >=0){
        
         System.out.print("Quantidade gasta: ");
         int gas = entrada.nextInt();
         
         totalKm += km;
         totalGas += gas;
         total = totalKm / totalGas;
         
         System.out.println("Km total: " + totalKm);
         System.out.println("Litragem: " + totalGas);
         System.out.println("Rendimento: " + Math.floor(total * 100) / 100);
         System.out.println("Quilometragem percorrida. Digite -1 para terminar");
          km = entrada.nextInt();
      }
    }
  }
