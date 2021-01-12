package solid_lessons.ocp;

public class PaymentProcessor {
  private String paymentAddress = "PaytmAddress";

  public Boolean pay(String paymentMethodFromRequest) {
    PaymentMethod paymentMethod = null;
    if (paymentMethodFromRequest.equals("Card")) {
      paymentMethod = new CardPayment();
    } else if (paymentMethodFromRequest.equals("Paytm")) {
      paymentMethod = new PaytmPayment();
    } else if (paymentMethodFromRequest.equals("Upi")) {
      paymentMethod = new UpiPayment();
    }
    return paymentMethod.pay();
  }
}
