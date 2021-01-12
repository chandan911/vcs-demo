package solid_lessons.ocp;

public class PaytmPayment implements PaymentMethod {
  private String Address = "";

  @Override
  public Boolean pay() {
    return true;
  }
}
