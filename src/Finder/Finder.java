package Finder;

import java.util.Iterator;

public class Finder{
    public static <T> Iterator<T> find(Iterable<T>a, T el){
        for(T i: a){
            if(el==i){
                return (Iterator<T>) i;
            }
        }
        return null;
    }
}
