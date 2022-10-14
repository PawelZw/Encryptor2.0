package application;

import ciphers.Atbash;
import ciphers.Caesar;
import ciphers.Cipher;
import cipherscontrol.CipherControlAtbash;
import cipherscontrol.CipherControlCaesar;
import cipherscontrol.CipherControlPolybius;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Scanner;

public class EncryptorControl {

    private Cipher selectedCipher = null;

    private static final int SELECT_POLYBIUS_ENCRYPTOR = 0;
    private static final int SELECT_CAESAR_ENCRYPTOR = 1;
    private static final int SELECT_ATBASH_ENCRYPTOR = 2;
    private static final int SELECT_BACON_ENCRYPTOR = 3;
    private static final int SELECT_ENCRYPT = 4;
    private static final int SELECT_DECRYPT = 5;

    private static final int EXIT = 6;

    public void controlLoopEncryptor() {
        int option;
        Scanner scanner = new Scanner(System.in);

            do {
                printOptions();
                option = scanner.nextInt();
                switch (option) {
                    case SELECT_POLYBIUS_ENCRYPTOR:
                        System.out.println("The cipher Polibius was selected");
                        controlLoopPolybius();
                        break;
                    case SELECT_CAESAR_ENCRYPTOR:
                        System.out.println("The cipher Caesar was selected");
                        selectedCipher = new Caesar();
                       // controlLoopCezar();
                        break;
                    case SELECT_ATBASH_ENCRYPTOR:
                        System.out.println("The cipher Atbash was selected");
                        selectedCipher = new Atbash();
                       // controlLoopAtbash();
                        break;
                    case SELECT_BACON_ENCRYPTOR:
                        System.out.println("The cipher Bacon was selected");
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
        System.out.println(SELECT_POLYBIUS_ENCRYPTOR + "  Select the cipher Polibius");
        System.out.println(SELECT_CAESAR_ENCRYPTOR + "  Select the cipher Caesar");
        System.out.println(SELECT_ATBASH_ENCRYPTOR + "  Select the cipher Atbash");
        System.out.println(SELECT_BACON_ENCRYPTOR + " Select the cipher Bacon");
        System.out.println("Then decide if you want to encrypt or decrypt the message: ");
        System.out.println(SELECT_ENCRYPT + " select message encryption ");
        System.out.println(SELECT_DECRYPT + " select message decryption ");
        System.out.println(EXIT + "  Exit the program");
    }
    public void controlLoopPolybius() {
        CipherControlPolybius cipherControlPolybius1 = new CipherControlPolybius();
        cipherControlPolybius1.controlLoopPolybius();
    }

    public void controlLoopCezar() {
        CipherControlCaesar cipherControlCaesar1 = new CipherControlCaesar();
        cipherControlCaesar1.controlLoopCaesar();
    }

    public void controlLoopAtbash() {
        CipherControlAtbash cipherControlAtbash1 = new CipherControlAtbash();
        cipherControlAtbash1.controlLoopAtbash();

    }

    private void doEncryption(){
        System.out.println("Enter the text to be encrypted " + selectedCipher.getName() + ":");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine().toUpperCase();
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
        String text = scanner.nextLine().toUpperCase();
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
