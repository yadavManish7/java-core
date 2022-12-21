package day19;

import java.util.Objects;

public class Pair<K,V> {  //Both key and value are generic , you can use as many as you want

    //non generic way
    //private String key;
    //private Object value;

    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }
}
