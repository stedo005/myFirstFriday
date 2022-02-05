package de.neuefische.checkPassword;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPasswordTest {

    @Test
    @DisplayName("should be true")
    void test1() {

        String[] passwords = {"Ab123456789"};
        boolean actual = CheckPassword.validate(passwords);
        assertTrue(actual);
    }

}