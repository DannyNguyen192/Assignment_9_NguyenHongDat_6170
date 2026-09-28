package nguyenhongdat_6170;

import java.util.Date;
import java.util.Scanner;

public class OfflineCourse extends Course {

    private String classroomNumber;
    private double materialFeePerStudent;

    public OfflineCourse() {
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent) {
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public OfflineCourse(String classroomNumber, double materialFeePerStudent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.classroomNumber = classroomNumber;
        this.materialFeePerStudent = materialFeePerStudent;
    }

    public String getClassroomNumber() {
        return classroomNumber;
    }

    public void setClassroomNumber(String classroomNumber) {
        this.classroomNumber = classroomNumber;
    }

    public double getMaterialFeePerStudent() {
        return materialFeePerStudent;
    }

    public void setMaterialFeePerStudent(double materialFeePerStudent) {
        this.materialFeePerStudent = materialFeePerStudent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter classroom number: ");
        setClassroomNumber(sc.nextLine());
        System.out.print("enter material fee per student: ");
        setMaterialFeePerStudent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("update classroom number: ");
        setClassroomNumber(sc.nextLine());
        System.out.print("update material fee per student: ");
        setMaterialFeePerStudent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("classroom number: " + getClassroomNumber());
        System.out.println("material fee per student: " + getMaterialFeePerStudent());
        System.out.println("total fee: " + calculateTotalFee());
        System.out.println("-----");
    }

    @Override
    public double calculateTotalFee() {
        return getEnrolledStudent() * (getFeePerStudent() + getMaterialFeePerStudent());
    }

}
