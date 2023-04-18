package model.services;

public class PaypalService implements OnlinePaymentService {
	
	@Override
	public Double interest(Double amount, Integer months) {
		return amount + amount * 0.01 * months;
	}

	@Override
	public Double paymentFee(Double amount) {
		Integer months;
		return 	(amount + amount * 0.01 * months) * 1.02;
		}
}
