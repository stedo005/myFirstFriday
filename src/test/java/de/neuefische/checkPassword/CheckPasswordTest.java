package de.neuefische.checkPassword;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordTest {
    @Test
    @DisplayName("should be Dein Passwort ist sicher!")
    void test1() {
        String[] passwords = {"Ab123456789"};
        String actual = CheckPassword.validate(passwords);
        assertEquals("Dein Passwort ist sicher!",actual);
    }

    @Test
    @DisplayName("should be Dein Passwort ist kurz!")
    void test2() {
        String[] passwords = {"23456789"};
        String actual = CheckPassword.validate(passwords);
        assertEquals("Dein Passwort ist zu kurz!",actual);
    }

    @Test
    @DisplayName("should be Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!")
    void test3() {
        String[] passwords = {"777723456789"};
        String actual = CheckPassword.validate(passwords);
        assertEquals("Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!",actual);
    }

    @Test
    @DisplayName("should be Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!")
    void test4() {
        String[] passwords = {"ABCDEFGHIJKLM"};
        String actual = CheckPassword.validate(passwords);
        assertEquals("Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!",actual);
    }

    @Test
    @DisplayName("should be Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!")
    void test5() {
        String[] passwords = {"abcdefghuj12345"};
        String actual = CheckPassword.validate(passwords);
        assertEquals("Dein Passwort muss Großbuchstaben, Kleinbuchstaben und Ziffern enthalten!",actual);
    }

}