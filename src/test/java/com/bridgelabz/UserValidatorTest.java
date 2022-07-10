package com.bridgelabz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserValidatorTest {
    @Test
    public void givenFirstName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidFirstName("Riya");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenFirstName_WhenImProperFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidFirstName("Riya");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenLastName_WhenProperFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidLastName("Meera");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenLastName_WhenImProperFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidLastName("Meera");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenEmail_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMailId("abc.xyz@bl.co.in");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenEmail_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMailId("abc.xyz@bl.c.in");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenMobileNumber_WhenValidFormat_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMobileNumber("91 9875674839");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenMobileNumber_WhenInValidFormat_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidMobileNumber("91 987567483");
        Assertions.assertEquals(false, result);
    }
    @Test
    public void givenPassword_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidPassword("DJ89i&ot");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenPassword_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidPassword("DJ89i&o");
        Assertions.assertEquals(false, result);
    }

    @Test
    public void givenSampleMail_WhenValid_ShouldReturnTrue() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidSampleMail("abc@yahoo.com");
        Assertions.assertEquals(true, result);
    }
    @Test
    public void givenSampleMail_WhenInValid_ShouldReturnFalse() {
        UserValidator obj = new UserValidator();
        boolean result = obj.userValidSampleMail("ab@.yahoo.com");
        Assertions.assertEquals(false, result);
    }
}

