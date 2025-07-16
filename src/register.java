import java.util.Scanner;

public class register {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] names = new String[10];
        while(true){
            System.out.println("\ndo you want to register, visualize data, edit or close? (r/v/e/c)");
            String chosse = scanner.nextLine();
            switch (chosse) {

                case "r":
                    System.out.println("inset the name");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] == null && i < names.length) {
                            names[i] = scanner.nextLine();
                            break;
                        }
                    }
                    break;

                case "v":
                    for (int i = 0; i < 10; i++) {
                        if(names[i] != null){
                            System.out.println(i + ". " + names[i]);
                        } else{}
                    }
                    break;

                case "c":
                    System.out.println("good bye");
                    scanner.close();
                    return;

                case "e":
                    System.out.println("1. edit");
                    System.out.println("2. delete");
                    int edit = scanner.nextInt();

                    switch (edit){
                        case 1:
                            for (int i = 0; i < 10; i++) {
                                if(names[i] != null){
                                    System.out.println(i + ". " + names[i]);
                                } else{}
                            }
                            System.out.println("\nwhat name do you want to change(number)?");
                            int change = scanner.nextInt();
                            scanner.nextLine();
                            System.out.println("insert the new name");
                            names[change] = scanner.nextLine();
                            break;

                        case 2:
                            for (int x = 0; x < 10; x++) {
                                if(names[x] != null){
                                    System.out.println(x + ". " + names[x]);
                                } else{}
                            }
                            System.out.println("\nwhat name do you want to delete(number)?");
                            int exclude = scanner.nextInt();
                            names[exclude] = null;
                            break;

                        default:
                            System.out.println("invalid option");
                    }
                    scanner.nextLine();
                    break;

                default:
                    System.out.println("error");
                    break;
            }
        }

    }
}
