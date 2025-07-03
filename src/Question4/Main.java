package Question4;

public class Main {
    public static void main(String[] args) {

        Subject s1 = new Subject("MAT101","Mathematics");
        Subject s2 = new Subject("PHY101","Physics");
        Subject s3 = new Subject("CHE101","Chemistry");
        Subject s4  = new Subject("BI0101","Biology");

        Teacher t1 = new Teacher("T001","DR.Alice johnson");

        t1.addSubject(s1);
        t1.addSubject(s2);
        t1.addSubject(s3);
        t1.addSubject(s4);

        t1.displayTeacherDetails();
        s1.displaySubjectDetails();



    }
}
