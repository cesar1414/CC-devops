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
        assertEquals("Larry", person.getName());
    }

    @Test
    public void canConstructAPersonWithValueNotNull() {
        Person person = new Person("");
        assertNotNull(person);
    }

    @Test
    public void canConstructALLEmpty() {
        Person person = new Person("","",0);
        assertEquals("", person.getName());
        assertEquals("", person.getLastames());
        assertEquals(0, person.getAge());

    }

    @Test
    public void canConstructAPersonWithAllDifferentLast() {
        Person person = new Person("augusto","calvi",120);
        assertNotEquals("cesar", person.getName());
        assertNotEquals("lujan", person.getLastames());
        assertNotEquals(45, person.getAge());
    }

    @Test
    public void canConstructAPersonWithANameAndLastname() {
        Person person = new Person("Larry","Cabrera",120);
        assertEquals("Larry", person.getName());
        assertEquals("Cabrera", person.getLastames());
        assertEquals(120, person.getAge());
    }

    @Test
    public void canConstructAPersonWithName() {
        Person person = new Person("Larry");
        assertEquals("Larry", person.getName());
    }

    @Test
    public void canConstructAPersonWithDifferentName() {
        Person person = new Person("Larry");
        assertNotEquals("Larry2", person.getName());
    }


    @Test
    public void canConstructAPersonWithDifferentLastName() {
        Person person = new Person("","calvi",0);
        assertNotEquals("lujan", person.getLastames());
    }


    @Test
    public void canConstructEmptyLastName() {
        Person person = new Person("");
        assertEquals("", person.getLastames());
    }

    @Test
    public void canConstructEmptyName() {
        Person person = new Person("");
        assertEquals("", person.getName());
    }
    
    @Test
    public void canConstructAPersonWithANameAndLastnameAndAge() {
        Person person = new Person("person","calvi",0);
        assertEquals("person", person.getName());
        assertEquals("calvi", person.getLastames());
    }

    @Test
    public void canConstructAPersonWithANameAndAge() {
        Person person = new Person("","calvi",0);
        assertEquals("calvi", person.getLastames());
        assertEquals(0, person.getAge());
    }
}
