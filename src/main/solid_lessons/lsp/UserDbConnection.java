package solid_lessons.lsp;

import solid_lessons.srp.User;

public interface UserDbConnection {
  Boolean save(User user);
  User getUser();
}
