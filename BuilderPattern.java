//Builder Pattern
class User{
    private String name;
    private int age;
    private String email;
    
    private User(Builder builder)
    {
        this.name = builder.name;
        this.age = builder.age;
        this.email = builder.email;
        
    }
     @Override
   public   String toString()
   {
      return this.name+" "+this.age;
   }
  //Since we're using the builder to create a User, it makes sense that the builder should exist independently of a User instance.
  public static  class Builder{
    private String name;//Required
    private int age;
    private String email;
    
    //Required parameters in constructor 
    public Builder(String name)
    {
        this.name = name;
    }
    public Builder email(String email)
   {
       this.email = email;
       return this;
   }
   public Builder age(int age)
   {
       this.age = age;
       return this;
   }
   public User build()
   {
       return new User(this);
   }
  
  }
}

public class MyClass {
  public static void main(String args[]) {
       User user = new User.Builder("Samhita").email("sam@gmail.com").age(35).build();
       System.out.println(user.toString());
  }
}