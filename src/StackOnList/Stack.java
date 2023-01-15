package StackOnList;

import java.util.EmptyStackException;
import java.util.LinkedList;

public class Stack<T> {
    private LinkedList<T> list;
    private int size;

    public int getSize() {
        return size;
    }

    public Stack() {
        size=0;
        list = new LinkedList<>();
    }
    public T pek(){
        return list.getLast();
    }
    public void push(T a){
        list.add(size, a);
        size++;
    }
    public T pop(){
        if(size==0){
            return null;
        }
        T a = list.getLast();
        list.removeLast();
        return a;
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < list.size(); i++) {
            s+=list.get(i)+" ";
        }
        return s;
    }
}
