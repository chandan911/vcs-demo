import day2.Conection;
import day2.DBConnector;
import day2.HTTPConnector;
import day2.IOConnector;

public class VCSDemo {

  public static void main(String[] args) {

//    Students student = new Students();
//    student.setName("aamir");
//    student.addCourse(new Course(90,"math"));
//    student.addCourse(new Course(75,"English"));
//    System.out.println(student.getTotalMarks());
//    System.out.println(student.getAverage());
    IOConnector connector1 = new HTTPConnector();
    IOConnector connector2 = new DBConnector();
    Conection connection1 = connector1.getConnection();
    Conection connection2 = connector2.getConnection();
    connector1.timeout();
    connector2.timeout();

    System.out.println(connection1.getAddress());
    System.out.println(connection2.getAddress());

    connector1.removeConnection();
    connector2.removeConnection();
  }

}
