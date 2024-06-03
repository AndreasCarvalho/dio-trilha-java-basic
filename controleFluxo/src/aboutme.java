import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.Locale;

public class aboutme {
    public static void main(String[] args) {
        try {
        
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.println("nome :");
        String nome = scanner.next();
        System.out.println("sobrenome : ");
        String sobreNome = scanner.next();
        System.out.println("idade : ");
        int idade = scanner.nextInt();
        System.out.println("altura : ");
        double altura = scanner.nextDouble();

        System.out.println("meu nome é " + nome.toUpperCase() +" " + sobreNome.toUpperCase());
        System.out.println("tenho " + idade + " anos");
        System.out.println("e minha altura é " + altura + "cm");
        scanner.close();
        } 
         catch ( InputMismatchException e ) {
            System.err.println("os campos idade e altura precisa ser numerico");

         }
    }
        
}
