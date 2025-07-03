package Question4;

public class Subject {
    private String subjectCode;
    private String subjectName;
    Teacher teachers;

    public Subject(String subjectCode, String subjectName) {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setTeachers(Teacher teachers) {
        this.teachers = teachers;
    }

    public void displaySubjectDetails() {
        System.out.println("Assigned Subjects");
        System.out.println("Subject code:  " + subjectCode);
        System.out.println("subject  Name: " + subjectName);
        System.out.println("Assigned Teacher:  " + teachers.getTeacherName());
        System.out.println();
        System.out.println("Subject code: " + subjectCode);
        System.out.println("Subject Name: " + subjectName);



    }

}


