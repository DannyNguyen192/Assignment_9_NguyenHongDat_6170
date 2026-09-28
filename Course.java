package nguyenhongdat_6170;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public abstract class Course implements ICourse {

    private String id;
    private double feePerStudent;
    private Date startDate;
    private boolean isAvailable;
    private int enrolledStudents;

    public Course() {
    }

    public Course(String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        this.id = id;
        this.feePerStudent = feePerStudent;
        this.startDate = startDate;
        this.isAvailable = isAvailable;
        this.enrolledStudents = enrolledStudents;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getFeePerStudent() {
        return feePerStudent;
    }

    public void setFeePerStudent(double feePerStudent) {
        this.feePerStudent = feePerStudent;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public int getEnrolledStudent() {
        return enrolledStudents;
    }

    public void setEnrolledStudent(int enrolledStudent) {
        this.enrolledStudents = enrolledStudent;
    }

    @Override
    public abstract double calculateTotalFee();

    @Override
    public void displayDetails() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("-----");
        System.out.println("id: " + getId());
        System.out.println("fee per student: " + getFeePerStudent());
        System.out.println("start date: " + sdf.format(getStartDate()));
        System.out.println("is available: " + isIsAvailable());
        System.out.println("enrolled students: " + getEnrolledStudent());
    }

    @Override
    public void updateCourse() {
        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("update id: ");
            setId(sc.nextLine());
            System.out.print("update fee per student: ");
            setFeePerStudent(Double.parseDouble(sc.nextLine()));
            System.out.print("update start date(dd/MM/yyyy): ");
            setStartDate(sdf.parse(sc.nextLine()));
            System.out.print("update is available: ");
            setIsAvailable(Boolean.parseBoolean(sc.nextLine()));
            System.out.print("update erolled students: ");
            setEnrolledStudent(Integer.parseInt(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }

    @Override
    public void addCourse() {
        try {
            Scanner sc = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            System.out.print("enter id: ");
            setId(sc.nextLine());
            System.out.print("enter fee per student: ");
            setFeePerStudent(Double.parseDouble(sc.nextLine()));
            System.out.print("enter start date(dd/MM/yyyy): ");
            setStartDate(sdf.parse(sc.nextLine()));
            System.out.print("enter is available: ");
            setIsAvailable(Boolean.parseBoolean(sc.nextLine()));
            System.out.print("enter erolled students: ");
            setEnrolledStudent(Integer.parseInt(sc.nextLine()));
        } catch (ParseException ex) {
            System.out.println(ex);
        }
    }

}
