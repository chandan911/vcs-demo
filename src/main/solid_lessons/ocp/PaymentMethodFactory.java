package solid_lessons.ocp;

public class PaymentMethodFactory {

  public static PaymentMethod getPaymentMethod(String paymentMethodFromRequest) {
    if (paymentMethodFromRequest.equals("Card")) {
      return new CardPayment();
    } else if (paymentMethodFromRequest.equals("Paytm")) {
      return new PaytmPayment();
    } else if (paymentMethodFromRequest.equals("Upi")) {
      return new UpiPayment();
    } else {
      throw new RuntimeException("Payment method not supported");
    }
  }

}
