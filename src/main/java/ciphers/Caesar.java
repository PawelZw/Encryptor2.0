package ciphers;

import java.util.Scanner;

public class Caesar implements Cipher {

    public void caesarCoder() {
        System.out.println("Text encryption using the Caesar Cipher");
        System.out.println("Enter the text to be encrypted: ");
        Scanner scanner = new Scanner(System.in);
        String txt = scanner.nextLine().toUpperCase();
        System.out.println("Enter the encryption key (number of shifts): ");
        int n = scanner.nextInt();
        String encrypted = "";
        for (int i = 0; i < txt.length(); i++) {
            char c = (char) (txt.charAt(i) + n);
            if (c > 'Z')
                c -= 26;
            encrypted += c;
        }
        System.out.println("Text after encryption Caesar: " + encrypted);
        System.out.println();
    }

    public void caesarDecoder() {
        System.out.println("Decryption of messages encoded with Caesar cipher");
        System.out.println("Enter the text to be decrypted: ");
        Scanner scanner = new Scanner(System.in);
        String opo = scanner.nextLine().toUpperCase();
        System.out.println("Enter the encryption key (number of shifts): ");
        int m = scanner.nextInt();
        String decryption = "";
        for (int i = 0; i < opo.length(); i++) {
            char c = (char) (opo.charAt(i) - m);
            if (c < 'A')
                c += 26;
            decryption += c;
        }
        System.out.println("The text after deciphering Caesar is: " + decryption);
        System.out.println();
    }

    @Override
    public String encrypt(String text, int key) {
        String encrypted = "";
        for (int i = 0; i < text.length(); i++) {
            char c = (char) (text.charAt(i) + key);
            if (c > 'Z')
                c -= 26;
            encrypted += c;
        }
        return encrypted;
    }

    @Override
    public String decrypt(String text, int key) {
        String decryption = "";
        for (int i = 0; i < text.length(); i++) {
            char c = (char) (text.charAt(i) - key);
            if (c < 'A')
                c += 26;
            decryption += c;
        }
        return decryption;
    }

    @Override
    public String getName() {
        return "Caesar";
    }

    @Override
    public boolean requiredKey() {
        return true;
    }

}
