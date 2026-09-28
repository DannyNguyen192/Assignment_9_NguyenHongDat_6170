package nguyenhongdat_6170;

import java.util.Date;
import java.util.Scanner;

public class OnlineCourse extends Course {

    private String platformName;
    private double discountPercent;

    public OnlineCourse() {
    }

    public OnlineCourse(String platformName, double discountPercent) {
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public OnlineCourse(String platformName, double discountPercent, String id, double feePerStudent, Date startDate, boolean isAvailable, int enrolledStudents) {
        super(id, feePerStudent, startDate, isAvailable, enrolledStudents);
        this.platformName = platformName;
        this.discountPercent = discountPercent;
    }

    public String getPlatformName() {
        return platformName;
    }

    public void setPlatformName(String platformName) {
        this.platformName = platformName;
    }

    public double getDiscountPercent() {
        return discountPercent;
    }

    public void setDiscountPercent(double discountPercent) {
        this.discountPercent = discountPercent;
    }

    @Override
    public void addCourse() {
        super.addCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter platform name: ");
        setPlatformName(sc.nextLine());
        System.out.print("enter discount percent: ");
        setDiscountPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void updateCourse() {
        super.updateCourse();
        Scanner sc = new Scanner(System.in);
        System.out.print("update platform name: ");
        setPlatformName(sc.nextLine());
        System.out.print("update discount percent: ");
        setDiscountPercent(Double.parseDouble(sc.nextLine()));
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("platform name: " + getPlatformName());
        System.out.println("discount percent: " + getDiscountPercent());
        System.out.println("total fee: " + calculateTotalFee());
        System.out.println("-----");
    }

    @Override
    public double calculateTotalFee() {
        return getFeePerStudent() * getEnrolledStudent() * (1 - getDiscountPercent() / 100);
    }

}
