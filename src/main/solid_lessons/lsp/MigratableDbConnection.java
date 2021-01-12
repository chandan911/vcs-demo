package solid_lessons.lsp;

import solid_lessons.srp.User;

public interface MigratableDbConnection {
  Boolean migrate(); //This is required only for Sql
}
