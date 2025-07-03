package Question5PartB;

public class Main {
    public static void main(String[] args) {

        Course.setSemester("Fall 2025");

        Course c1 = new Course("CS101","Introduction to Programming","Dr.Smith");
        Course c2 = new Course("MA201","Discrete Mathematics","Prof.johnson");
        Course c3 = new Course("CS202","Data structures","Dr,Lee");

        CourseManager courseManager = new CourseManager();
        courseManager.addCourse(c1);
        courseManager.addCourse(c2);
        courseManager.addCourse(c3);

        courseManager.displayAllCourses();



    }
}
