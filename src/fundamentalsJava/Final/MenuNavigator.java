package fundamentalsJava.Final;

import java.util.Scanner;

public class MenuNavigator {

    public static void start() {
        System.out.println("   Адресная книга");
        System.out.println("");
        System.out.println("1 - Добавить контакт");
        System.out.println("2 - Показать контакты");
        System.out.println("3 - удалить контакт");
        System.out.println("0 - Выход");
        System.out.println("");
        System.out.print("Введите нужную команду и нажмите Enter: ");

        Scanner scanner = new Scanner(System.in);
        int team = scanner.nextInt();

        boolean isRunnin = true;

        switch (team) {
            case 1:
                AddressBook.addContact();
                break;
            case 2:
                AddressBook.showContact();
                break;
            case 3:
                AddressBook.deleteContact();
                break;
                case 0:
                    System.out.println("Закрытие программы...");
                    isRunnin = false;
                    break;
                default:
                    System.out.println("Неверная команда! Попробуйте еще раз!");

        }
    }
}

