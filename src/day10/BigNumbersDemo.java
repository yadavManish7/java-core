package day10;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class BigNumbersDemo {
    public static void main(String[] args) {

        long longVal = 475747382;

        BigInteger bigIntegerLongVal = BigInteger.valueOf(475747382);

        BigInteger bigInteger = new BigInteger("2536473722823847473888987");// Though it contains string it acts as number

        BigInteger bigInteger1 =  BigInteger.ONE;
        BigInteger sum = bigInteger.add(bigInteger1);   //you can not use + sign for bigintegers
        BigInteger multiply = bigInteger1.multiply(bigInteger);
        System.out.println(sum);

        int sign =bigInteger1.signum(); //you cannot use <|> in biginteger class to find negative or positive
        System.out.println(sign);
        System.out.println(sign<0);

        // biginteger1 * (bigintegerLongVal + biginteger)

        BigInteger result =bigIntegerLongVal.add(bigInteger).multiply(bigInteger1);
        System.out.println(result);

        BigDecimal p = new BigDecimal("2500000");
        BigDecimal r = BigDecimal.valueOf(10);
        BigDecimal t = BigDecimal.valueOf(710);  //you cannot operate biginteger with bigdecimal

        BigDecimal interest = p.multiply(t).multiply(r).divide(BigDecimal.valueOf(10000));
        System.out.println("Interest rate : "+ interest);

    }
}
