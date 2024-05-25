package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    @Test
    public void testKey(){
        MyClass myClass = new MyClass();
        myClass.setId(2);
        myClass.setSecret(5);
        myClass.setName("My Secret key");
        assertEquals(10,myClass.calculateKey());

    }

}