package nguyenhongdat_6170;

import java.util.Scanner;

public class Processor {

    public static void main(String[] args) {
        CourseArrayList CourseAL = new CourseArrayList();
        Scanner sc = new Scanner(System.in);

        System.out.println("=====MENU=====");
        System.out.println("1. add course");
        System.out.println("2. update course");
        System.out.println("3. delete course");
        System.out.println("4. display all courses");
        System.out.println("5. display open courses");
        System.out.println("6. display total fees: ");
        System.out.println("0. exit");

        int option;

        do {
            System.out.print("enter option: ");
            option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 0:
                    return;
                case 1: {
                    System.out.print("enter tppe(1-Online / 2-Offline): ");
                    int type = Integer.parseInt(sc.nextLine());
                    if (type == 1) {
                        Course onl = new OnlineCourse();
                        onl.addCourse();
                        CourseAL.addCourseToList(onl);
                    } else {
                        Course off = new OfflineCourse();
                        off.addCourse();
                        CourseAL.addCourseToList(off);
                    }
                    break;
                }
                case 2: {
                    System.out.print("enter id to update: ");
                    String id = sc.nextLine();
                    CourseAL.updateCourseById(id);
                    break;
                }
                case 3: {
                    System.out.print("enter id to delete: ");
                    String id = sc.nextLine();
                    CourseAL.deleteCourseById(id);
                    break;
                }
                case 4: {
                    CourseAL.displayAllCourses();
                    break;
                }
                case 5: {
                    CourseAL.displayAvailableCourse();
                    break;
                }
                case 6: {
                    System.out.println("total fee: " + CourseAL.calculateTotalFee());
                    break;
                }
                default:
                    System.out.println("invalid option");
                    break;
            }
        } while (option != 0);
    }

}
