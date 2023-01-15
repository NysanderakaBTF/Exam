package StackOnArray;

import java.util.ArrayList;
import java.util.EmptyStackException;

public class StackGeneric<E> {
    private int size;
    private int cap;
    private Object[] list;

    public StackGeneric() {
        cap = 10;
        size = 0;
        list = new Object[cap];
    }
    private void resize(){
        Object[] n = new Object[cap*2];
        for (int i = 0; i < size; i++) {
            n[i] = list[i];
        }
        list = n;
        cap = cap*2;
    }
    public void push(E e){
        if(size+1>=cap)
            this.resize();
        list[size]=e;
        size++;
    }
    public boolean is_empty(){
        return size==0;
    }
    public E top(){
        return (E) list[size-1];
    }
    public E pop(){
        if(size==0) throw new EmptyStackException();
        size--;
        return (E) list[size];
    }

    @Override
    public String toString() {
        StringBuilder aa = new StringBuilder();
        for (int i = 0; i < size; i++) {
            aa.append(list[i].toString()).append(" ");
        }
        return aa.toString();
    }
}
