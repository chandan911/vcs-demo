package solid_lessons.ocp;

public class PaymentProcessor {

  public Boolean pay(String paymentMethodFromRequest) {
    PaymentMethod paymentMethod = PaymentMethodFactory.getPaymentMethod(paymentMethodFromRequest);
    return paymentMethod.pay();
  }
}
