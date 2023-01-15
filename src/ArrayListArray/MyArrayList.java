package ArrayListArray;

import java.util.*;

public class MyArrayList<E>  {
    private int DEFAULT_CAPACITY = 20;
    private int DEFAULT_INC_CAPACITY = 10;
    private int size;
    private int capacity;
    private Object[] array;

    public MyArrayList(Object[] arr) {
        this.size = arr.length;
        this.capacity = arr.length;
        this.array = new Object[arr.length];
        for (int i = 0; i < array.length; i++) {
            this.array[i] = arr[i];
        }
    }
    public MyArrayList(int size) {
        this.size = size;
        if (size>this.capacity){
            this.capacity = size;
        }else {
            this.capacity = DEFAULT_CAPACITY;
        }
        array = new Object[capacity];
    }
    public MyArrayList() {
        this.size = 0;
        this.capacity = DEFAULT_CAPACITY;
        array = new Object[DEFAULT_CAPACITY];
    }

    public int getDEFAULT_CAPACITY() {
        return DEFAULT_CAPACITY;
    }

    public void setDEFAULT_CAPACITY(int DEFAULT_CAPACITY) {
        this.DEFAULT_CAPACITY = DEFAULT_CAPACITY;
    }

    public int getDEFAULT_INC_CAPACITY() {
        return DEFAULT_INC_CAPACITY;
    }

    public void setDEFAULT_INC_CAPACITY(int DEFAULT_INC_CAPACITY) {
        this.DEFAULT_INC_CAPACITY = DEFAULT_INC_CAPACITY;
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize(){return size;}

    public int getCapacity() {
        return capacity;
    }

    public  E get_elem(int pos){
        if (pos>=size || pos < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        return (E)array[pos];
    }

    public void set_elem(int pos, E elem){
        if (pos>=size || pos < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        array[pos]=elem;
    }
    public void resize(int new_size){
        Object[] new_arrr = new Object[new_size];
        if (this.capacity< new_size) {
            for (int i = 0; i < size; i++) {
                new_arrr[i] = array[i];
            }
            this.capacity = new_size;
        }else{
            for (int i = 0; i < new_size; i++) {
                new_arrr[i] = array[i];
            }
            this.size=new_size;
        }

        array = new_arrr;
    }
    public void delete(int pos){
        if (pos>=size || pos < 0) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = pos+1; i <array.length ; i++) {
            array[i-1] = array[i];
        }
        size--;
    }
    public void insert(int pos, E elem){
        if (this.size==0){
            array[0]=elem;
            size++;
            return;
        }
        if (pos>size || pos < 0){
            throw new ArrayIndexOutOfBoundsException();
        }
        if(this.size >= this.capacity){
            resize(this.capacity+this.DEFAULT_INC_CAPACITY);
        }
        for (int i = this.size; i >= pos+1; i--) {
            array[i]=array[i-1];
        }
        this.size++;
        array[pos]=elem;
    }

    @Override
    public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < size; i++) {
            s.append(array[i].toString()).append(" ");
        }
        return s.toString();
    }
}
