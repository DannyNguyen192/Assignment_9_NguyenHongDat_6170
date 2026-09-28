package nguyenhongdat_6170;

import java.util.ArrayList;

public class CourseArrayList {

    private ArrayList<Course> courses = new ArrayList<>();

    public void addCourseToList(Course course) {
        courses.add(course);
    }

    public Course findCourse(String id) {
        for (Course course : courses) {
            if (course.getId().equals(id)) {
                return course;
            }
        }
        return null;
    }

    public void updateCourseById(String id) {
        Course course = findCourse(id);
        if (course == null) {
            System.out.println("course not found");
        } else {
            course.updateCourse();
            System.out.println("update complete");
        }
    }

    public void deleteCourseById(String id) {
        Course course = findCourse(id);
        if (course == null) {
            System.out.println("course not found");
        } else {
            courses.remove(course);
            System.out.println("delete complete");
        }
    }

    public void displayAllCourses() {
        if (!courses.isEmpty()) {
            for (Course course : courses) {
                course.displayDetails();
            }
        } else {
            System.out.println("empty list");
        }
    }

    public void displayAvailableCourse() {
        System.out.println("AVAILABLE COURSE: ");
        for (Course course : courses) {
            if (course.isIsAvailable()) {
                course.displayDetails();
            }
        }
    }

    public double calculateTotalFee() {
        double total = 0;
        for (Course course : courses) {
            total += course.calculateTotalFee();
        }
        return total;
    }
}
