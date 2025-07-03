package Question5PartB;

import java.util.ArrayList;

public class CourseManager {
    ArrayList<Course> coursesList = new ArrayList<>();

    public void addCourse(Course c) {
        coursesList.add(c);
    }

    public void displayAllCourses() {
        for (Course c : coursesList){
            c.displayCourseInfo();
        }
    }
}
