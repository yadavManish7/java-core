package day17;

public class User {
    private String email;
    private String userName;
    private String password;
    private int age;

   public User(String email,String userName,String password,int age){
        this.email=email;
        this.userName=userName;
        this.password=password;
        this.age=age;
    }

    public void registerUser()throws AgeRestrictionException{
       validation();
       //save user in database
        System.out.println("Successfully registered");
    }

    public void validation() throws AgeRestrictionException{
        if(this.age<18){//this == obj
            throw new AgeRestrictionException("Your age is less than 18.You cannot register");
        }
    }
}
