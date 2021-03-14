import java.util.jar.Attributes.Name;

// import java.util.Map;

class A{
    protected int age  ;
    protected String name;
    A(){
        System.out.println("A costructor!");
    }
 
    protected void setAge(int age){
          this.age = age;

    }

    protected void setName(String name){
        this.name = name;
    }

    protected int getAge(){
        return this.age;
    }

    protected String getName(){
        return this.name;
    }
}

class B extends A{

    B(){
        System.out.println("B constructor !");
    }
     protected String country;
     
     protected void setCountry(String country){
         this.country = country;
     }

     protected String getCountry(){
         return this.country;
     }
   
}
class Test extends B{
     protected String FatherName;
     protected void setFatherName(String fatherName){
         this.FatherName = fatherName;
     }

     protected String getFatherName(){
         return FatherName;
     }
}
public class Foo{

    public static void main(final String args[]) {
           
        Test object = new Test();
        object.setAge(21);
        object.setName("Yashwant");
        object.setCountry("India");
        object.setFatherName("Santosh");

        System.out.println("Age is : "+object.getAge()+" Name is : "+object.getName()+" COuntry is : "+object.getCountry()+" Father name is : "+object.getFatherName());
    }
}