package day20;

public abstract class MiddlewareClass<E> implements Queue<E> {

     public int size(){
         System.out.println("Abstract class function");
        return 5;
    }


}
