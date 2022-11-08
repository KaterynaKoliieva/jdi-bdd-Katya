package io.github.com.entities;


import java.sql.Timestamp;
import java.util.Random;

public class Users {

    public static User DEFAULT_USER = new User();

    public static final String defaultEmail = "1660074366230cucumber@test.com";
    public static final String defaultPassword = "1660074366230cucumber";

    public static final String randomFirstName = randomName();

    public static final String randomLastName = randomName();

    public static final String defaultPostcode = "E1 6AN";

    public static final String randomPassword = randomName();


    public static Contacts DEFAULT_CONTACT = new Contacts().set(c -> {
        //c.email = defaultEmail;
        c.password = defaultPassword;
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
