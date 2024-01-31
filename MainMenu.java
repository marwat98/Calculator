package calculator;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner = new Scanner(System.in);
    static int choose;
    static int first;
    static int second;
    static String login;
    static String pass;
    static boolean isValid;


    public static void main(String[] args) {
        typesOfEquations type = new typesOfEquations();
        showInformation info = new showInformation();
        UserManager user = new UserManager();
        user.addUser("user", "pass1");

        do {
            System.out.println("------Wprowadź dane do zalogowania się------");
            info.login();
            login = scanner.nextLine().trim();
            info.password();
            pass = scanner.nextLine().trim();

            try {
                if (user.checkPassword(login, pass)) {
                    isValid = true;
                    info.menuProgram();
                    choose = scanner.nextInt();
                    switch (choose) {
                        case 1, 2, 3, 4 -> {
                            info.firstNumber();
                            first = scanner.nextInt();
                            info.secondNumber();
                            second = scanner.nextInt();
                            switch (choose) {
                                case 1 -> System.out.println("Wynik to: " + type.addition(first, second));
                                case 2 -> System.out.println("Wynik to: " + type.substraction(first, second));
                                case 3 -> System.out.println("Wynik to: " + type.multiplication(first, second));
                                case 4 -> System.out.println("Wynik to: " + type.division(first, second));
                            }
                        }
                    }
                } else {
                    System.out.println("Nieprawidłowy login lub hasło");
                    isValid = false;
                }
            } catch (Exception e) {
                System.out.println("Wystąpił błąd: " + e.getMessage());
                isValid = false;
            }
        } while (!isValid);
    }
}

