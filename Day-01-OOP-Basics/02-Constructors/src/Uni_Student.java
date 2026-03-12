public class Uni_Student {
    int id;
    String StudentName;
    int StudentTotalClasses ;
    int semesterFee;


    //Constructor in java

    Uni_Student(int id, String StudentName, int StudentTotalClasses, int semesterFee ){
     this.id = id;
     this.StudentName = StudentName;
     this.StudentTotalClasses = StudentTotalClasses;
     this.semesterFee = semesterFee;

    }

    void enrollment(){
        System.out.println("Student_id: " + id);
        System.out.println("Student_Name: " + StudentName);
        System.out.println("Student total Selected Classes: "+ StudentTotalClasses);
        System.out.println("Student semester Fee: " + semesterFee);
        System.out.println(StudentName+ " is registered successsfully: ");
    }
}
