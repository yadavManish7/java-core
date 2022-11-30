package day10;

import day1.AccountType;
import day1.BankAccount;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] a = {2,3,4,5,6}; //multiple value in single variables of same datatype
        System.out.println("Value at index  : "+a[2]);
        a[1]=0;  //changing value at index 1 to 0
        System.out.println("a : "+Arrays.toString(a));

        int[] array = new int[5];
        array[0]= 0;
        array[1]=1;
        array[2]=2;
        array[3]=3;
        array[4]=5;
        System.out.println("array : "+ Arrays.toString(array));

        BankAccount[] account = new BankAccount[3];  //class default value is null
        System.out.println(Arrays.toString(account));

        account[0] = new BankAccount("001",5000, AccountType.SAVING);
        account[1]= new BankAccount("002",4000,AccountType.CHECKING);

        System.out.println(Arrays.toString(account));


        System.out.println("a length : " + a.length);
        System.out.println("array length : " + array.length);
        System.out.println("account length : " + account.length);

        System.out.println("array last  : " + (array.length-1));


    }
}
