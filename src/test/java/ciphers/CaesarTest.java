package ciphers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CaesarTest {

    Cipher c;
    String nullString = null;
    String str = "test";

    @BeforeEach
    void setUp() {
        c = new Caesar();
    }

    @Test
    void encrypt() {
        assertEquals("DEF", c.encrypt("ABC", 3));
    }
    @Test
    void encryptNotNullIfEmptyString() {
        assertNotNull(c.encrypt(" ", -3));
    }

    @Test
    void decrypt() {
        assertEquals("ABC", c.decrypt("DEF", 3));
    }

    @Test
    void decryptThrowError() {
        assertNotNull(c.decrypt("My decrypt text",3));
    }

    @Test
    void decryptNotNullIfEmptyString() {
        assertNotNull(c.decrypt(" ", -3));
    }

    @Test
    void cipherObjectIsNotNull() {
        assertNotNull(c);
    }

    @Test
    void encryptedMessageIsNotNull() { assertNotNull(c.encrypt("Test",3));}
}



