package Bank;

class PersonalInfo{
    //private Modifier only can be access with in the class , in my case only in PersonalInfo not outside of it :
    //See the example in the PrivateModifierEx which is throwing errors:
    private String firstName;
    private String lastName;
    private int age;

    void display(){
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Age: " + age);

    }
}

public class PrivateModifierEx {

    public static void main(String[] args) {
/*
        PersonalInfo personalInfo = new PersonalInfo();
        personalInfo.age = 19;
        personalInfo.firstName = "Hassan";
        personalInfo.lastName = "Balach";
        personalInfo.display();
*/
    }
}

