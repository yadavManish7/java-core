package day17;

import java.io.IOException;
import java.util.ArrayList;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {

        ArrayList<String> testList = new ArrayList<>();

        //without try catch block
        //String data=testList.get(2);  Flow ends here
        //System.out.println(data);

        //printPDF();

        try {
            printPDFF();
        }catch(IOException e ){

        }

        try {                                 //block of code that might throw an error
            String data1=testList.get(2);
            System.out.println(data1);
        }catch (NullPointerException | IndexOutOfBoundsException e) {    // if error occur
            //Either NullPoint or IndexOut do below command

            e.printStackTrace(); //  to get error detail
            //System.out.println("Exception occurred");
            System.out.println(e.getMessage());
            return;   // flow will return back to try block
            //System.exit(0);  // flow will stop here
        }


       // }catch (NullPointerException e){
            // if you do not specify the correct exception, flow will not enter into CATCH block
       // }

        // }catch (Exception e) { // when you do not know what exception might occur, Try to narrow down the exception
        System.out.println("Code outside block executed");

    }

    public static void printPDF() throws RuntimeException{  //might throw Runtime at some point
        //it is not necessary to handle RuntimeException
        throw  new RuntimeException("Cannot print"); // throwing error by hardcoded
    }

    public static void printPDFF() throws IOException {  //might throw IOE at some point
        //needs to handle by programmer
        throw  new IOException("Cannot print"); // throwing error by hardcoded
    }
}
