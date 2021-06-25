package seven.design.principle.lawOfDemeter;

import java.util.List;

public class Employee {
    public void checkNumbeOfCourses(List<Course> courses) {
        System.out.println("目前已经发布的课程数量:" + courses.size());
    }
}
