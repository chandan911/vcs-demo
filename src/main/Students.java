import java.util.ArrayList;
import java.util.Arrays;

public class Students {
    private String name;
    private ArrayList<Course> courses = new ArrayList<Course>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void addCourse(Course course){
        courses.add(course);
    }
    public int getTotalMarks(){
//        int totalCourse = courses.size();
//        int totalMarks = 0;
//        for(int i=0;i<totalCourse;i++){
//            totalMarks += courses.get(i).getMarks();
//        }
//        return totalMarks;
        return courses.stream().map(Course::getMarks).reduce(0, Integer::sum);
    }
    public int getAverage(){
        return getTotalMarks()/courses.size();
    }
}
