import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by shithilboss on 2/1/17.
 */
public class LamdaDemo {

    public static void main(String[] args) {
        List<String> stringsList = new ArrayList<>();
        stringsList.add("Java");
        stringsList.add("C");
        stringsList.add("Python");
        stringsList.add("Ruby");
        stringsList.add("Basic");
        Collections.sort(stringsList);
        for (String s : stringsList)
            System.out.println(s);

       ArrayList<Course> CourseList = new ArrayList<>();
        CourseList.add(new Course("CSE5011", "criptography", 3.0));
        CourseList.add(new Course("CSE7048", "Java Lab", 1.0));
        CourseList.add(new Course("CSE3011", "physics", 3.0));
        CourseList.add(new Course("CSE2011", "Math", 3.0));
        CourseList.add(new Course("CSE4048", "Advanced Java Lab", 1.0));
        CourseList.add(new Course("CSE4047", "Advanced Java", 3.0));

        Collections.sort(CourseList, new Comparator<Course>() {
            @Override
            public int compare(Course o1, Course o2) {
                return o1.getCourseTaitle().compareTo(o2.getCourseTaitle());
            }
        });
        //lamda expression
        //Collections.sort(CourseList, (c1, c2) -> c1.getCourseCode().compareTo(c2.getCourseCode()));

        for (Course c : CourseList)
            System.out.println(c);
    }


}
