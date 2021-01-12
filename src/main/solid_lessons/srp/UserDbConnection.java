package solid_lessons.srp;

public class UserDbConnection {
  public Boolean save(User user) {
    return true;
  }

  public User getUser(String email) {
    return new User("", email, "");
  }
}
