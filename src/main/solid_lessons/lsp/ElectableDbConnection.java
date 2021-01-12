package solid_lessons.lsp;

public interface ElectableDbConnection {
  Boolean electNewPrimary(); //This is required only for Mongo
}
