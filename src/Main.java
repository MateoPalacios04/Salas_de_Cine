import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Salas sala = new Salas();

       while (true){
           System.out.println("\n--- Cine ---");
           System.out.println("1. Comprar entrada");
           System.out.println("2. Consultar diponibilidad");
                      System.out.println("4. Salir");
           System.out.print("Elige una opción: ");

           int opcion = scanner.nextInt();
           scanner.nextLine();


           switch (opcion){

               case 1:
               System.out.println("Numero de sala a consultar");

               break;
           }
       }








    }
}