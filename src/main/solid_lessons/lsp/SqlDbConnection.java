package solid_lessons.lsp;

import solid_lessons.srp.User;

public class SqlDbConnection implements BaseDbConnection, MigratableDbConnection {
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
  public Boolean migrate() {
    //Implementation
    return true;
  }

}
