public class VCSDemo {

  public static void main(String[] args) {

    Students student = new Students();
    student.setName("aamir");
    student.addCourse(new Course(90,"math"));
    student.addCourse(new Course(75,"English"));
    System.out.println(student.getTotalMarks());
    System.out.println(student.getAverage());
  }

}
