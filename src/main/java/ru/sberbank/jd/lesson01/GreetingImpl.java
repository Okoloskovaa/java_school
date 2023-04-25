package ru.sberbank.jd.lesson01;


import java.util.Arrays;
import java.util.Collection;

class GreetingImpl implements Greeting {

    private final String firstName = "Olya";
    private final String lastName = "Koloskova";
    private final int birthYear = 2000;
    private final Collection<String> hobbies = Arrays.asList("рисовать", "мыть");
    private final int phone = 127;


    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public Collection<String> getHobbies() {
        return hobbies;
    }

    public int getPhone() {
        return phone;
    }

}