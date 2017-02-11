/**
 * Created by shithilboss on 2/8/17.
 */
public class Course implements Comparable<Course>{

    private String courseCode;
    private String courseTaitle;
    private double creditHourse;

    public Course (String courseCode,String courseTaitle,double creditHourse ){
        this.courseCode = courseCode;
        this.courseTaitle = courseTaitle;
        this.creditHourse = creditHourse;

    }

   /* public String getCourseTaitle(){
        return courseTaitle;
    }

    public  String getCourseCode(){
        return courseCode;
    }*/



    public String getCourseCode() {
        return courseCode;
    }
    public String getCourseTaitle() {
        return courseTaitle;
    }

    public double getCreditHourse() {
        return creditHourse;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setCourseTaitle(String courseTaitle) {
        this.courseTaitle = courseTaitle;
    }

    public void setCreditHourse(double creditHourse) {
        this.creditHourse = creditHourse;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseCode='" + courseCode + '\'' +
                ", courseTaitle='" + courseTaitle + '\'' +
                ", creditHourse=" + creditHourse +
                '}';
    }

    @Override
    public int compareTo(Course b) {
        Course a = this;

        if(a.courseTaitle.compareTo(courseTaitle) < 0)
            return -1;
        else if (a.courseTaitle.compareTo(courseTaitle) > 0)
            return  +1;
        else return 0;
    }
}
