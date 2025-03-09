package example.src.main.java.com.oracle.database.spring.jsonduality;

public class Enrollment {
    private String _id;
    private Course course;

    public Enrollment() {}

    public Enrollment(String _id, Course course) {
        this._id = _id;
        this.course = course;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Enrollment{" +
                "_id='" + _id + '\'' +
                ", course=" + course +
                '}';
    }
}