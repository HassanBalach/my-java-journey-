//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Uni_Student s1 = new Uni_Student(
                1 , "HassanBalach", 7, 12600
        );
        s1.enrollment();

        Uni_Student s2 = new Uni_Student(2 , "Jahanzaib" ,8 , 120000 );
        s2.enrollment();

        Uni_Student s3 = new Uni_Student(3, "Kamran Balach" ,  5 , 1500);
        s3.enrollment();
    }
}