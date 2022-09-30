package application;

public class EncryptorApp {

    private static final String APP_NAME = "Szyfrator v2.0";

    public static void main(String[] args) {
        System.out.println(APP_NAME);
        EncryptorControl encryptorControl = new EncryptorControl();
        encryptorControl.controlLoopEncryptor();
    }
}
