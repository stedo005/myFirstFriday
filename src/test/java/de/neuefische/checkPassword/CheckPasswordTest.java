package de.neuefische.checkPassword;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordTest {

    @Test
    @DisplayName("should be String 9")
    void test1() {

        String password = "12345678a";
        String actual = CheckPassword.validate(password);
        assertEquals("Passwortlänge: 9\nDein Passwort enthält Zahlen!", actual);

    }

}