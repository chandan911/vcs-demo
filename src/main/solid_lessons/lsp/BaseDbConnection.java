package solid_lessons.lsp;

import solid_lessons.srp.User;

public interface BaseDbConnection {
  Boolean save(User user);
  User getUser();
}
