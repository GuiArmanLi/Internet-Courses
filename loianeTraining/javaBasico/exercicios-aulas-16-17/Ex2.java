import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        var name = "";
        var password = "";

        do {
            System.out.println("Digite seu nome");
            name = scan.nextLine();
            
            System.out.println("Digite sua senha");
            password = scan.nextLine();
        } while (name.equals(password));
        scan.close();
    }
}
