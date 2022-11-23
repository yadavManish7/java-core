package day9;

public class LoopsDemo {
    public static void main(String[] args) {

        int i=1;
        while (i<=5){  //Executes until the condition is false
            System.out.print(i);
            i++;
        }
        System.out.println();

       int  j=4;
        do{
            System.out.println(j);  //Execute once before checking condition
            j++;
        }while (j<=5);

        for (int k = 1; k<=5; k++){    //Use for loop when you know the no of iteration
            System.out.print(k);
        }

        System.out.println();
        int s = 1;
        String result ="";
        while (s<=5){
            result = result + "a";
            s++;
        }
        System.out.println(result);

        String str = "a";
        String withoutLoop = str.repeat(5);   // Try to do without using loops because of time complexity
        System.out.println(withoutLoop);
    }
}
