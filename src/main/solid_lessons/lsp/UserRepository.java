package solid_lessons.lsp;

import solid_lessons.srp.User;

public class UserRepository {
  private BaseDbConnection userDbConnection = new MongoDbConnection();

  public Boolean save(User user) {
    return userDbConnection.save(user);
  }

  public User getUser() {
    return userDbConnection.getUser();
  }
}
