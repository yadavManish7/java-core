package day5;

public class StringDemo {
    public static void main(String[] args) {

        //String objects stores in heap memory.Heap memory has string pool for string reusability

        String name1 = new String("Manish");
        String name2 = "Manish";
        String name3 = "Manish";
        String name4 = "anish";

        boolean isName1EqualName2 = name1 == name2;   //both name1 and name2 are String objects just created in different ways
        System.out.println("Name1 and Name2 are equal = "+ isName1EqualName2);  //false

        //contents of name1 and name2 are same but
        //name1 and name2 stores in different memory location

        boolean isName2EqualName3 = name2 == name3;
        System.out.println("Name2 and Name3 are equal = "+ isName2EqualName3);  //true

        // == sign checks for memory location not content of an obj.name2 and name3 are stored in string pool

        String subString = name3.substring(1,6);
        System.out.println("Substring of Manish = " + subString);  //anish

        boolean isSubStingEqualName3 =  name3==subString;
        System.out.println("Substring and name3 are equal= " + isSubStingEqualName3);  //false
        // Though substring and name3 have same content they are not equal because they point to different memory location

        //Never use == sign to check equality

        boolean subStingEqualName3 = name4.equals(subString);  //
        System.out.println("name4 and substring are equal = "+subStingEqualName3);  //true





    }
}
