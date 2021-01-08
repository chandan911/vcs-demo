public class VCSDemo {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
    /*Rectangle rectangle1 = new Rectangle(10, 5);
    Rectangle rectangle2 = new Rectangle();
    System.out.println(rectangle1.getLength());
    System.out.println(rectangle2.getLength());
    System.out.println(rectangle1.getArea());
    */
    Student student1 = new Student("Shubham", 70,80,90);
    Student student2 = new Student("Satyam");
    System.out.println("Total score of " + student1.getName()+ " is " + student1.getTotalScore());
    System.out.println("Average score of " + student1.getName()+ " is " +  student1.getAvgScore());
    System.out.println("Total score of " + student2.getName()+ " is " + student2.getTotalScore(10,20,30));
    System.out.println("Average score of " + student2.getName()+ " is " + student2.getAvgScore(10,20,30));
  }

}
