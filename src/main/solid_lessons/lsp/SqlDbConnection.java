package solid_lessons.lsp;

import solid_lessons.srp.User;

public class SqlDbConnection implements UserDbConnection {
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
}
