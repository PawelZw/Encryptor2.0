package ciphers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class PolybiusTest {

    Cipher c;
    String nullString = null;
    String str = "test";

    @BeforeEach
    void setUp() {
        c = new Polybius();
    }

    @Test
    void encrypt() {
        assertEquals("111213", c.encrypt("ABC", 0));
    }
    @Test
    void encryptNotNullIfEmptyString() {
        assertNotNull(c.encrypt(" ", 0));
    }

    @Test
    void decrypt() {
        assertEquals("abc", c.decrypt("111213", 0));
    }

    @Test
    void decryptThrowError() {
        assertNotNull(c.decrypt("My decrypt text",0));
    }

    @Test
    void decryptNotNullIfEmptyString() {
        assertNotNull(c.decrypt(" ", 0));
    }

    @Test
    void cipherObjectIsNotNull() {
        assertNotNull(c);
    }

    @Test
    void encryptedMessageIsNotNull() { assertNotNull(c.encrypt("Test",0));}
}


