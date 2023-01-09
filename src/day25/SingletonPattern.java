package day25;

public class SingletonPattern {//Contains only one INSTANCE/object

        private static SingletonPattern _singletonPattern; //create Static Object

        private SingletonPattern(){}; //Make constructor private

    public static  SingletonPattern getInstance(){//Static function to call using Class name, to Return Object function
        if(_singletonPattern==null){
            _singletonPattern = new SingletonPattern();
        }
        return _singletonPattern;
    }
}
