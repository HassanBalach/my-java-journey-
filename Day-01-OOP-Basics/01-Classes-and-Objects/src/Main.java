//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       //First Object
       Student oneClass = new Student();
       oneClass.id = 1;
       oneClass.name = "HassanBalach";
       oneClass.fatherName =  "BalachKhan";
       oneClass.course = "BSCS";
       oneClass.attendance();


        // WHat if I want to make another object in the Student CLass Here is what we do:
        // Second Object
        Student twoClass = new Student();
        twoClass.id = 2;
        twoClass.name = "Jahanzaib Tariq";
        twoClass.fatherName = "Shahbaz Tariz";
        twoClass.course = "BSAI";
        twoClass.attendance();
    }
}