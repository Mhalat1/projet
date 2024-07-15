
import java.util.Scanner;

public class Calculatrice {

    
    public static void main(String[] args) {
        
        String op = "";
        String stop = "stop";
        
        while (!op.equals(stop)) {
            
        int a;
        int b;
        Scanner Nb = new Scanner(System.in);

        System.out.println("veuillez saisir une operation ou stop pour quitter:");
        op = Nb.nextLine();

        System.out.println("veuillez saisir un nombre 1:");
        String NombreA = Nb.nextLine();

        System.out.println("veuillez saisir un nombre 2");
        String NombreB = Nb.nextLine();

        System.out.println("le premier nombre 1 est  le :" + NombreA);
        System.out.println("le deuxieme nombre 2 est le :" + NombreB);

        a = Integer.parseInt(NombreA);
        b = Integer.parseInt(NombreB);


            switch (op) {
                case "+":
                    a = a + b;
                    break;
                case "-":
                    a = a - b;
                    break;
                case "*":
                    a = a * b;
                    break;
                case "/":
                    a = a / b;
                    break;
                case "%":
                    a = a % b;
                    break;
            }
            System.out.println("le resultat du calcul est : " + a);

            System.out.println("veuillez saisir un nombre 2");
            String NombreC = Nb.nextLine();
            b = Integer.parseInt(NombreC);
        }
        System.out.println("Programme terminé");
    }

}