

public class Person {
    String name;
    int age;

    void displayInfo(){
    System.out.println("Name: " +name);
    System.out.println("Age: " + age);
    }
}

class Doctor extends Person{
    String specialization;
    int salary;

    @Override
    void displayInfo(){
        System.out.println("===== Doctor =====");
        super.displayInfo();
        System.out.println("Specialization: " +specialization);
        System.out.println("Salary: " + salary);
        System.out.println("Dr. "+ name + " is performing " + specialization);
    }
}

class  Patient extends Person{
    String disease;
    int roomNumber;

    @Override
    void displayInfo(){
        System.out.println(" ");
        System.out.println("===== Patient =====");
        super.displayInfo();
        System.out.println("Disease: " + disease);
        System.out.println("RoomNumber: " + roomNumber);
        System.out.println(name +" is admitted in room " + roomNumber);
    }



}

class  Nurse extends Person{
    String department;
    String shift;

    @Override
    void displayInfo(){
        System.out.println(" ");
        System.out.println("===== Nurse =====");
        super.displayInfo();
        System.out.println("Department: " + department);
        System.out.println("Shift: " + shift);
        System.out.println("Nurse " +  name +" is attending the patient.");
    }

}

