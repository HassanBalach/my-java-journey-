//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
   /*     Car car = new Car();
        car.Speed = 223;
        car.carEngine = 225;
        car.doorQantity = 2;
        car.carColor = "Red";
//        car.displayCar();

        //Trying to use MultiLevelInheritance:
        ElectricCar ec =  new ElectricCar();
        ec.carColor = "Yellow";
        ec.Speed = 240;
        ec.carEngine = 120;
        ec.doorQantity = 2;
        ec.electricCarDetail();
*/

        Doctor doctor = new Doctor();
        doctor.name = "Hassan";
        doctor.age = 35;
        doctor.specialization = "surgery";
        doctor.salary = 120000;
        doctor.displayInfo();

        Patient patient = new Patient();
        patient.name = "Adnan";
        patient.roomNumber =  102;
        patient.age = 23;
        patient.disease = "Fever";
        patient.displayInfo();

        Nurse nurse = new Nurse();
        nurse.name = "Sarah";
        nurse.age = 28;
        nurse.shift = "Night";
        nurse.department = "ICU";
        nurse.displayInfo();
    }
}