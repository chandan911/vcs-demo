package solid_lessons.lsp;

import solid_lessons.srp.User;

public class MongoDbConnection implements BaseDbConnection, ElectableDbConnection {
  @Override
  public Boolean save(User user) {
    //Implementation
    return true;
  }

  @Override
  public User getUser() {
    //Implementation
    return null;
  }

  @Override
  public Boolean electNewPrimary() {
    //Implementation
    return true;
  }
}
