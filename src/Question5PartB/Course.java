package Question5PartB;

public class Course implements Registrable {
    private String courseCode;
    private String courseTitle;
    private String instructor;
    static String semester;

    public Course(String courseCode, String courseTitle, String instructor) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructor = instructor;
    }

    @Override
    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public String getCourseTitle() {
        return courseTitle;
    }

    public static void  setSemester (String year){
        semester = year;
    }

    @Override
    public void displayCourseInfo() {
        System.out.println("=== Registered Courses === ");
        System.out.println("Course code: " + courseCode);
        System.out.println("Course Title: " + courseTitle );
        System.out.println("Instructor: " + instructor);
        System.out.println("semester: " + semester);
        System.out.println("--------------------------");

    }
}
