package example.src.main.java.com.oracle.database.spring.jsonduality;

public class Course {
    private String _id;
    private String name;
    private String description;
    private Integer credits;
    private LectureHall lecture_hall;

    public Course() {
    }

    public Course(String _id, String name, String description, Integer credits, LectureHall lecture_hall) {
        this._id = _id;
        this.name = name;
        this.description = description;
        this.credits = credits;
        this.lecture_hall = lecture_hall;
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getCredits() {
        return credits;
    }

    public void setCredits(Integer credits) {
        this.credits = credits;
    }

    public LectureHall getLecture_hall() {
        return lecture_hall;
    }

    public void setLecture_hall(LectureHall lecture_hall) {
        this.lecture_hall = lecture_hall;
    }

    @Override
    public String toString() {
        return "Course{" +
                "_id='" + _id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", credits=" + credits +
                ", lecture_hall=" + lecture_hall +
                '}';
    }
}