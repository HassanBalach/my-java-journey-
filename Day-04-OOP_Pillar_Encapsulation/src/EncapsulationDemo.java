/*

* import java.util.Scanner; - Example of Built-in packages in java :
* AND see the Folder Name " BANK " :- it is the example of User-defiend Packages

 * There are 4 types of Access Modifier:
 * Public
 * Protected
 * Private
 * Default
 * let's diving into step by step - For access Mofifier I am using Bank Package;

 Now I am actually will be working on Encapsulation after seeing the Modifier in Bank Package:
 for this I will be using same file "EncapsulationDemo.java: "

 */


class Student{
    // This is the Default
    private  String firstName;
    private  String lastName;
    private  int age;

    public  Student(String firstName , String lastName , int age){
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
    }

    public String getFirstName(){return firstName ; }
    public String getLastName(){return lastName; }
    public int getAge(){return age; }


//    Creating setter for my upper variables:
   public void setFirstName(String firstName){
        if(firstName == null || firstName.isEmpty() ){
            throw new IllegalArgumentException("Must Enter your first Name...");
        }

        this.firstName = firstName;

    }

    public void setLastName(String lastName){
        if(lastName == null || lastName.isEmpty()){
            throw new IllegalArgumentException("LastName is necessary too.....");
        }
        this.lastName = lastName;
    }

    public void setAge(int age){
        if(age < 5 || age > 100) {
            throw new IllegalArgumentException("Please enter a valid age!");
        }
        this.age = age;
    }

    @Override
    public String toString(){
        return  firstName + " " + lastName + " who is " + age + " years old.";
    }

}

public class EncapsulationDemo {
    public static void main(String[] args){
       Student s1 = new Student("Hassan" , "Balach" , 35);
        System.out.println(s1);

        if(s1.getAge() > 30){
            System.out.println(s1.getFirstName() + " " + s1.getLastName() + " has to be pass Matric.");
        }

    }
}

