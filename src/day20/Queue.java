package day20;

public interface Queue<E> {

    void add(E element);
    E remove();
    int size();
}
