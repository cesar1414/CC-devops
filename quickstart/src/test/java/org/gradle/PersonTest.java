package org.gradle;

import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    @Test
    public void canConstructAPersonWithAName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }

    @Test
    public void test1() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }

    @Test
    public void test() {
        Person person = new Person("Larry");
        assertEquals("Larry2", person.getName());
    }
}
