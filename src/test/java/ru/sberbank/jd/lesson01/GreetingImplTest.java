package ru.sberbank.jd.lesson01;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static junit.framework.TestCase.assertEquals;



public class GreetingImplTest {

    @Test
    public void testGreeting() {
        GreetingImpl greetingImpl = new GreetingImpl();
        List<String> hobbies = Arrays.asList("рисовать", "мыть");


        Assert.assertEquals("Olya", greetingImpl.getFirstName());
        Assert.assertEquals("Koloskova", greetingImpl.getLastName());
        Assert.assertEquals(2000, greetingImpl.getBirthYear());
        Assert.assertEquals(127, greetingImpl.getPhone());
        assertEquals(hobbies, greetingImpl.getHobbies());

    }

}
