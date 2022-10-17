package application;

import ciphers.Cipher;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EncryptorControl {

    CipherMenu cipherMenu = new CipherMenu();

    private Cipher selectedCipher = null;

    private static final int SELECT_CIPHER = 1;

    private static final int SELECT_ENCRYPT = 2;
    private static final int SELECT_DECRYPT = 3;

    private static final int EXIT = 4;

    public void controlLoopEncryptor() {
        int option = - 1;
        Scanner scanner = new Scanner(System.in);

            do {
                printOptions();
                try {
                    option = Integer.parseInt(scanner.nextLine());
                } catch (NumberFormatException e) {
                    System.out.println("Incorrect option ");

                    continue;
                }
                switch (option) {
                    case SELECT_CIPHER:
                        selectedCipher = cipherMenu.getCipherFromUser();
                        break;

                    case SELECT_ENCRYPT:
                        doEncryption();
                        break;
                    case SELECT_DECRYPT:
                        doDecryption();
                        break;
                    case EXIT:
                        exit();
                        break;
                    default:
                        System.out.println("There is no such option, please re-enter: ");
                }
            } while (option != EXIT);
        }


    private void printOptions() {
        System.out.println("An encryption program using selected ciphers");
        System.out.println("Choose one of the options below: ");
        System.out.println(SELECT_CIPHER + "  Select Cipher");

        System.out.println(SELECT_ENCRYPT + " select message encryption ");
        System.out.println(SELECT_DECRYPT + " select message decryption ");
        System.out.println(EXIT + "  Exit the program");
    }


    private void doEncryption(){
        System.out.println("Enter the text to be encrypted " + selectedCipher.getName() + ":");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int key = 0;
        if(selectedCipher.requiredKey()) {
            System.out.println("Enter the encryption key (number of shifts): ");
             key = scanner.nextInt();
        }
        System.out.println("The text after encryption is: " + selectedCipher.encrypt(text, key));
    }

    private void doDecryption(){
        System.out.println("Enter the text to be decrypted" + selectedCipher.getName() + ":");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int key = 0;
        if(selectedCipher.requiredKey()) {
            System.out.println("Enter the decryption key (number of shifts): ");
            key = scanner.nextInt();
        }
        System.out.println("The text after decryption is: " + selectedCipher.encrypt(text, key));

    }

    private void exit() {
        System.out.println("End of program");

    }
}
