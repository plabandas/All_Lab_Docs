package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LockTest {

    @Test
    public void lockTest(){
        Lock lock = new Lock(10);

        assertTrue(lock.isLocked());
        assertTrue(lock.unlock(10));
        assertFalse(lock.isLocked());

        lock.lock();
        assertTrue(lock.isLocked());

        assertFalse(lock.unlock(1));
        assertTrue(lock.isLocked());

    }


}