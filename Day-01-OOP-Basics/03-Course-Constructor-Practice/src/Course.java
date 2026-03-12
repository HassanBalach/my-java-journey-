public class Course {
    int courseId;
    String courseName;
    int creditHours;
    String instructor;


    Course(int courseId , String courseName , int creditHours , String instructor){
        this.courseId = courseId;
        this.courseName = courseName;
        this.creditHours = creditHours;
        this.instructor = instructor;
    }

    void display(){
        System.out.println("Course ID:  " + courseId);
        System.out.println("Course Name: " + courseName);
        System.out.println("Course CreditHours:  " + creditHours);
        System.out.println("Course Instructor: " + instructor);
    }

}

