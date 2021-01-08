package day2;

public class HTTPConnector implements IOConnector {
  @Override
  public Conection getConnection() {
    return new HTTPConnection();
  }

  @Override
  public void removeConnection() {
    return;
  }
}
