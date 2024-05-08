import java.util.*;
public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite o primeiro parâmentro");
        int paramentroUm = terminal.nextInt();

        System.out.println("Digite o Segundo parâmentro");
        int paramentroDois = terminal.nextInt();

        try {
           if(paramentroUm >= paramentroDois) {
                    throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
           }

           contarNumero(paramentroUm, paramentroDois);
        }catch (NumberFormatException e) {
            System.out.println("Por favor, informe números inteiros válidos como parâmetros.");
        }catch (ParametrosInvalidosException e){
            System.out.println(e.getMessage());
        }
     }
      public static void contarNumero(int inicio, int fim){
            for(int i = inicio; i <= fim; i++){
                System.out.println(" Imprimindo o número " + i);
            }
      }
    }
