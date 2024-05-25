package org.example;

public class Lock {

    private int keyValue;
    private boolean locked;
    public Lock(int keyValue){
        this.keyValue = keyValue;
        locked = true;
    }
    public boolean unlock(int keyValue){

        if(this.keyValue == keyValue){
            locked = false;
            return true;
        }

        locked = true;
        return false;
    }
    public void lock(){
        locked = true;
    }
    public boolean isLocked(){
        return locked;
    }
}
