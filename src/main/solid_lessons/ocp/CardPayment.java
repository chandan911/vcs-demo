package solid_lessons.ocp;

public class CardPayment implements PaymentMethod {
  private String paymentAddress = "CARD_PAYMENT_ADDRESS";
  @Override
  public Boolean pay() {
    //Implementaion
    return true;
  }
}
