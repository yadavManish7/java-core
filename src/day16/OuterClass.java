package day16;

 class OuterClass {

     public int outerVal = 7;

//     public InnerClass getInnerClassObject(){
//         return new InnerClass();
//     };


    public class InnerClass{    //inner class provides extra level of security
        // this class can be public/private
        public int innerVal = 10;

        public void increaseOuterVal(){
            outerVal++;                // Inner class can use outer class val directly
        }

        //Inner class are not used frequently, Interface is more useful
    }
}
