package ciphers;

import java.util.Scanner;

public class Atbash implements Cipher {

    public void atbashCoder() {
        System.out.println("Text encryption using the Atbash Cipher");
        System.out.println("Enter the text to be encrypted: ");
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.nextLine();
        StringBuilder coder = new StringBuilder();
        for (char c : abc.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('z' - c) + 'a';
                coder.append((char) newChar);
            } else {
                coder.append(c);
            }
        }
        System.out.println("Text after encryption Atbash" + coder);
        System.out.println();
    }

    public void atbashDecoder() {
        System.out.println("Decryption of messages encoded with Atbash cipher");
        System.out.println("Enter the text to be decrypted: ");
        Scanner scanner = new Scanner(System.in);
        String abc = scanner.nextLine();
        StringBuilder coder = new StringBuilder();
        for (char c : abc.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('a' - c) + 'z';
                coder.append((char) newChar);
            } else {
                coder.append(c);
            }
        }
        System.out.println("The text after deciphering Atbash is: " + coder);
        System.out.println();
    }

    @Override
    public String encrypt(String text, int key) {

        StringBuilder coder = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('z' - c) + 'a';
                coder.append((char) newChar);
            } else {
                coder.append(c);
            }
        }
        return coder.toString();
    }

    @Override
    public String decrypt(String text, int key) {

        StringBuilder coder = new StringBuilder();
        for (char c : text.toCharArray()) {
            if (Character.isLetter(c)) {
                int newChar = ('a' - c) + 'z';
                coder.append((char) newChar);
            } else {
                coder.append(c);
            }
        }
        return coder.toString();
    }


    @Override
    public String getName() {
        return "Atbash";
    }

    @Override
    public boolean requiredKey() {
        return false;
    }
}
