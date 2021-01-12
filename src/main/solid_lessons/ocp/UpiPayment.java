package solid_lessons.ocp;

public class UpiPayment implements PaymentMethod {

  @Override
  public Boolean pay() {
    return true;
  }
}
