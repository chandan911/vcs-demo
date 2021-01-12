package solid_lessons.srp;

public class UserRepository {
  private UserDbConnection userDbConnection;

  public Boolean save(User user) {
    return userDbConnection.save(user);
  }

  public User getUser(String email) {
    return new User("", email, "");
  }
}
