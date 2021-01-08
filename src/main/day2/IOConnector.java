package day2;

public interface IOConnector {
  default void timeout() {
    System.out.println("ConnectionTimedOut");
    return;
  };

  Conection getConnection();
  void removeConnection();
}
