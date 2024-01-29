package calculator;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    static int choose;
    static int first;
    static int second;
    static String login;
    static String pass;


    public static void main(String[] args) {
        typesOfEquations type = new typesOfEquations();
        showInformation info = new showInformation();
        UserManager user = new UserManager();
        user.addUser("user","pass1");

        info.login();
        login = scanner.next();
        info.password();
        pass = scanner.next();

        if(user.checkPassword(login,pass)){
            info.menuProgram();
            choose = scanner.nextInt();
            switch (choose) {
                case 1, 2, 3, 4 -> {
                    info.firstNumber();
                    first = scanner.nextInt();
                    info.secondNumber();
                    second = scanner.nextInt();
                    if (choose == 1) {
                        System.out.println("Wynik to: " + type.addition(first, second));

                    } else if (choose == 2) {
                        System.out.println("Wynik to: " + type.substraction(first, second));

                    } else if (choose == 3) {
                        System.out.println("Wynik to: " + type.multiplication(first, second));

                    } else if (choose == 4) {
                        System.out.println("Wynik to: " + type.division(first, second));

                    }
                }
            }
        } else {
            System.out.println("Użytkownik nie istnieje");
        }
    }
}
