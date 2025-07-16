import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        while(true){
            System.out.println("\ndo you wan't to register, visualize data, close? (r/v/c)");
            String chosse = scanner.nextLine();
            switch (chosse) {
                case "r":
                    System.out.println("inset the name");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] == null) {
                            names[i] = scanner.nextLine();
                            break;
                        }
                    }
                    break;
                case "v":
                    for (int i = 0; i < 10; i++) {
                        if(names[i] != null){
                            System.out.println(names[i]);
                        } else{}
                    }
                    break;
                case "c":
                    System.out.println("good bye");
                    return;
                default:
                    System.out.println("error");
                    break;
            }
        }

    }
}
