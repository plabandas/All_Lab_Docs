package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyClassIT {

    @Test
    public void integrationKeyTest(){

        MyClass myClass = new MyClass();
        myClass.setName("Key");
        myClass.setId(2);
        myClass.setSecret(5);

        Lock lock = new Lock(10);
        assertTrue(lock.unlock(myClass.calculateKey()));
        assertFalse(lock.isLocked());

        lock.lock();

        myClass.setSecret(6);
        assertFalse(lock.unlock(myClass.calculateKey()));
        assertTrue(lock.isLocked());


    }

}
