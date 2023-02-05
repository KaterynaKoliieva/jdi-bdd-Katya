package io.github.com.entities;


import java.sql.Timestamp;
import java.util.Random;

public class Users {
    public static final String defaultEmail = "1660074366230cucumber@test.com";
    public static final String defaultPassword = "1660074366230cucumber";
    public static final String passwordLessTnan8 = "1234";

    public static final String randomFirstName = randomName();

    public static final String randomLastName = randomName();

    public static final String defaultPostcode = "E1 6AN";

    public static final String randomPassword = randomName();

    public static User DEFAULT_USER = new User().set(c -> {
        c.email = defaultEmail;
        c.password = defaultPassword;
    });

    public static User INCORRECT_USER = new User().set(c -> {
        c.email = "just_smile@test.com";
        c.password = "helloworld123";
    });
    public static User EMPTY_PASSWORD = new User().set(c -> {
        c.email = defaultEmail;
        c.password = "";
    });
    public static User INCORRECT_PASSWORD = new User().set(c -> {
        c.email = defaultEmail;
        c.password = "12345";
    });

    public static User EMAIL_WITHOUT_ASPERAND = new User().set(c -> {
        c.email = "1660074366230cucumbertest.com";
        c.password = defaultPassword;
    });
    public static User INCORRECT_EMAIL = new User().set(c -> {
        c.email = "hello_friends@test.com";
        c.password = defaultPassword;
    });
    public static User EMPTY_EMAIL = new User().set(c -> {
        c.email = "";
        c.password = defaultPassword;
    });
    public static User EMPTY_FIELDS = new User().set(c -> {
        c.email = "";
        c.password = "";
    });

    public static String randomEmail(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return timestamp.getTime() + "@test.com";
    }

    public static String randomName(){
        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
        return "test" + timestamp.getTime();
    }

    public static int randomNumber(int size){
        Random random = new Random();
        return random.nextInt(size+1);

    }

    public static Contacts RANDOM_CONTACT = new Contacts().set(c -> {
        c.firstName = randomFirstName;
        c.lastName = randomLastName;
        c.postcode  = defaultPostcode;
        c.password = randomPassword;
        c.retypePassword = c.password;
    });

}
