package org.example;


import java.lang.reflect.Array;

public class FilterUtils {
    public static <T> T[] filter(T[] array, Filter filter){
        if(array == null || array.length == 0){
            return array;
        }
        T[] result = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);

        for (int i = 0; i < array.length; i++) {
            result[i] = (T) filter.apply(array[i]);

        } return  result;
    }
}
