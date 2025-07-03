package Question4;

public class Teacher {
    private String teacherID;
    private String teacherName;
    Subject [] subjects;
    int subjectCount =0;

    public String getTeacherID() {
        return teacherID;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public Teacher(String teacherID, String teacherName) {
        this.teacherID = teacherID;
        this.teacherName = teacherName;
        this.subjects = new Subject[4];
    }
    public void addSubject(Subject subject) {
        if (subjectCount < 4){
            subjects [subjectCount++] = subject;
            subject.setTeachers(this);
        }
    }
    public void displayTeacherDetails(){
        System.out.println("Teacher ID: " + teacherID);
        System.out.println("Teacher Name: " + teacherName);
        System.out.println("Number of Assigned Subjects: " + subjectCount);
        System.out.println("Assigned Subjects");

        for (int i =0; i<subjectCount ; i++){
            subjects[i].displaySubjectDetails();
        }
    }
}
