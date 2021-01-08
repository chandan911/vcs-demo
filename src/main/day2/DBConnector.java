package day2;

public class DBConnector implements IOConnector {
  @Override
  public Conection getConnection() {
    return new DBConnection();
  }

  @Override
  public void removeConnection() {
    return;
  }
}
