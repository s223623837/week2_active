package decisiontable;


import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;


public class SimpleLoginFormTest {

    // Test for Case 1: Successful Login
    @Test
    public void testSuccessfulLogin() {
        assertEquals("success", SimpleLoginForm.login("admin", "password123"));
    }

    // Test for Case 2: Incorrect Password
    @Test
    public void testIncorrectPassword() {
        assertEquals("failure", SimpleLoginForm.login("admin", "wrongpassword"));
    }

    // Test for Case 3: Incorrect Username
    @Test
    public void testIncorrectUsername() {
        assertEquals("failure", SimpleLoginForm.login("wronguser", "password123"));
    }

    // Test for Case 4: Invalid Values
    @Test
    public void testInvalidValues() {
        assertEquals("failure", SimpleLoginForm.login("", ""));
    }

    // Test for Case 5: Invalid Username
    @Test
    public void testInvalidUsername() {
        assertEquals("failure", SimpleLoginForm.login("", "password123"));
    }

    // Test for Case 6: Invalid Password
    @Test
    public void testInvalidPassword() {
        assertEquals("failure", SimpleLoginForm.login("admin", ""));
    }
}