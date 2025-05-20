package Item.member;

import util.enumerate.Cenum;

public class Course {
    private Cenum course_type;
    public Course(Cenum course_type) {
        this.course_type = course_type;
    }

    public Cenum getCourse_type() {
        return course_type;
    }

    public void setCourse_type(Cenum course_type) {
        this.course_type = course_type;
    }
}
